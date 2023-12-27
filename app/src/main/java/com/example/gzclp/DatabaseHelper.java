package com.example.gzclp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Uebungen.db";
    private static final int DATABASE_VERSION = 1;

    // Tabelle und Spalten
    public static final String TABLE_NAME = "UebungenTable";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_WEIGHT = "weight";
    public static final String COLUMN_TYPE = "type";
    public  static final String COLUMN_STATUS = "status";

    // SQL-Anweisung zur Erstellung der Tabelle
    private static final String DATABASE_CREATE =
            "create table " + TABLE_NAME + "(" +
                    COLUMN_ID + " integer primary key autoincrement, " +
                    COLUMN_NAME + " text not null, " +
                    COLUMN_WEIGHT + " real not null, " +
                    COLUMN_TYPE + " text not null, " +
                    COLUMN_STATUS + " real not null);";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}

