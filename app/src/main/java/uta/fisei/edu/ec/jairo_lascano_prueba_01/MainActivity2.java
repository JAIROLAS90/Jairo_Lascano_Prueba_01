package uta.fisei.edu.ec.jairo_lascano_prueba_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private Button buttonSiguiente;
    private Button buttoncerrar;
    private EditText editTextNombres;
    private EditText editTextApellidos;
    private EditText editTextDividendo;
    private EditText editTextDivisor;
    private EditText editTextNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        buttonSiguiente = findViewById(R.id.buttonSiguiente);
         buttoncerrar = findViewById(R.id.buttuonCerrar);
        editTextNombres = findViewById(R.id.editTextTextNombres);
        editTextApellidos = findViewById(R.id.editTextApellidos);
        editTextDividendo = findViewById(R.id.editTextDividendo);
        editTextDivisor = findViewById(R.id.editTextDivisor);
        editTextNumero = findViewById(R.id.editTextNumero);

        Bundle datos = this.getIntent().getExtras();

        if(datos !=null){
            String Dividendo = datos.getString("Dividendo");
            String Divisor = datos.getString("Divisor");
            String Numero = datos.getString("Numero");
            editTextDividendo.setText(Dividendo);
            editTextDivisor.setText(Divisor);
            editTextNumero.setText(Numero);
        }



}
    public void  Siguiente (View view){

        Intent intent = new Intent (this, MainActivity3.class);
        intent.putExtra("Nombres",editTextNombres.getText().toString());
        intent.putExtra("Apellidos", editTextApellidos.getText().toString());
        intent.putExtra("Divideno",editTextDividendo.getText().toString());
        intent.putExtra("Divosor",editTextDivisor.getText().toString());
        intent.putExtra("Numero",editTextNumero.getText().toString());
        startActivity(intent);

        finish();
    }
    public void  Cerrar (View view){

        Intent intent = new Intent (this, MainActivity.class);
        intent.putExtra("Nombres",editTextNombres.getText());
        intent.putExtra("Apellidos", editTextApellidos.getText());
        intent.putExtra("Divideno",editTextDividendo.getText());
        intent.putExtra("Divosor",editTextDivisor.getText());
        intent.putExtra("Numero",editTextNumero.getText());
        startActivity(intent);

        finish();
    }





}


