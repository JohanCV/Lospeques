package lospeques.jcv.com.lospeques;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import lospeques.jcv.com.lospeques.publicacion.modelo.Publicacion;
import lospeques.jcv.com.lospeques.publicacion.modelo.Publicaciones;

public class Inicio extends AppCompatActivity {

    private TextView txt;
    private Button btnIniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        identificarElementos();
        eventosElementos();

    }

    private void identificarElementos() {
        setTitle("");
        txt = findViewById(R.id.textViewBienvenido);
        btnIniciar = findViewById(R.id.buttonInicio);
    }

    private void eventosElementos() {
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Publicaciones.class);
                startActivity(intent);
            }
        });
    }

}
