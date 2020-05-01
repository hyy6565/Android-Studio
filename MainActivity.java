package com.example.registercard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText tel;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=findViewById(R.id.bt1);
        tel =findViewById(R.id.tel);
        name=findViewById(R.id.name);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name",name.getText().toString().trim());
                intent.putExtra("tel",tel.getText().toString().trim());
                startActivity(intent);

            }



        });
    }
}
