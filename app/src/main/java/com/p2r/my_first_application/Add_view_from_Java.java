package com.p2r.my_first_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Add_view_from_Java extends AppCompatActivity {
    Button btClick,btnBack;
    LinearLayout llLayout;
    int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_view_from_java);
        setReference();
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Textbox_Text_Display.class);
                startActivity(intent);
                setContentView(R.layout.activity_textbox_text_display);
            }
        });
        btClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              addButton();
            }

        });

    }

    private void setReference() {
        btClick=findViewById(R.id.btnSave);
        llLayout=findViewById(R.id.llmyLayoutrk);
        btnBack=findViewById(R.id.btnBack);
    }

    private void addButton(){
        // add button from java file
        //    Button btn=new Button(this);
        //   btn.setTextSize(16);
        //   btn.setText("Button - "+count);
        //   btn.setPadding(10,10,10,10);
        //   llLayout.addView(btn);

        // add button from layout file

        View v= LayoutInflater.from(this).inflate(R.layout.view_custom_button,null);
        Button btn=v.findViewById(R.id.btnCustom);
        btn.setText("Button - "+ count);
        btn.setPadding(10,10,10,10);
        llLayout.addView(v);
       count++;
    }
}