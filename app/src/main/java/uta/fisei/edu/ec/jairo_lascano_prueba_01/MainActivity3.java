package uta.fisei.edu.ec.jairo_lascano_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private Button buttoncerrar;
    private EditText editTextNombres;
    private EditText editTextApellidos;
    private EditText editTextDividendo;
    private EditText editTextDivisor;
    private EditText editTextNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        buttoncerrar = findViewById(R.id.buttuonCerrar);
        editTextNombres = findViewById(R.id.editTextTextNombres);
        editTextApellidos = findViewById(R.id.editTextApellidos);
        editTextDividendo = findViewById(R.id.editTextDividendo);
        editTextDivisor = findViewById(R.id.editTextDivisor);
        editTextNumero = findViewById(R.id.editTextNumero);


        Bundle datos = this.getIntent().getExtras();

        if(datos !=null){
            String nombresCap = datos.getString("Nombres");
            String Apellidos = datos.getString("Apellidos");
            editTextNombres.setText(nombresCap);
            editTextApellidos.setText(Apellidos);
        }


    }

    public void  Cerrar (View view){

        Intent intent = new Intent (this, MainActivity.class);
        intent.putExtra("Divideno",editTextDividendo.getText());
        intent.putExtra("Divosor",editTextDivisor.getText());
        intent.putExtra("Numero",editTextNumero.getText());
        startActivity(intent);

        finish();
    }
}