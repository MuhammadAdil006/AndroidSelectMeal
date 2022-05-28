package com.example.selectmeal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Db extends SQLiteOpenHelper {
    public Db( Context context) {
        super(context, "UserDatabase.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table Pakwan(name Text primary Key) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
    public Boolean insertData(String name)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put("name",name);
        long result= db.insert("Pakwans",null,cv);
        if(result==-1)
            return false;
        return true;
    }
    public Boolean deleteData(String name)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from Pakwans where name = ?", new String[]{name});
        if (cursor.getCount() > 0) {
            long result = DB.delete("Pakwans", "name=?", new String[]{name});
            if (result == -1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public Cursor getdata ()
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from Pakwans", null);
        return cursor;
    }

}
