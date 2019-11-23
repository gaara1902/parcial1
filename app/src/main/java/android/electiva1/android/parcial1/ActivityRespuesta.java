package android.electiva1.android.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityRespuesta extends AppCompatActivity {
    private TextView nombre;
    private TextView apellido;
    private TextView email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.respuesta);


        //Localizar los controles
        nombre = (TextView) findViewById(R.id.txtnombre);
        apellido = (TextView) findViewById(R.id.txtapellido);
        email = (TextView) findViewById(R.id.txtemail);

//Recuperamos la información pasada en el intent
        Bundle datos = this.getIntent().getExtras();

//Construimos el mensaje a mostrar

        nombre.setText("Nombre: " + datos.getString("NOMBRE"));
        apellido.setText("Apellido: " + datos.getString("APELLIDO"));
        email.setText("Email: " + datos.getString("EMAIL"));

    }
}
