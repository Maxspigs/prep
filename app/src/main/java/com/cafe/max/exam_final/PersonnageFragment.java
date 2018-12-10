package com.cafe.max.exam_final;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;


public class PersonnageFragment extends Fragment {
    private ImageView imageView;
    private TextView nom;
    private TextView profession;
    private int imgID;

    private String nomText = "";
    private String professionText = "";

    public PersonnageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_personnage, container, false);
        imageView =  v.findViewById(R.id.imageView);
        profession = v.findViewById(R.id.profession);
        nom = v.findViewById(R.id.nomPerso);
        profession.setText(professionText);
        nom.setText(nomText);


        imageView.setImageResource(imgID);

        return v;
    }

    public void setImageID(int imgID) {
        this.imgID = imgID;
    }

    public void setNomText(String nom) {
        this.nomText = nom;
    }

    public void setProfessionText(String profession) {
        this.professionText = profession;
    }
}
