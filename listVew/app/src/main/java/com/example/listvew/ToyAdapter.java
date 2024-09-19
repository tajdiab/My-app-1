package com.example.listvew;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ToyAdapter extends ArrayAdapter<Toy> {
Context context;
ArrayList<Toy> objects;
    public ToyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Toy> objects) {
        super(context, resource, objects);
        this.context=context;
        this.objects=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=null;





        return view;




    }
}
