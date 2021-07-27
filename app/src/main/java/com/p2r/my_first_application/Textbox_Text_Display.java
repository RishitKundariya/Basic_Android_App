package com.p2r.my_first_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Textbox_Text_Display extends AppCompatActivity {
    TextView tv; Button btnShowText; EditText etInputtextBox; Button btnNext, btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textbox_text_display);

        tv=findViewById(R.id.tvShowtext);
        btnShowText=findViewById(R.id.btnShowText);
        etInputtextBox=findViewById(R.id.etInputtextBox);
         btnNext=findViewById(R.id.btnNext);
         btnBack=findViewById(R.id.btnBack);
         btnBack.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                 startActivity(intent);
                 setContentView(R.layout.activity_main);
             }
         });
         btnNext.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent =new Intent(getApplicationContext(),Add_view_from_Java.class);
                 startActivity(intent);
                 setContentView(R.layout.activity_add_view_from_java);
             }
         });

        btnShowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (etInputtextBox.getText().length() > 0){
                  tv.setText(etInputtextBox.getText());
              }
              else{
                  etInputtextBox.setError("Enter string");
              }
            }
        });
         

    }
}