package com.example.letsdonate;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class CreateEvent extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    int i,j,k,l,m;  // for the use of Calender object

    int year,day,hour,min; // to store the input
    String month;
    static final String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    TextView showDate;
    TextView showTime;
    EditText location;
    Button setDate;
    Button setTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        showDate = (TextView) findViewById(R.id.show_date);
        showTime = (TextView) findViewById(R.id.showtime);
        location = (EditText) findViewById(R.id.location);

    }



    // Calender Listener  Method
    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

        year = i;
        day = i2;

        switch (i1)
        {
            case 0: month = "January"; break;
            case 1: month = "February"; break;
            case 2: month = "March"; break;
            case 3: month = "April"; break;
            case 4: month = "May"; break;
            case 5: month = "June"; break;
            case 6: month = "july"; break;
            case 7: month = "August"; break;
            case 8: month = "September"; break;
            case 9: month = "October"; break;
            case 10: month = "November"; break;
            case 11: month = "December"; break;
        }

        showDate.setText(day+" "+month+" "+" "+year);

    }
    // Time set listener Method
    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {

        hour = i;
        min = i1;

        showTime.setText("  "+hour+":"+min);

    }

    // To listen Set Date Button
    public void method_Setdate(View view)
    {
        Calendar c = Calendar.getInstance(); // to get the current date
        i = c.get(Calendar.YEAR);
        j = c.get(Calendar.MONTH);
        k = c.get(Calendar.DAY_OF_MONTH);

        // prompt Calender to the user
        DatePickerDialog datePickerDialog = new DatePickerDialog(CreateEvent.this,CreateEvent.this,i,j,k);
        datePickerDialog.show();
    }
    // To listen Set Time Button
    public void Method_setTime(View view)
    {
        Calendar c = Calendar.getInstance(); // to get current time
        l = c.get(Calendar.HOUR_OF_DAY);
        m = c.get(Calendar.MINUTE);


        // prompt the Clock to the user
        TimePickerDialog timePickerDialog = new TimePickerDialog(CreateEvent.this,
                CreateEvent.this,l,m, DateFormat.is24HourFormat(this));

        timePickerDialog.show();
    }

    // Create Button listener
    public void create(View view)
    {
        // Write your code here , To store input in the database

        //Closing this activity after everything is done
        onBackPressed();
    }
}
