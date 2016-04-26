package com.example.mohamed.mobilebanking_01.Database;
import com.example.mohamed.mobilebanking_01.Model.*;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by mohamed on 29/03/15.
 */
public class ClientDAO extends  BankDBDAO {

    private static final String WHERE_ID_EQUALS = DatabaseHelper.ID_COLUMN + " =?";
    public ClientDAO(Context context) {
        super(context);
    }

    public long save(Client client) {
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.REF_CLIENT, client.getRef_client());
        values.put(DatabaseHelper.NOM_CLIENT, client.getNom_client());
        values.put(DatabaseHelper.ADR_CLIENT, client.getAdr_client());
        values.put(DatabaseHelper.TEL_CLIENT, client.getTel_client());
        values.put(DatabaseHelper.DN_CLIENT, client.getDateNaiss_client());

        return database.insert(DatabaseHelper.CLIENT_TABLE, null, values);
    }

    public long update(Client client) {
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.REF_CLIENT, client.getRef_client());
        values.put(DatabaseHelper.NOM_CLIENT, client.getNom_client());
        values.put(DatabaseHelper.ADR_CLIENT, client.getAdr_client());
        values.put(DatabaseHelper.TEL_CLIENT, client.getTel_client());
        values.put(DatabaseHelper.DN_CLIENT, client.getDateNaiss_client());

        long result = database.update(DatabaseHelper.CLIENT_TABLE, values,
                WHERE_ID_EQUALS,
                new String[] { String.valueOf(client.getId_client()) });
        Log.d("Update Result:", "=" + result);
        return result;
    }

    public int delete(Client client) {
        return database.delete(DatabaseHelper.CLIENT_TABLE, WHERE_ID_EQUALS,
                new String[] { client.getId_client() + "" });
    }
    public int deleteAll() {
        return database.delete(DatabaseHelper.CLIENT_TABLE, "",
                null);
    }

    // METHOD 1
    // Uses rawQuery() to query multiple tables
    public ArrayList<Client> getClients() {
        ArrayList<Client> clients = new ArrayList<Client>();
        Cursor  cursor = null;
        String query = "SELECT * FROM " +DatabaseHelper.CLIENT_TABLE;
        Log.d("query", query);
        cursor = database.rawQuery(query, null);
        while (cursor.moveToNext()) {
            Client client = new Client();
            client.setId_client(cursor.getInt(0));
            client.setRef_client(cursor.getString(1));
            client.setNom_client(cursor.getString(2));
            client.setAdr_client(cursor.getString(3));
            client.setTel_client(cursor.getString(4));
            client.setDateNaiss_client(cursor.getString(5));
            clients.add(client);
        }
        cursor.close();
        return clients;
    }
}
