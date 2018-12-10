package com.cafe.max.exam_final;

import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Personnage> joueurs;
    List<Arme> armes;

    public Service() {
        joueurs = new ArrayList<>();
        armes = new ArrayList<>();
    }

    public void initPersonnes(){
        joueurs.add(new Personnage(R.drawable.marcelferrius,"Marcel Ferrius", "Agent Impôt Canada"));
        joueurs.add(new Personnage(R.drawable.danielleharris,"Danielle Harris", "Esthéticienne"));
        joueurs.add(new Personnage(R.drawable.simonsekorrec, "Simon Sékorrec", "Colporteur"));
        joueurs.add(new Personnage(R.drawable.theodorevereux,"Théodore Landry", "Propriétaire véreux"));
        joueurs.add(new Personnage(R.drawable.eleven,"Suzanne Saint-Onges", "Petite peste fâchée"));
    }

    public void initArmes() {
        armes.add(new Arme(R.drawable.raid,"Vaporisateur Raid pour guêpes et frelons"));
        armes.add(new Arme(R.drawable.buche,"Bûche de bois de chêne naturel garanti sans insectes"));
        armes.add(new Arme(R.drawable.stylovert, "Stylo vert gel"));
        armes.add(new Arme(R.drawable.tracteur,"Tracteur du voisin"));
        armes.add(new Arme(R.drawable.ferafriser,"Fer à friser Beoncé Wild"));
        armes.add(new Arme(R.drawable.ventilateur,"Ventilateur vintage en cuivre et laiton brossé"));
        armes.add(new Arme(R.drawable.tailleongles,"Taille ongles à batteries de chez aliexpress.com"));
    }

    public void startList(){
        initPersonnes();
        initArmes();
    }

    public List<Personnage> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Personnage> joueurs) {
        this.joueurs = joueurs;
    }

    public List<Arme> getArmes() {
        return armes;
    }

    public void setArmes(List<Arme> armes) {
        this.armes = armes;
    }
}
