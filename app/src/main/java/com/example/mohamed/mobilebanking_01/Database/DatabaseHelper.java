package com.example.mohamed.mobilebanking_01.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mohamed on 29/03/15.
 */
public class DatabaseHelper  extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "bankDb";
    private static final int DATABASE_VERSION = 1;

    public static final String COMPTE_TABLE = "compte";
    public static final String CLIENT_TABLE = "client";
    public static final String MOUVEMENT_TABLE = "mouvement";
    public static final String CARTE_TABLE = "carte";
    public static final String CHEQUIER_TABLE = "chequier";
    public static final String VIREMENT_TABLE = "virement";
    public static final String RETRAIT_TABLE = "retrait";
    public static final String VERSEMENT_TABLE = "versement";
    public static final String ID_COLUMN = "id";

    // TABLE CLIENT

    public static final String REF_CLIENT = "ref_client";
    public static final String NOM_CLIENT = "nom_client";
    public static final String ADR_CLIENT = "adr_client";
    public static final String TEL_CLIENT = "tel_client";
    public static final String DN_CLIENT = "dateNaiss_client";

    public static final String CREATE_CLIENT_TABLE = "CREATE TABLE "
            + CLIENT_TABLE+ "(" + ID_COLUMN + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + REF_CLIENT + " TEXT, " + NOM_CLIENT + " TEXT, "
            + ADR_CLIENT + " TEXT, " + TEL_CLIENT + " TEXT, "
            + DN_CLIENT +" TEXT )";



    private static DatabaseHelper instance;

    public static synchronized DatabaseHelper getHelper(Context context) {
        if (instance == null)
            instance = new DatabaseHelper(context);
        return instance;
    }

    private DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            // Enable foreign key constraints
            db.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CLIENT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
