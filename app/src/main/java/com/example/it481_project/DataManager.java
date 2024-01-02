package com.example.it481_project;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataManager {
    private SQLiteDatabase dbase;

    public static final String TABLE_COLUMN_ID = "_id";
    public static final String TABLE_COLUMN_USERNAME = "username";
    public static final String TABLE_COLUMN_PASSWORD = "password";

    static final String DB_NAME = "my_db";
    static final int DB_VERSION = 1;
    static final String TABLE_USERNAME_AND_PASSWORD = "username_and_password";

    public DataManager(Context context) {
        myDbHelper helper = new myDbHelper(context);

        dbase = helper.getWritableDatabae();
    }

    public void insert(String toString, String toString1) {
    }

    public void delete(String toString) {
    }

    public Object serchName(String toString) {
        return null;
    }

    public Object selectAll() {
        return null;
    }

    public void showData(Object serchName) {
    }

    public Object searchName(String toString) {
        return null;
    }


    private class myDbHelper extends SQLiteOpenHelper {
        public myDbHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        //CREATE
        public void onCreate(SQLiteDatabase dbase) {
            String query = "create table " + TABLE_USERNAME_AND_PASSWORD + " ("
                    + TABLE_COLUMN_ID + " integer primary key autoincrement not null,"
                    + TABLE_COLUMN_USERNAME + " text not null,"
                    + TABLE_COLUMN_PASSWORD  + " text not null);";

            dbase.execSQL(query);
        }

        @Override
        public void onUpgrade(SQLiteDatabase dbase, int oldVersion, int newVersion) { }

        //INSERT
        public void insert(String name, String age) {
            String query = "INSERT INTO" + TABLE_USERNAME_AND_PASSWORD + "("
                    + TABLE_COLUMN_USERNAME + "," + TABLE_COLUMN_PASSWORD + ")"
                    + "VALUES"
                    + "(" + name + "" + "," + "" + age + "" + ");";

            Log.i("insert()=", query);
            dbase.execSQL(query);
        }

        //SELECT
        public Cursor selectAll(){
            Cursor c = dbase.rawQuery("SELECT *" +" from " + TABLE_USERNAME_AND_PASSWORD, null);
            return c;
        }


        public void showData (Cursor c) {
            while (c.moveToNext()) {
                Log.i(c.getString(1), c.getString(2));
            }
        }

        public SQLiteDatabase getWritableDatabae() {
            return null;
        }
    }
}

