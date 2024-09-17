package com.example.imc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText peso, altura, resultado;
    private RadioButton homem, mulher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.resultado = findViewById(R.id.resultado);
        this.peso = findViewById(R.id.peso);
        this.altura = findViewById(R.id.altura);
        this.resultado = findViewById(R.id.resultado);
        this.homem = findViewById(R.id.homem);
        this.mulher = findViewById(R.id.mulher);
    }

    public void calcular(View v) {
        String texto1 = peso.getText().toString();
        String texto2 = altura.getText().toString();

        if (texto1.isEmpty() || texto2.isEmpty()) {
            AlertDialog.Builder msg = new AlertDialog.Builder(this);
            msg.setTitle("Atenção");
            mensagem("Digite os dois valores");
            msg.setNeutralButton("Ok", null);
            msg.create();
            msg.show();
        }

        else {
            double v1 = Double.parseDouble(peso.getText().toString());
            double v2 = Double.parseDouble(altura.getText().toString());

            if (v1 <= 0 || v2 <= 0) {
                AlertDialog.Builder msg = new AlertDialog.Builder(this);
                msg.setTitle("Atenção");
                mensagem("Os valores devem ser maiores que 0");
                msg.setNeutralButton("Ok", null);
                msg.create();
                msg.show();
            }

            else if (homem.isChecked()){
                double valor = this.imc();
                if (valor < 20) {
                    AlertDialog.Builder msg = new AlertDialog.Builder(this);
                    msg.setTitle("Atenção");
                    mensagem("Seu IMC está abaixo do normal");
                    msg.setNeutralButton("Ok", null);
                    msg.create();
                    msg.show();
                    resultado.setText(valor + "");
                }
                else if (valor < 25) {
                    AlertDialog.Builder msg = new AlertDialog.Builder(this);
                    msg.setTitle("Atenção");
                    mensagem("Seu IMC está normal");
                    msg.setNeutralButton("Ok", null);
                    msg.create();
                    msg.show();
                    resultado.setText(valor + "");
                }
                else if (valor < 30) {
                    AlertDialog.Builder msg = new AlertDialog.Builder(this);
                    msg.setTitle("Atenção");
                    mensagem("Seu IMC está em Obesidade Leve");
                    msg.setNeutralButton("Ok", null);
                    msg.create();
                    msg.show();
                    resultado.setText(valor + "");
                }
                else if (valor < 40) {
                    AlertDialog.Builder msg = new AlertDialog.Builder(this);
                    msg.setTitle("Atenção");
                    mensagem("Seu IMC está em Obesidade Moderada");
                    msg.setNeutralButton("Ok", null);
                    msg.create();
                    msg.show();
                    resultado.setText(valor + "");
                }
                else {
                    AlertDialog.Builder msg = new AlertDialog.Builder(this);
                    msg.setTitle("Atenção");
                    mensagem("Seu IMC está em Obesidade Mórbida");
                    msg.setNeutralButton("Ok", null);
                    msg.create();
                    msg.show();
                    resultado.setText(valor + "");
                }
            }

            else if (mulher.isChecked()){
                double valor = this.imc();
                if (valor < 19) {
                    AlertDialog.Builder msg = new AlertDialog.Builder(this);
                    msg.setTitle("Atenção");
                    mensagem("Seu IMC está abaixo do normal");
                    msg.setNeutralButton("Ok", null);
                    msg.create();
                    msg.show();
                    resultado.setText(valor + "");
                }
                else if (valor < 24) {
                    AlertDialog.Builder msg = new AlertDialog.Builder(this);
                    msg.setTitle("Atenção");
                    mensagem("Seu IMC está normal");
                    msg.setNeutralButton("Ok", null);
                    msg.create();
                    msg.show();
                    resultado.setText(valor + "");
                }
                else if (valor < 29) {
                    AlertDialog.Builder msg = new AlertDialog.Builder(this);
                    msg.setTitle("Atenção");
                    mensagem("Seu IMC está em Obesidade Leve");
                    msg.setNeutralButton("Ok", null);
                    msg.create();
                    msg.show();
                    resultado.setText(valor + "");
                }
                else if (valor < 39) {
                    AlertDialog.Builder msg = new AlertDialog.Builder(this);
                    msg.setTitle("Atenção");
                    mensagem("Seu IMC está em Obesidade Moderada");
                    msg.setNeutralButton("Ok", null);
                    msg.create();
                    msg.show();
                    resultado.setText(valor + "");
                }
                else {
                    AlertDialog.Builder msg = new AlertDialog.Builder(this);
                    msg.setTitle("Atenção");
                    mensagem("Seu IMC está em Obesidade Mórbida");
                    msg.setNeutralButton("Ok", null);
                    msg.create();
                    msg.show();
                    resultado.setText(valor + "");
                }
            }
            else {
                AlertDialog.Builder msg = new AlertDialog.Builder(this);
                msg.setTitle("Atenção");
                mensagem("Escolha seu sexo");
                msg.setNeutralButton("Ok", null);
                msg.create();
                msg.show();
            }
        }
    }

    private double imc() {
        double v1 = Double.parseDouble(peso.getText().toString());
        double v2 = Double.parseDouble(altura.getText().toString());
        return v1 / ((v2 * v2) / 10000);
    }

    private void mensagem(String texto){
        AlertDialog.Builder msg = new AlertDialog.Builder(this);
        msg.setTitle("Atenção");
        msg.setMessage(texto);
        msg.setNeutralButton("Ok", null);
        msg.create();
        msg.show();
    }
}
