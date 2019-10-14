package com.example.letsdonate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toUlogin(View view)     // Jumps to user login screen
    {
        Intent intent = new Intent(getApplicationContext(),UserLogin.class);

        startActivity(intent);
    }

    public void toNgologin(View view)           // Jumps to NGO login screen
    {
        Intent intent = new Intent(getApplicationContext(),NgoLogin.class);

        startActivity(intent);
    }
    // Closing the app
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {

        if (keyCode == KeyEvent.KEYCODE_BACK)  //Override Keyback to do nothing in this case.
        {
            finish();
            System.exit(0);
        }
        return super.onKeyDown(keyCode, event);  //-->All others key will work as usual
    }

}
