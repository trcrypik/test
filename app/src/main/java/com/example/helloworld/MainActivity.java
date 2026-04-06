package com.example.helloworld;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        Button button = new Button(this);
        button.setText("Hello World!");
        button.setOnClickListener(v -> Toast.makeText(this, "Привет!", Toast.LENGTH_SHORT).show());
        layout.addView(button);
        setContentView(layout);
    }
}
