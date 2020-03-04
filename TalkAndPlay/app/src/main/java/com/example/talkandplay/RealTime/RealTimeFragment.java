package com.example.talkandplay.RealTime;

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

public class RealTimeFragment extends Fragment {

    private RealTimeBulletinsAdapter adapter;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView =  (ViewGroup) inflater.inflate(R.layout.fragment_real_time, container, false);

        ArrayList<RealTimeBulletinsModel> items = new ArrayList<>();

        items.add(new RealTimeBulletinsModel("익명","03/02 17:21",
                "아싸라서 개강연기+원격강의 환영한다", "조용히 추천..",
                "자유게시판", 90, 7));

        items.add(new RealTimeBulletinsModel("익명","03/02 17:08",
                "아니 개강을 늦출거면 일괄적으로 강제성을 부여하던가", "지금 16일 이후 공지 없는것도 없는건데\n" +
                "16일로 개강 미뤘는데 어떤 강의는 맘대로 지금부터 수업하려고 하는 것 같다.",
                "자유게시판", 60, 7));

        recyclerView = rootView.findViewById(R.id.realtime_bulletins_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new RealTimeBulletinsAdapter(getContext(), items);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
