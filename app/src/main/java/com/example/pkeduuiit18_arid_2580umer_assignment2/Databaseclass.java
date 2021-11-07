package com.example.pkeduuiit18_arid_2580umer_assignment2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Databaseclass extends SQLiteOpenHelper {
    private static final String database_name ="firstdatabse";
    private static final String table_name = "signup";
    private static final String table_col_name="signup";
    private static final int db_version =1;
    SQLiteDatabase sqllitedatabase;

    public Databaseclass( Context context) {
        super(context, database_name,null, db_version);
        sqllitedatabase = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists "+table_name+ "(user_name varchar,user_email VARCHAR,user_password VARCHAR,Gender VARCHAR,Subject VARCHAR)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + table_name);
        onCreate(db);
    }
    public long signup(String name, String email, String password,String gender,String subject){
        ContentValues contentValues=new ContentValues();
        contentValues.put("user_name",name);
        contentValues.put("user_email",email);
        contentValues.put("user_password",password);
        contentValues.put("Gender",gender);
        contentValues.put("Subject",subject);
        long user_data=sqllitedatabase.insert(table_name,null,contentValues);
        return user_data;
    }
    public Cursor login(String Email , String password)
    {
        //SQLiteDatabase db= this.getReadableDatabase();
        Cursor lgn = sqllitedatabase.rawQuery("select * from signup where user_email='"+Email+"'and user_password='"+password+"'",null);
        return lgn;
    }
}
