package com.example.mohamed.mobilebanking_01.Model;

/**
 * Created by mohamed on 29/03/15.
 */
public class Retrait extends  Mouvement {
    private int id_retrait;

    public Retrait(int id_mouvement, String ref_mouvement, String date_mouvement, String type_mouvement, String desc_mouvement, int id_compte_foreign, int id_retrait) {
        super(id_mouvement, ref_mouvement, date_mouvement, type_mouvement, desc_mouvement, id_compte_foreign);
        this.id_retrait = id_retrait;
    }

    public int getId_retrait() {
        return id_retrait;
    }

    public void setId_retrait(int id_retrait) {
        this.id_retrait = id_retrait;
    }
}
