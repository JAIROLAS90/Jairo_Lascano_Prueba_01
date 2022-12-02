package uta.fisei.edu.ec.jairo_lascano_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    private EditText editTextNombres;
    private EditText editTextApellidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editTextNombres = findViewById(R.id.editTextTextNombres);
        editTextApellidos = findViewById(R.id.editTextApellidos);

        Bundle datos = this.getIntent().getExtras();
        String Nombres = datos.getString("Nombres");
        String Apellidos = datos.getString("Apellidos");

        editTextNombres.setText(Nombres);
        editTextApellidos.setText(Apellidos);
    }
}