package com.example.letsdonate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NgoLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_login);
    }

    public void toNgoAcc(View view)   // login Button Action
    {

        Intent intent = new Intent(getApplicationContext(),NgoAccount.class);


        //getting username
        EditText ngoName = (EditText) findViewById(R.id.ngo_name);
        EditText password = (EditText) findViewById(R.id.ngo_password);

        intent.putExtra("Ngo_name", ngoName.getText().toString());

        ngoName.setText(""); // clearing the text before jumping to user account
        password.setText("");

        startActivity(intent);
    }


    // to Forgot password screen
    public void ngo_toFogotpassword(View view)
    {
        Intent intent = new Intent(getApplicationContext(),ForgotPass.class);
        startActivity(intent);
    }

    // to NGO Sign up screen
    public void toNgoSignup(View view)
    {
        Intent intent = new Intent(getApplicationContext(),NgoSignup.class);
        startActivity(intent);
    }
}
