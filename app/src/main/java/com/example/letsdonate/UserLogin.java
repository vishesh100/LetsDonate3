package com.example.letsdonate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserLogin extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
    }

    public void toAcc(View view)   // login Button Action
    {

        Intent intent = new Intent(getApplicationContext(),User_account.class);


        //getting username
        EditText username = (EditText) findViewById(R.id.user_name);
        EditText password = (EditText) findViewById(R.id.user_pswrd);
        intent.putExtra("username",username.getText().toString());

        username.setText(""); // clearing the text before jumping to user account
        password.setText("");

        startActivity(intent);
    }
    // to Forgot password screen
    public void user_toFogotpassword(View view)
    {
        Intent intent = new Intent(getApplicationContext(),ForgotPass.class);
        startActivity(intent);
    }

    // to User Sign up screen
    public void toUserSignup(View view)
    {
        Intent intent = new Intent(getApplicationContext(),UserSignup.class);
        startActivity(intent);
    }
}
