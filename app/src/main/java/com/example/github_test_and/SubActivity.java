package com.example.github_test_and;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.sax.EndElementListener;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void btn1click(View v){
        Toast toast=Toast.makeText(getApplicationContext(),"ㅋㅋ",Toast.LENGTH_LONG);
        //toast.setGravity(Gravity.TOP | Gravity.CENTER,10, 10);
        toast.show();
    }
}