package com.example.contadobuteco;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editTextPessoas;
    private EditText editTextConta;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPessoas = findViewById(R.id.editQuantidade);
        editTextConta = findViewById(R.id.editConta);
        button = findViewById(R.id.btnVerificar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensagem = "";

                if (editTextPessoas.getText().length() == 0) {
                    mensagem = "Número de pessoas não foi informado!";
                } else if (editTextConta.getText().length() == 0)  {
                    mensagem = "Valor da Conta não foi informado!";
                } else {
                    int racha =  Integer.parseInt(editTextPessoas.getText().toString());
                    float conta = Float.parseFloat(editTextConta.getText().toString());
                    float resultado = conta / racha;

                    mensagem = "A conta para " + editTextPessoas.getText().toString() + " pessoas "+ "\n";
                    mensagem += " no valor de " + editTextConta.getText().toString() + "\n";
                    mensagem += " fica " + resultado + " para cada pessoa.";
                }

                Toast.makeText(MainActivity.this, mensagem, Toast.LENGTH_LONG).show();
            }
        });

    }
}
