package com.example.mohamed.mobilebanking_01.Model;

/**
 * Created by mohamed on 29/03/15.
 */
public class Chequier {
    private int id_chequier;
    private String ref_chequier;
    private int nbr_chequier;
    private int nbrCheques_chequier;
    private int id_compte_foreign;

    public Chequier(int id_chequier, String ref_chequier, int nbr_chequier, int nbrCheques_chequier, int id_compte_foreign) {
        this.id_chequier = id_chequier;
        this.ref_chequier = ref_chequier;
        this.nbr_chequier = nbr_chequier;
        this.nbrCheques_chequier = nbrCheques_chequier;
        this.id_compte_foreign = id_compte_foreign;
    }

    public int getId_chequier() {
        return id_chequier;
    }

    public void setId_chequier(int id_chequier) {
        this.id_chequier = id_chequier;
    }

    public String getRef_chequier() {
        return ref_chequier;
    }

    public void setRef_chequier(String ref_chequier) {
        this.ref_chequier = ref_chequier;
    }

    public int getNbr_chequier() {
        return nbr_chequier;
    }

    public void setNbr_chequier(int nbr_chequier) {
        this.nbr_chequier = nbr_chequier;
    }

    public int getNbrCheques_chequier() {
        return nbrCheques_chequier;
    }

    public void setNbrCheques_chequier(int nbrCheques_chequier) {
        this.nbrCheques_chequier = nbrCheques_chequier;
    }

    public int getId_compte_foreign() {
        return id_compte_foreign;
    }

    public void setId_compte_foreign(int id_compte_foreign) {
        this.id_compte_foreign = id_compte_foreign;
    }
}
