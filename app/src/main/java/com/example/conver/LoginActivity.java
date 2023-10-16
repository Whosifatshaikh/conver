package com.example.conver;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Validate the username and password
                if (isValidLogin(username, password)) {
                    // Redirect to the main app page or perform other actions
                } else {
                    // Show an error message or handle invalid login
                }
            }
        });
    }

    // Add your own logic to validate the login
    private boolean isValidLogin(String username, String password) {
        // Implement your login validation logic here
        // For simplicity, you can hardcode a valid username and password
        return username.equals("user") && password.equals("password");
    }
}
