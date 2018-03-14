package com.example.aplicativo2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editText;
    private CheckBox ckeckBox;
    private RadioGroup radioGroup;
    private Spinner spinner;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editNome);
        ckeckBox = findViewById(R.id.ckeckBox);
        radioGroup = findViewById(R.id.radioGroup);
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.btnSalvar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString() + "\n";
                data += ckeckBox.isChecked() + "\n";
                data += spinner.getSelectedItem().toString() + "\n";
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton tmp = findViewById(id);
                data += " primeiro jeito - + " tmp.getText().toString();
                
                String rd = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();

                data += " segundo jeito - " + rd;

                Toast.makeText(MainActivity.this, data, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
