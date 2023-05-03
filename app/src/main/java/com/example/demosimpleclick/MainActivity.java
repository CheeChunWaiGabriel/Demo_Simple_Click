package com.example.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.RadioGroup;
import android.widget.RadioButton;
public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton Tbtn;
    RadioGroup RgGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay=findViewById(R.id.textViewDisplay);
        btnDisplay=findViewById(R.id.buttonDisplay);
        etInput=findViewById(R.id.editTextInput);
        Tbtn=findViewById(R.id.toggleButtonEnabled);
        RgGender=findViewById(R.id.RadioGroupGender);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = RgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    // Write the code when male selected
                    String genderout="He says ";
                    tvDisplay.setText(genderout+""+stringResponse);
                }
                else{
                    // Write the code when female selected
                    String genderout="She says ";
                    tvDisplay.setText(genderout+""+stringResponse);
                }
            }
        });

        Tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if (Tbtn.isChecked())
                {etInput.setEnabled(true);
                    etInput.setFocusable(true);
                RgGender.setEnabled(true);
                RgGender.setFocusable(true);}
                else{
                    etInput.setEnabled(false);
                    etInput.setFocusable(false);
                    RgGender.setEnabled(false);
                    RgGender.setFocusable(false);
                }
            }
        });


    }
}