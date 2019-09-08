package com.e.midterm07580487;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    Button loginButton = findViewById(R.id.button);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] id = {"aaa", "bbb"};
                String[] password = {"111", "222"};
                EditText emailEditText = findViewById(R.id.email_edit_text);
                EditText passwordEditText = findViewById(R.id.password_edit_text);
                Handler handler = new Handler();
                Intent intent = new Intent(emailEditText.getContext(), profile.class);

                //    intent.putExtra(key, value); ⇐ แทรกบรรทัดนี้ (key/value เป็นค่าสตริง)

                boolean x = false;
                for (int i = 0; i < id.length; i++) {
                    if (emailEditText.getText().toString().equals(id[i]) && passwordEditText.getText().toString().equals(password[i]))
                        x = true;

                }
//
                if (x) {
                    startActivity(intent);
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //ทำไรก็ได้ในช่วงดีเล
                            Intent intent = new Intent(login.this, profile.class);//เรียกหน้า
                            startActivity(intent);
                            Toast.makeText(login.this, "Hello", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }, 2000);
                }
               else
                    Toast.makeText(login.this, "Hello", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
