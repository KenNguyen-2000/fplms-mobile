package com.ngkien299.fplms.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ngkien299.fplms.R;
import com.ngkien299.fplms.adapter.ClassesAdapter;
import com.ngkien299.fplms.model.ClassModel;

import java.util.ArrayList;
import java.util.LinkedList;

public class ClassActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView rcvClassList;
    private ClassesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);

        toolbar = (Toolbar) findViewById(R.id.myToolBar);

        rcvClassList = findViewById(R.id.rcv_classList);
        adapter = new ClassesAdapter(ClassActivity.this, generateClassList());

        rcvClassList.setAdapter(adapter);

        adapter.notifyDataSetChanged();
        rcvClassList.setHasFixedSize(true);
        rcvClassList.setLayoutManager(new LinearLayoutManager(ClassActivity.this));

        setSupportActionBar(toolbar);
    }

    private ArrayList<ClassModel> generateClassList(){
        ArrayList<ClassModel> classList = new ArrayList<>();

        classList.add(new ClassModel("1", "123", "ClassModel 1", "SP21", "SWP391", 2));
        classList.add(new ClassModel("2", "123", "ClassModel 1", "SP21", "SWP391", 2));
        classList.add(new ClassModel("3", "123", "ClassModel 1", "SP21", "SWP391", 2));
        classList.add(new ClassModel("4", "123", "ClassModel 1", "SP21", "SWP391", 2));
        classList.add(new ClassModel("5", "123", "ClassModel 1", "SP21", "SWP391", 2));
        classList.add(new ClassModel("6", "123", "ClassModel 1", "SP21", "SWP391", 2));
        classList.add(new ClassModel("7", "123", "ClassModel 1", "SP21", "SWP391", 2));


        return classList;
    }
}