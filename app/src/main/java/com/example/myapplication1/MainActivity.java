package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double number1 = 0.0;
    Double numero2 = 0.0;
    Double resultado;
    String operador;


    @Override
    public void onClick(View view) {
        TextView pantalla = findViewById(R.id.edit);
        switch(view.getId()){
            case R.id.cero:

                pantalla.setText(pantalla.getText() + "0");
                break;
            case R.id.uno:

                pantalla.setText(pantalla.getText() + "1");
                break;
            case R.id.dos:

                pantalla.setText(pantalla.getText() + "2");
                break;
            case R.id.tres:
                pantalla.setText(pantalla.getText() + "3");
                break;
            case R.id.cuatro:
                pantalla.setText(pantalla.getText() + "4");
                break;
            case R.id.cinco:
                pantalla.setText(pantalla.getText() + "5");
                break;
            case R.id.seis:
                pantalla.setText(pantalla.getText() + "6");
                break;
            case R.id.siete:
                pantalla.setText(pantalla.getText() + "7");
                break;
            case R.id.ocho:
                pantalla.setText(pantalla.getText() + "8");
                break;
            case R.id.nueve:
                pantalla.setText(pantalla.getText() + "9");
                break;
            case R.id.dividir:
                number1 = Double.parseDouble(pantalla.getText().toString());
                operador = "/";
                pantalla.setText("");
                break;
            case R.id.sumar:
                number1 = Double.parseDouble(pantalla.getText().toString());
                operador = "+";
                pantalla.setText("");
                break;
            case R.id.restar:
                number1 = Double.parseDouble(pantalla.getText().toString());
                operador = "-";
                pantalla.setText("");
                break;
            case R.id.multiplicar:
                number1 = Double.parseDouble(pantalla.getText().toString());
                operador = "*";
                pantalla.setText("");
                break;
            case R.id.igual:
                switch(operador){
                    case "/":
                        numero2 = Double.parseDouble(pantalla.getText().toString());
                        resultado = number1 /numero2;
                        pantalla.setText(String.valueOf(resultado));
                        break;
                    case "+":
                        numero2 = Double.parseDouble(pantalla.getText().toString());
                        resultado = number1 +numero2;
                        pantalla.setText(String.valueOf(resultado));
                        break;
                    case "-":
                        numero2 = Double.parseDouble(pantalla.getText().toString());
                        resultado = number1 -numero2;
                        pantalla.setText(String.valueOf(resultado));
                        break;
                    case "*":
                        numero2 = Double.parseDouble(pantalla.getText().toString());
                        resultado = number1 *numero2;
                        pantalla.setText(String.valueOf(resultado));
                        break;

                }
                break;
            case R.id.borrar:
                numero2 = 0.0;
                number1 = 0.0;
                operador = "";
                pantalla.setText("");
                break;
        }
    }
}
