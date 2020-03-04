package com.example.talkandplay;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.talkandplay.Favorite.FavoriteFragment;
import com.example.talkandplay.Hot.HotFragment;
import com.example.talkandplay.IntramuralNews.IntramuralNewsFragment;
import com.example.talkandplay.Question.QuestionBulltinsFragment;
import com.example.talkandplay.RealTime.RealTimeFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        Fragment favoriteFragment = new FavoriteFragment();
        Fragment realtimeFragment = new RealTimeFragment();
        Fragment hotFragment = new HotFragment();
        Fragment intramuralNewsFragment= new IntramuralNewsFragment();
        Fragment questionBulltinsFragment = new QuestionBulltinsFragment();

        fragmentManager.beginTransaction().replace(R.id.fragment, questionBulltinsFragment).commit();
    }
}
