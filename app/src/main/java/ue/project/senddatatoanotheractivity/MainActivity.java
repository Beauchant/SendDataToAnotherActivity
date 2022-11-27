package ue.project.senddatatoanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtName;
    EditText txtAge;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtAge = findViewById(R.id.txtAge);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Receiver.class);
                String name = txtName.getText().toString();
                int age = Integer.parseInt(txtAge.getText().toString().trim());

                i.putExtra("NAME", name);
                i.putExtra("AGE", age);
                startActivity(i);
            }
        });
    }
}