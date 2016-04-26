package com.example.mohamed.mobilebanking_01;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohamed.mobilebanking_01.Database.ClientDAO;
import com.example.mohamed.mobilebanking_01.Model.Carte;
import com.example.mohamed.mobilebanking_01.Model.Client;

import java.util.ArrayList;
import java.util.List;

import static com.example.mohamed.mobilebanking_01.R.*;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        Log.d("Exception","Error!");
        List<Client> arrayOfClients = new ArrayList<Client>();
        ListView cView = (ListView) findViewById(id.clientList);


        // -----> saving one client to db
        ClientDAO cl = new ClientDAO(this);
        //Client delCl = new Client();
        //cl.deleteAll();
        //After deletion of records
        Client c3 = new Client("yos3","Yosri Zouari2","rte el Afrane","50825989","17-09-1989");
        cl.save(c3);
        ArrayAdapter<Client> cAdapter;
        ArrayList<Client> clients = new ArrayList<Client>();
        clients.addAll(cl.getClients());
        cAdapter = new ArrayAdapter<Client>(this, layout.item_client,clients);
        cView.setAdapter(cAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
