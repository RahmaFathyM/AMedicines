package com.example.mymedicines;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class disks1 extends Fragment {

    public disks1() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.disks,container,false);
        RecyclerView recyclerView1 =view.findViewById(R.id.drec);
        ArrayList <item> arrayList1=new ArrayList<>();
        arrayList1.add(new item(R.drawable.ic_launcher_background,"Medicine name"));
        arrayList1.add(new item(R.drawable.ic_launcher_background,"jgvfv"));
        arrayList1.add(new item(R.drawable.ic_launcher_background,"jgvfv"));
        arrayList1.add(new item(R.drawable.ic_launcher_foreground,"jgvfv"));
        DisksAdapter disksAdapter=new DisksAdapter(arrayList1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setAdapter(disksAdapter);
        return view;

    }
}
