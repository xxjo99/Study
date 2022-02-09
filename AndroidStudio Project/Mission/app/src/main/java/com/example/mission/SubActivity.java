package com.example.mission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;
    private Button btn_sub;
    private EditText et_sub;
    private String str_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str_main");
        tv_sub.setText(str);

        et_sub = findViewById(R.id.et_sub);
        btn_sub = findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str_sub = et_sub.getText().toString();
                Intent intent = new Intent(SubActivity.this, MainActivity.class);
                intent.putExtra("str_sub", str_sub);
                startActivity(intent);
            }
        });

    }
}