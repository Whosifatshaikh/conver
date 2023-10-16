package com.example.conver;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButtonFahrenheit;
    private RadioButton radioButtonCelsius;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        radioButtonFahrenheit = findViewById(R.id.radioButtonFahrenheit);
        radioButtonCelsius = findViewById(R.id.radioButtonCelsius);
        convertButton = findViewById(R.id.convertButton);
        resultTextView = findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioButtonFahrenheit.isChecked()) {
                    // Convert Fahrenheit to Celsius logic here
                    double fahrenheitValue = 0 /* Get Fahrenheit input */;
                    double celsiusValue = (fahrenheitValue - 32) * 5/9;
                    resultTextView.setText(String.format("%.2f°C", celsiusValue));
                } else if (radioButtonCelsius.isChecked()) {
                    // Convert Celsius to Fahrenheit logic here
                    double celsiusValue = 0 /* Get Celsius input */;
                    double fahrenheitValue = (celsiusValue * 9/5) + 32;
                    resultTextView.setText(String.format("%.2f°F", fahrenheitValue));
                }
            }
        });
    }
}
