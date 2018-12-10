package com.cafe.max.exam_final;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;

public class MyTimerTask extends AsyncTask<Void, Void, Void> {

    public interface MonTimerInterface {
        void onGameBegin();
    }

    int delay;
    FragmentManager fragmentManager;
    public MyTimerTask(int delay, FragmentManager fragmentManager){
        this.delay = delay;
        this.fragmentManager = fragmentManager;
    }
    protected Void doInBackground(Void... voids) {
        while(true){
            try{
                Thread.sleep(delay);
                Alerte alerte = new Alerte();
                alerte.show(fragmentManager,"tag");
            } catch(Exception e) {}
        }
    }

    public static class Alerte extends DialogFragment {
        @NonNull
        @Override
        public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
            super.onCreateDialog(savedInstanceState);
            final View v = LayoutInflater.from(getActivity()).inflate(R.layout.fin_souper, null);

            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            };

            return new AlertDialog.Builder(getActivity()).setView(v).create();
        }
    }
}