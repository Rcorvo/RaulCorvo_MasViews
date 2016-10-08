package org.example.masviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MasViewActivity extends AppCompatActivity {

    private EditText entrada;
    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_view);

        entrada = (EditText) findViewById(R.id.entrada);
        salida = (TextView) findViewById(R.id.salida);

        /*Para que no de error si se le dá al botón rojo primero, asignamos en entrada el texto 0
        De esta manera al pulsar el boton rojo no dará un error por intentar realizar un calculo con
        un String vacio*/
        entrada.setText("0");
    }

    public void sePulsa(View view){
        salida.setText(String.valueOf(Float.parseFloat(entrada.getText().toString())*2.0));
    }

    public void sePulsa0(View view){
        entrada.setText(entrada.getText() + (String) view.getTag());
    }
}
