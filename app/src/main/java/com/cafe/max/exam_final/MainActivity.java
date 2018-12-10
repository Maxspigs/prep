package com.cafe.max.exam_final;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyTimerTask.MonTimerInterface {

    CustomView drawView;
    List<Fragment> fragments;
    MyTimerTask task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onGameBegin();
        fragments = new ArrayList<>();

        PersonnagesView personnagesView = new PersonnagesView();
        ArmeFragment armes = new ArmeFragment();
        fragments.add(personnagesView);
        fragments.add(armes);


        List<String> titres = new ArrayList<>();

        titres.add("Personnage");
        titres.add("Arme");


        MystereAdapter adapter =
                new MystereAdapter(getSupportFragmentManager(), fragments, titres);

        ViewPager vp = findViewById(R.id.viewPagerArmes);
        vp.setAdapter(adapter);

        TabLayout tl = findViewById(R.id.tabLayout);
        tl.setupWithViewPager(vp);

        //drawView = findViewById(R.id.viewX);



    }

    @Override
    public void onGameBegin() {
        task = new MyTimerTask(10000,getSupportFragmentManager());
        task.execute();
    }
}
