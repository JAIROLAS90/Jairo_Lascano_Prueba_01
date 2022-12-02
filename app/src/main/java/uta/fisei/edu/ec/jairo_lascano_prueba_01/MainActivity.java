package uta.fisei.edu.ec.jairo_lascano_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        editTextNumInvertido = findViewById(R.id.editTextNumero);
        editTextResiduo = findViewById(R.id.editTextResiduo);




    }
    public void  Siguiente (View view){

        Intent sigBTN = new Intent (this, MainActivity2.class);

        startActivity(sigBTN);

        finish();

    }

}