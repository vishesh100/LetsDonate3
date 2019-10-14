package com.example.letsdonate;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DatabaseHelper  extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Donator.db";
    private  Context  context;
    public static final String Table_Name="donator_table";
    public DatabaseHelper(@Nullable Context context) {


        super(context,DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table mytable "+"(Area Integer,Mode Integer)");
        Toast.makeText(context,"table created",Toast.LENGTH_LONG).show();


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void insertdata(int x,int y)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("Area",x);
        contentValues.put("Mode of donation",y);
        sqLiteDatabase.insert("Mytable",null,contentValues);
        Toast.makeText(context,"data inserted",Toast.LENGTH_LONG).show();

    }
}
