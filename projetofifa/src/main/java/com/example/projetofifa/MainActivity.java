package com.example.projetofifa;

import android.app.Activity;
import android.os.Bundle;
import android.service.carrier.CarrierService;
import android.view.View;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Spinner spinner;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.btnBuscar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String grupo = spinner.getSelectedItem().toString();
                TextView time1 = (TextView)findViewById(R.id.textSelecao1);
                TextView time2 = (TextView)findViewById(R.id.textSelecao2);
                TextView time3 = (TextView)findViewById(R.id.textSelecao3);
                TextView time4 = (TextView)findViewById(R.id.textSelecao4);

                if (grupo.equals("GRUPO A")) {
                    time1.setText("RÚSSIA");
                    time2.setText("ARÁBIA SAUDITA");
                    time3.setText("EGITO");
                    time4.setText("URUGUAI");
                } else if (grupo.equals("GRUPO B")) {
                    time1.setText("PORTUGAL");
                    time2.setText("ESPANHA");
                    time3.setText("MARROCOS");
                    time4.setText("IRÃ");
                } else if (grupo.equals("GRUPO C")) {
                    time1.setText("FRANÇA");
                    time2.setText("AUSTRÁLIA");
                    time3.setText("PERU");
                    time4.setText("DINAMARCA");
                } else if (grupo.equals("GRUPO D")) {
                    time1.setText("ARGENTINA");
                    time2.setText("ISLÂNDIA");
                    time3.setText("CROÁCIA");
                    time4.setText("NIGÉRIA");
                } else if (grupo.equals("GRUPO E")) {
                    time1.setText("BRASIL");
                    time2.setText("SUIÇA");
                    time3.setText("COSTA RICA");
                    time4.setText("SÉRVIA");
                } else if (grupo.equals("GRUPO F")) {
                    time1.setText("ALEMANHA");
                    time2.setText("MÉXICO");
                    time3.setText("SUÉCIA");
                    time4.setText("COREIA DO SUL");
                } else if (grupo.equals("GRUPO G")) {
                    time1.setText("BÉLGICA");
                    time2.setText("PANAMÁ");
                    time3.setText("TUNÍSIA");
                    time4.setText("INGLATERRA");
                } else if (grupo.equals("GRUPO H")) {
                    time1.setText("POLÔNIA");
                    time2.setText("SENEGAL");
                    time3.setText("COLÔMBIA");
                    time4.setText("JAPÃO");
                } else {
                    Toast.makeText(MainActivity.this, "GRUPO NÃO FOI SELECIONADO", Toast.LENGTH_LONG).show();
                    time1.setText("TESTE2");
                }
            }
        });
    }
}
