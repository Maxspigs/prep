package com.cafe.max.exam_final;

public class Arme {

    private int idLayout;
    private String description;
    private boolean isChecked;

    public Arme(int idLayout, String description) {
        this.idLayout = idLayout;
        this.description = description;
    }


    public int getIdLayout() {
        return idLayout;
    }

    public void setIdLayout(int idLayout) {
        this.idLayout = idLayout;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
