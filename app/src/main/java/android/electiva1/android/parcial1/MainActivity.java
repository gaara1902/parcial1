package android.electiva1.android.parcial1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText txtapellido;
    private EditText txtnombre;
    private EditText txtemail;





    private Button btnprevisualizar;
    private Button btnenviarsolicitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//hace referencia a la vista con la cual trabajará (la vista es el archivo .xml)
        //Obtenemos una referencia a los controles de la interfaz
        txtnombre = (EditText) findViewById(R.id.txtnombre);
        txtapellido = (EditText) findViewById(R.id.txtapellido);
        txtemail = (EditText) findViewById(R.id.txtemail);



        btnprevisualizar = (Button) findViewById(R.id.btnprevisualizar);
        btnenviarsolicitud = (Button) findViewById(R.id.btnenviarsolicitud);
//Implementamos el evento click del botón
        btnprevisualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//Creamos el Intent

                Intent intent = new Intent(MainActivity.this, ActivityRespuesta.class);
//Creamos la información a pasar entre actividades
                Bundle b = new Bundle();
                b.putString("NOMBRE", txtnombre.getText().toString());
                b.putString("APELLIDO", txtapellido.getText().toString());
                b.putString("EMAIL", txtemail.getText().toString());


//Añadimos la información al intent
                intent.putExtras(b);
//Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
        btnenviarsolicitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast1 = Toast.makeText(getApplicationContext(), "Solicitud enviada", Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.CENTER, 0, 0);

                toast1.show();
            }
        });
    }
}