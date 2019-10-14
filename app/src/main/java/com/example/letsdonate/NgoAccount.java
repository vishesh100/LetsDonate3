package com.example.letsdonate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class NgoAccount extends AppCompatActivity {

    public Toolbar toolbar;
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_account);

        intent = getIntent();

        // set username on toolbar
        toolbar = (Toolbar) findViewById(R.id.ngo_toolbar);
        toolbar.setTitle(intent.getStringExtra("Ngo_name"));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }


    // Next Two Methods are for ToolBar

    //Toolbar menu generator
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    // onClick eventHandling for Toolbar MenuItems
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.item_help:
                Intent JumptoHelp = new Intent(getApplicationContext(),Help.class);
                startActivity(JumptoHelp);
                break;

            case R.id.item_logout:
                onBackPressed();
                break;

        }
        return true;
    }

    // code for About US TextView
    public void toAboutus(View view)
    {
        Intent intent = new Intent(getApplicationContext(),aboutUs.class);
        startActivity(intent);
    }

    // To restrict back button to close the userAccount Activity
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {

        if (keyCode == KeyEvent.KEYCODE_BACK)  //Override Keyback to do nothing in this case.
        {
            return true;
        }
        return super.onKeyDown(keyCode, event);  //-->All others key will work as usual
    }
    // Function for  Logout button
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }

    // code for About US TextView
    public void toAboutus_ngo(View view)
    {
        Intent intent = new Intent(getApplicationContext(),aboutUs.class);
        startActivity(intent);
    }

    public void toAnalytics(View view)
    {
        Intent intent = new Intent(getApplicationContext(),Analytics.class);
        startActivity(intent);

    }



    public void toCreateAnEvent(View view)
    {
        Intent intent = new Intent(getApplicationContext(),CreateEvent.class);
        startActivity(intent);
    }

}
