package com.cafe.max.exam_final;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class PersonnagesView extends Fragment {

    private List<PersonnageFragment> personnageFragments;
    private List<Integer> imagesId = new ArrayList<>();
    private PersonnagesAdapter adapter;
    private ViewPager vp;
    private CustomView drawView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.fragment_personnages_view, container, false);
        ViewPager pager = result.findViewById(R.id.viewPager);

        Service service = new Service();
        service.startList();
        personnageFragments = new ArrayList<>();
        for (Personnage personnage: service.getJoueurs()) {
            PersonnageFragment imgFrag = new PersonnageFragment();
            imgFrag.setImageID(personnage.getIdLayout());
            imgFrag.setNomText(personnage.getNom());
            imgFrag.setProfessionText(personnage.getProfession());
            personnageFragments.add(imgFrag);
        }

        adapter = new PersonnagesAdapter(getFragmentManager(), personnageFragments);


        vp = result.findViewById(R.id.viewPager);
        vp.setAdapter(adapter);

        //drawView = result.findViewById(R.id.viewX);
        //drawView.setColor(Color.RED);

        return(result);
    }



}
