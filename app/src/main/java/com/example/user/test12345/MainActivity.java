package com.example.user.test12345;

import android.app.Activity;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int n;
    Button button;
    Button button3;
    EditText name;
    EditText name2;
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            n = savedInstanceState.getInt("count");
        }
        setContentView(R.layout.activity_main);
        Log.d("Test", "onCreate");
        button = findViewById(R.id.button);
        name = findViewById(R.id.name);
        name2 = findViewById(R.id.name2);
        checkBox = findViewById(R.id.checkbox);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n++;
                Toast.makeText(MainActivity.this, ""+n, Toast.LENGTH_LONG).show();
        }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", n);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        n = savedInstanceState.getInt("count");
    }
}
