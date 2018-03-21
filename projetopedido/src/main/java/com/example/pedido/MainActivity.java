package com.example.pedido;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.ArrayList;


public class MainActivity extends Activity {

    private EditText prd, uni, qtde;
    private Button btnAdicionar, btnLimpar;
    private TextView texTotal;
    private ListView lista;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;
    private Float total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prd = (EditText) findViewById(R.id.editNomeProduto);
        qtde = (EditText) findViewById(R.id.editQuantidade);
        uni = (EditText) findViewById(R.id.editUnitario);
        texTotal = (TextView)  findViewById(R.id.textTotalPedido);
        btnAdicionar = (Button) findViewById(R.id.btnAdicionar);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);

        lista = (ListView) findViewById(R.id.lista);

        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);

        lista.setAdapter(adapter);

        onBtnClick();
    }

    public void onBtnClick() {

        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = prd.getText().toString() + " - " + qtde.getText().toString() + " - " + uni.getText().toString();
                arrayList.add(item);
                adapter.notifyDataSetChanged();

                total = Float.parseFloat(texTotal.getText().toString()) + (Float.parseFloat(qtde.getText().toString()) *  Float.parseFloat(uni.getText().toString()));

                texTotal.setText(total.toString());
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.clear();
                adapter.notifyDataSetChanged();
                total = Float.parseFloat("0");
                prd.setText("");
                qtde.setText("");
                uni.setText("");
                texTotal.setText(total.toString());
            }
        });
    }
}
