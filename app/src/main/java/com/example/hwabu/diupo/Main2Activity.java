package com.example.hwabu.diupo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            Button button2=(Button)findViewById(R.id.button2);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View view) {

                finish();
            }
        });
    }
}
