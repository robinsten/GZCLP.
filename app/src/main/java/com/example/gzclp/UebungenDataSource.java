package com.example.gzclp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class UebungenDataSource {

    private SQLiteDatabase database;
    private DatabaseHelper dbHelper;

    public UebungenDataSource(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    public void open() {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public long insertUebung(String name, double weight, String type, Integer Status, Integer day) {
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.COLUMN_NAME, name);
        values.put(DatabaseHelper.COLUMN_WEIGHT, weight);
        values.put(DatabaseHelper.COLUMN_TYPE, type);
        values.put(DatabaseHelper.COLUMN_DAY, day);
        values.put(DatabaseHelper.COLUMN_STATUS, Status);

        return database.insert(DatabaseHelper.TABLE_NAME, null, values);
    }

    public Cursor getAllUebungen() {
        String[] allColumns = {
                DatabaseHelper.COLUMN_ID,
                DatabaseHelper.COLUMN_NAME,
                DatabaseHelper.COLUMN_WEIGHT,
                DatabaseHelper.COLUMN_TYPE,
                DatabaseHelper.COLUMN_DAY,
                DatabaseHelper.COLUMN_STATUS

        };

        return database.query(
                DatabaseHelper.TABLE_NAME,
                allColumns,
                null,
                null,
                null,
                null,
                null
        );
    }
}
