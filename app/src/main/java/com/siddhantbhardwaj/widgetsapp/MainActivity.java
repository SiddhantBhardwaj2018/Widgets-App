package com.siddhantbhardwaj.widgetsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

   // CheckBox checkBox;

   // RadioGroup radioGroup;

  //  Spinner spinner;

  //  DatePicker datePicker;

   // Button datePickerBtn;

    ProgressBar progressBar;

    Button progressBtn;

    int progress = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        /*
        checkBox = findViewById(R.id.checkBox);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(
                            MainActivity.this,
                            "Checkbox is checked",
                            Toast.LENGTH_SHORT
                    ).show();
                }else{
                    Toast.makeText(
                            MainActivity.this,
                            "Checkbox is unchecked",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });

        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                Toast.makeText(
                        MainActivity.this,
                        "You selected " + radioButton.getText().toString(),
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
        */
        /*
        spinner = findViewById(R.id.spinner);
        String[] courses = {"C++","Java","Kotlin","Python"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                    android.R.layout.simple_spinner_item,
                    courses
        );
        spinner.setAdapter(arrayAdapter);
         */

        /*
        TimePicker timePicker = findViewById(R.id.timePicker);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(
                        MainActivity.this,
                        "Time has changed to " + hourOfDay + " hours " + minute + " minutes ",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
         */

        /*
        datePicker = findViewById(R.id.datePicker);
        datePickerBtn = findViewById(R.id.datePickerBtn);

        datePickerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dayOfMonth = datePicker.getDayOfMonth();
                int monthOfYear = datePicker.getMonth();
                int year = datePicker.getYear();
                Toast.makeText(
                        MainActivity.this,
                        "" + dayOfMonth + "/" + monthOfYear + "/" + year,
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
         */

        progressBar = findViewById(R.id.progressBar);
        progressBtn = findViewById(R.id.progressBtn);


        progressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress = progress + 10;
                progressBar.setProgress(progress);
            }
        });

    }
}