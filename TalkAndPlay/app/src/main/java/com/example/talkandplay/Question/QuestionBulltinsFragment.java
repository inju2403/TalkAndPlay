package com.example.talkandplay.Question;

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

public class QuestionBulltinsFragment extends Fragment {
    private QuestionBulltinsAdapter adapter;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_question_bulltins, container, false);


        ArrayList<QuestionBulltinsModel> items = new ArrayList<>();

        items.add(new QuestionBulltinsModel("CG관련 진로 생기부 어떻게 채울까요",
                "○○대 글로벌미디어 준비하고 있고 꼭 가고싶은데요! 진로가 CG쪽이라 생기부를 어떤식으로 채워야 할지 감이 안오네요",
                "글로벌미디어학부, 입시"));
        items.add(new QuestionBulltinsModel("법학과",
                "법학과 수능으로 들어가려면 국/영/수/한/생윤/정법 최소 몇등급 나와야하나요???? 전 지금 영어 수학이 좀 부족해요...",
                "법학과, 입시"));
        items.add(new QuestionBulltinsModel("수시지원할때",
                "6개 대학 수시지원할때 무조건 다 같은 과를 넣는것보다 성적에 맞는 과를 섞는게 더 효율적일까요??",
                "입시"));

        recyclerView = rootView.findViewById(R.id.question_bulletins_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new QuestionBulltinsAdapter(getContext(), items);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
