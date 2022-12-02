package uta.fisei.edu.ec.jairo_lascano_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Button buttonSiguiente;
    private Button buttonMostrarResultado;
    private EditText editTextNombres;
    private EditText editTextApellidos;
    private EditText editTextDividendo;
    private EditText editTextDivisor;
    private EditText editTextParteEntera;
    private EditText editTextResiduo;
    private EditText editTextNumInvertido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMostrarResultado = findViewById(R.id.buttuonCerrar);
        buttonSiguiente = findViewById(R.id.buttonSiguiente);
        editTextNombres = findViewById(R.id.editTextTextNombres);
        editTextApellidos = findViewById(R.id.editTextApellidos);
        editTextDividendo = findViewById(R.id.editTextDividendo);
        editTextDivisor = findViewById(R.id.editTextDivisor);
        editTextParteEntera = findViewById(R.id.editTextParteEntera);
        editTextNumInvertido = findViewById(R.id.editTextNumeroInv);
        editTextResiduo = findViewById(R.id.editTextResiduo);

        Bundle datos = this.getIntent().getExtras();

        if (datos != null){
            String nombresCap = datos.getString("Nombres");
            String Apellidos = datos.getString("Apellidos");
            editTextNombres.setText(nombresCap);
            editTextApellidos.setText(Apellidos);

            String Dividendo = datos.getString("Dividendo");
            String Divisor = datos.getString("Divisor");
            String Numero = datos.getString("Numero");
            editTextDividendo.setText(Dividendo);
            editTextDivisor.setText(Divisor);
            float dividendo1 = Float.valueOf(Dividendo);
            float divisor1 = Float.valueOf(Divisor);

            float residuo = dividendo1 % divisor1;
            String nn= Float.toString(residuo);
            editTextResiduo.setText(nn);

            float div = dividendo1 / divisor1;
            DecimalFormat dc = new DecimalFormat("#.0");
            String res = dc.format(div);
            editTextParteEntera.setText(res);

            float num = Integer.valueOf(Numero);

            int invertido = 0, resto;

            while( num > 0 ) {
                resto = (int) (num % 10);
                invertido = invertido * 10 + resto;
                num /= 10;
            }

            String inv= Float.toString(invertido);

            editTextNumInvertido.setText(inv);


            buttonMostrarResultado.setEnabled(true);
        }


    }
    public void  Siguiente (View view){

        Intent sigBTN = new Intent (this, MainActivity2.class);

        startActivity(sigBTN);

        finish();

    }

}