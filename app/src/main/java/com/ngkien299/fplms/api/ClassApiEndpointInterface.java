package com.ngkien299.fplms.api;


import androidx.annotation.NonNull;

import com.ngkien299.fplms.model.ClassModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ClassApiEndpointInterface {
    public static final String USER_BASE_URL = "https://virtserver.swaggerhub.com/trannhathoang8678/plms_management/1.0.0";
    ClassApiEndpointInterface myService = new Retrofit.Builder().baseUrl(USER_BASE_URL).addConverterFactory(ScalarsConverterFactory.create()).build().create(ClassApiEndpointInterface.class);



    @NonNull
    @GET("classes")
    Call<List<ClassModel>> getClasses();

    @GET("classes/{classId}")
    Call<ClassModel> getClassById(@Path("classId") String classId);

    @GET("classes/student")
    Call<List<ClassModel>> getListBySearch(@Query("search") String search);

    @PUT("classes")
    Call<ClassModel> updateClass(@Body ClassModel updatedClassModel);

    @POST("classes")
    Call<ClassModel> createClass(@Body ClassModel newClassModel);

    @DELETE("classes/{classId}")
    Call<ClassModel> deleteClassById(@Path("classId") String classId);

    @POST("classes/{classId}/enroll")
    Call<ClassModel> enrollStudentToClass(@Path("classId") String classId, @Body String enrollKey);
}
