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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class User_account extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public Toolbar toolbar;
    public Spinner spinner;
    private static final String[] options = {"None", "Books", "Utensils","Toys","Clothes","Money","Food"};
    Intent intent;
    int selected = 0;  // Filter selected


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_account);

        intent = getIntent();

        // set username on toolbar
        toolbar = (Toolbar) findViewById(R.id.user_toolbar);
        toolbar.setTitle(intent.getStringExtra("username"));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.ic_action_logo); !!code to set icon on toolbar(it is not working)

        // Creating Filter DropDown list
        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(User_account.this,
                android.R.layout.simple_spinner_item,options);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


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

    // To restrict back button to close the userAccount Activity
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {

        if (keyCode == KeyEvent.KEYCODE_BACK)  //Override Keyback to do nothing in this case.
        {
            return true;
        }
        return super.onKeyDown(keyCode, event);  //-->All others key will work as usual
    }

    // Next Two methods to handle the map filter

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int index, long id) {

        switch (index) {
            case 0:
                selected = 0;
                break;
            case 1:
                selected = 1;
                Toast.makeText(this,"book",Toast.LENGTH_SHORT).show();
                break;
            case 2:
                selected = 2;
                 Toast.makeText(this,"utensils",Toast.LENGTH_SHORT).show();
                break;
            case 3:
                selected = 3;
                Toast.makeText(this,"Toys",Toast.LENGTH_SHORT).show();
                break;
            case 4:
                selected = 4;
                Toast.makeText(this,"clothes",Toast.LENGTH_SHORT).show();
                break;
            case 5:
                selected = 5;
                Toast.makeText(this,"Money",Toast.LENGTH_SHORT).show();
                break;
            case 6:
                selected = 6;
                Toast.makeText(this,"Food",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    // code for About US TextView
    public void toAboutus(View view)
    {
        Intent intent = new Intent(getApplicationContext(),aboutUs.class);
        startActivity(intent);
    }



    // Function for  Logout button
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void toMap(View view)
    {
        Intent intent = new Intent(getApplicationContext(),MapForUser.class);
        startActivity(intent);
    }
}
