package com.example.talkandplay.IntramuralNews;

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

public class IntramuralNewsFragment extends Fragment {

    private IntramuralNewsBulletinsAdapter adapter;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_intramural_news, container, false);


        ArrayList<IntramuralNewsBulletinsModel> items = new ArrayList<>();

        items.add(new IntramuralNewsBulletinsModel("○○대학교 방송국", "03/02 21:51",
                "[3월 미니 뉴스]\n" + "-\n" + "내용", "○○대학교 방송국", 2, 0));
        items.add(new IntramuralNewsBulletinsModel("ssizennet", "03/01 21:10",
                "안녕하십니까, ○○대학교 인터넷방송국 씨즌넷의 [○○대의 발로 뛰는 놈들] 제작진 일동입니다.",
                "인터넷방송국 씨즌넷", 15, 8));

        recyclerView = rootView.findViewById(R.id.intramural_news_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new IntramuralNewsBulletinsAdapter(getContext(), items);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
