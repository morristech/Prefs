package com.abduaziz.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.abduaziz.prefs.Prefs;

public class MainActivity extends AppCompatActivity {

    String TAG = "Prefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Prefs.put(this, "name", "Trump"); //string
        Prefs.put(this, "age",71f); //float
        Prefs.put(this, "isPresident", true); //boolean
        Prefs.put(this, "id", 12345678910L); //long
        Prefs.put(this, "balance", 250000); //integer
        double a = 123123.123;
        Prefs.put(this, "someDouble", a); //double

        Log.d(TAG, "name = " + Prefs.getString(this, "name", "default"));
        Log.d(TAG, "age = " + Prefs.getFloat(this, "age", 0f));
        Log.d(TAG, "isPresident = " + Prefs.getBoolean(this, "isPresident", false));
        Log.d(TAG, "id = " + Prefs.getLong(this, "id", 0L));
        Log.d(TAG, "balance = " + Prefs.getInt(this, "balance", 0));
        Log.d(TAG, "someDouble = " + Prefs.getDouble(this, "someDouble", 0));

    }
}
