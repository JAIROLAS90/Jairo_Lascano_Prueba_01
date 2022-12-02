package uta.fisei.edu.ec.jairo_lascano_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText editTextNombres;
    private EditText editTextApellidos;
    private TextView textViewNombres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editTextNombres = findViewById(R.id.editTextTextNombres);
        editTextApellidos = findViewById(R.id.editTextApellidos);
        textViewNombres = findViewById(R.id.textViewNombres);

        Bundle datos = this.getIntent().getExtras();
        String Nombres = datos.getString("Nombres");
        String Apellidos = datos.getString("Apellidos");

        textViewNombres.setText(Nombres);

        editTextNombres.setText(Nombres);
        editTextApellidos.setText(Apellidos);
    }
}