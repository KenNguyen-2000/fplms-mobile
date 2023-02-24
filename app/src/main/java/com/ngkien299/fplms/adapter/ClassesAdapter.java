package com.ngkien299.fplms.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.ngkien299.fplms.R;
import com.ngkien299.fplms.activity.ClassDetailActivity;
import com.ngkien299.fplms.model.ClassModel;

import java.util.ArrayList;

public class ClassesAdapter extends RecyclerView.Adapter<ClassesAdapter.ClassItemHolder> {
    private ArrayList<ClassModel> classList;
    private LayoutInflater mInflater;

    public ClassesAdapter(Context context, ArrayList<ClassModel> classList){
         mInflater = LayoutInflater.from(context);
        this.classList = classList;
    }


    @NonNull
    @Override
    public ClassesAdapter.ClassItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mItemView = mInflater.inflate(R.layout.class_item, parent, false);
        ClassItemHolder classHolder = new ClassItemHolder(mItemView, this, parent.getContext());
        return classHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ClassesAdapter.ClassItemHolder holder, int position) {
        ClassModel currentClass = classList.get(position);
        holder.classNameView.setText(currentClass.getName());
    }

    @Override
    public int getItemCount() {

        return classList.size();
    }


    public class ClassItemHolder extends ViewHolder implements View.OnClickListener {
        private TextView classNameView;
        private ClassesAdapter mAdapter;
        private Context context;


        public  ClassItemHolder(View itemView, ClassesAdapter adapter, Context context){
            super(itemView);

            classNameView = itemView.findViewById(R.id.tv_className);
            this.mAdapter = adapter;
            this.context = context;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if(position != RecyclerView.NO_POSITION){
                ClassModel newClass = classList.get(position);
                Intent intent = new Intent(context, ClassDetailActivity.class);

                intent.putExtra("classData", newClass);
                context.startActivity(intent);
            }
        }
    }
}
