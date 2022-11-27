package ue.project.senddatatoanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Receiver extends AppCompatActivity {

    TextView tvName;
    TextView tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        tvName = findViewById(R.id.tvName);
        tvAge = findViewById(R.id.tvAge);

        String name = getIntent().getStringExtra("NAME");
        int age = getIntent().getIntExtra("AGE", 0);

        tvName.setText("Your name is: " + name);
        tvAge.setText("Your age is: " + age);
    }
}
