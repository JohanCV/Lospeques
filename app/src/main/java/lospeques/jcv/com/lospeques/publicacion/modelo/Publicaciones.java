package lospeques.jcv.com.lospeques.publicacion.modelo;

import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import lospeques.jcv.com.lospeques.R;

public class Publicaciones extends AppCompatActivity {
    private FloatingActionButton fab;
    private TextView txtPublicacionResultado;
    private RecyclerView rvPublicaciones;
    private GridLayoutManager glm;
    private PublicacionAdapter adapter;

    //Date fecha = new Date();
    //Time now = new Time();
    //Date currentTime = Calendar.getInstance().getTime();

    ArrayList<Publicacion> data = new ArrayList<>();
    String publicacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicaciones);

        identificarElementos();
        eventosElementos();
    }

    private void identificarElementos() {
        setTitle("PUBLICACIONES");

        fab = findViewById(R.id.floatingActionButton);
        txtPublicacionResultado = findViewById(R.id.textViewResult);
        rvPublicaciones = findViewById(R.id.recyclerViewPublicacion);

        glm = new GridLayoutManager(this, 2);
        rvPublicaciones.setLayoutManager(glm);
        adapter = new PublicacionAdapter(dataSet(data));
        rvPublicaciones.setAdapter(adapter);
    }
    private void eventosElementos() {
       fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Publicaciones.this, "FB", Toast.LENGTH_SHORT).show();
                showInputDialog();
            }
        });
    }

    private ArrayList<Publicacion> dataSet(ArrayList<Publicacion> data) {

        return data;
    }
    protected void showInputDialog(){
        // get prompts.xml view
        LayoutInflater layoutInflater = LayoutInflater.from(Publicaciones.this);
        View promptView = layoutInflater.inflate(R.layout.input_dialog_publicacion, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Publicaciones.this);
        alertDialogBuilder.setView(promptView);

        final EditText editText = (EditText) promptView.findViewById(R.id.edittext);
        // setup a dialog window
        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        setPublicacion(String.valueOf(editText.getText()));
                        //String fecha = String.valueOf(currentTime);
                        //String hora = String.valueOf(now);
                        //data.get(0).setFecha(fecha);
                        //data.get(0).setHora(hora);
                        data.add(new Publicacion(R.drawable.user,"Johan","29/04/19","20:59",getPublicacion()));

                        adapter.notifyDataSetChanged();
                    }
                })
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

        // create an alert dialog
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }
}
