package com.example.mohamed.mobilebanking_01.Database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by mohamed on 29/03/15.
 */
public class BankDBDAO {
    protected SQLiteDatabase database;
    private DatabaseHelper dbHelper;
    private Context mContext;

    public BankDBDAO(Context context) {
        this.mContext = context;
        dbHelper = DatabaseHelper.getHelper(mContext);
        open();

    }

    public void open() throws SQLException {
        if(dbHelper == null)
            dbHelper = DatabaseHelper.getHelper(mContext);
        database = dbHelper.getWritableDatabase();
    }

	/*public void close() {
		dbHelper.close();
		database = null;
	}*/
}
