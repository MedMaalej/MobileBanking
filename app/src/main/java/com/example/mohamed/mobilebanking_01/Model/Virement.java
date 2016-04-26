package com.example.mohamed.mobilebanking_01.Model;

/**
 * Created by mohamed on 29/03/15.
 */
public class Virement extends Mouvement {
    private int id_virement;
    private int id_compte_virement;

    public Virement(int id_mouvement, String ref_mouvement, String date_mouvement, String type_mouvement, String desc_mouvement, int id_compte_foreign, int id_compte_virement, int id_virement) {
        super(id_mouvement, ref_mouvement, date_mouvement, type_mouvement, desc_mouvement, id_compte_foreign);
        this.id_compte_virement = id_compte_virement;
        this.id_virement = id_virement;
    }

    public int getId_virement() {
        return id_virement;
    }

    public void setId_virement(int id_virement) {
        this.id_virement = id_virement;
    }

    public int getId_compte_virement() {
        return id_compte_virement;
    }

    public void setId_compte_virement(int id_compte_virement) {
        this.id_compte_virement = id_compte_virement;
    }
}
