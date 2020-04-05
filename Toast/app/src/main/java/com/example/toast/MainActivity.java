package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.Button01);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast t = Toast.makeText(getApplicationContext(),"It's a press button",Toast.LENGTH_LONG);
                t.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 30);
                t.show();
            }
        });
        Button btn1 = (Button)findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast t = Toast.makeText(getApplicationContext(),"It's a Toast",Toast.LENGTH_LONG);
                t.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 30);
                t.show();
            }
        });
    }
}
