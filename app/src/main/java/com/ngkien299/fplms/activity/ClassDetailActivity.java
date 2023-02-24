package com.ngkien299.fplms.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.ngkien299.fplms.R;
import com.ngkien299.fplms.model.ClassModel;

public class ClassDetailActivity extends AppCompatActivity {
    private ClassModel mClass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_detail);

        mClass = (ClassModel) getIntent().getSerializableExtra("classData");
        handleClassInfo(mClass);
    }

    private void handleClassInfo(ClassModel paramClass){
        if(paramClass != null){
            Toast.makeText(ClassDetailActivity.this, "Class Name: " + paramClass.getName(), Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(ClassDetailActivity.this, "Not found class!", Toast.LENGTH_LONG).show();
        }
    }
}