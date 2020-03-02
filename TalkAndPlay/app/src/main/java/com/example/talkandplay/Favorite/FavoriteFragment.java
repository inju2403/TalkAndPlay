package com.example.talkandplay.Favorite;

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

public class FavoriteFragment extends Fragment {

    private FavoriteBulletinsAdapter adapter;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_favorite, container, false);

        ArrayList<FavoriteBulletinsModel> items = new ArrayList<>();
        items.add(new FavoriteBulletinsModel("자유게시판","싸강??"));
        items.add(new FavoriteBulletinsModel("비밀게시판","곧삭글) 바지 핏좀 봐주세오.."));
        items.add(new FavoriteBulletinsModel("졸업생게시판","평소에 책을 많이 안 읽어와서 그러는데 도움좀 주실 분을 찾습니다."));
        items.add(new FavoriteBulletinsModel("정보게시판","Notissu iOS 1.3.3 업데이트 알림"));
        items.add(new FavoriteBulletinsModel("취업·진로","<게임개발> 디자이너 구합니다"));
        items.add(new FavoriteBulletinsModel("홍보게시판","2020년도 1학기"));
        items.add(new FavoriteBulletinsModel("동아리·학회","일정변경"));

        recyclerView = rootView.findViewById(R.id.favorite_bulletins_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new FavoriteBulletinsAdapter(getContext(), items);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
