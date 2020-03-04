package com.example.talkandplay.Hot;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.talkandplay.R;

import java.util.ArrayList;

public class HotFragment extends Fragment {

    private HotBulletinsAdapter adapter;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_hot, container, false);

        ArrayList<HotBulletinsModel> items = new ArrayList<>();

        items.add(new HotBulletinsModel("서양미술의이론과실제 과제 미쳤어;", "03/02", 14, 20));
        items.add(new HotBulletinsModel("아 싸강해요", "03/02", 19, 9));
        items.add(new HotBulletinsModel("선한 영향력(코로나19)", "03/02", 14, 2));
        items.add(new HotBulletinsModel("대학교 개강 연기에 따른 등록금 인하 청원입니다", "03/02", 29, 0));

        recyclerView = rootView.findViewById(R.id.hot_bulletins_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new HotBulletinsAdapter(getContext(), items);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
