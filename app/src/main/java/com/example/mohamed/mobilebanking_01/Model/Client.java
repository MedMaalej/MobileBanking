package com.example.mohamed.mobilebanking_01.Model;

/**
 * Created by mohamed  and ahmed on 29/03/15.
 * Naming convention:
 * datbaseField_tableName;
 */
public class Client {
    private int id_client;
    private String ref_client;
    private String nom_client;
    private String adr_client;
    private String tel_client;
    private String dateNaiss_client;

    public Client() {
    }
    public Client(String ref_client, String nom_client, String adr_client, String tel_client, String dateNaiss_client) {
        this.ref_client = ref_client;
        this.nom_client = nom_client;
        this.adr_client = adr_client;
        this.tel_client = tel_client;
        this.dateNaiss_client = dateNaiss_client;
    }

    public Client(int id_client, String ref_client, String nom_client, String adr_client, String tel_client, String dateNaiss_client) {
        this.id_client = id_client;
        this.ref_client = ref_client;
        this.nom_client = nom_client;
        this.adr_client = adr_client;
        this.tel_client = tel_client;
        this.dateNaiss_client = dateNaiss_client;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getRef_client() {
        return ref_client;
    }

    public void setRef_client(String ref_client) {
        this.ref_client = ref_client;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getAdr_client() {
        return adr_client;
    }

    public void setAdr_client(String adr_client) {
        this.adr_client = adr_client;
    }

    public String getTel_client() {
        return tel_client;
    }

    public void setTel_client(String tel_client) {
        this.tel_client = tel_client;
    }

    public String getDateNaiss_client() {
        return dateNaiss_client;
    }

    public void setDateNaiss_client(String dateNaiss_client) {
        this.dateNaiss_client = dateNaiss_client;
    }

    @Override
    public String toString() {
        return "Client n°" +
                "id_client:" + id_client +"\n"+
                "\n ref_client='" + ref_client + '\'' +
                "\n nom_client='" + nom_client + '\'' +
                "\n adr_client='" + adr_client + '\'' +
                "\n tel_client='" + tel_client + '\'' +
                "\n dateNaiss_client='" + dateNaiss_client + '\'' +
                '}';
    }
}
