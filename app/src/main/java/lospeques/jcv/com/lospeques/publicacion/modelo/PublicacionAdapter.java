package lospeques.jcv.com.lospeques.publicacion.modelo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import lospeques.jcv.com.lospeques.R;

public class PublicacionAdapter extends RecyclerView.Adapter<PublicacionAdapter.PublicacionViewHolder> {

    private ArrayList<Publicacion> data;

    public PublicacionAdapter(ArrayList<Publicacion> data) {
        this.data = data;
    }

    @Override
    public PublicacionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PublicacionViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_publicacion, parent, false));
    }

    @Override
    public void onBindViewHolder(PublicacionViewHolder holder, int position) {
        Publicacion publicacion = data.get(position);
        holder.imgPublicacion.setImageResource(publicacion.getFoto());
        holder.tvNombre.setText(publicacion.getNombre());
        holder.tvFecha.setText(publicacion.getFecha());
        holder.tvHora.setText(publicacion.getHora());
        holder.tvPublicacion.setText(publicacion.getMensaje());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class PublicacionViewHolder extends RecyclerView.ViewHolder{

        ImageView imgPublicacion;
        TextView tvPublicacion, tvNombre,tvFecha, tvHora;

        public PublicacionViewHolder(View itemView) {
            super(itemView);
            imgPublicacion = (ImageView) itemView.findViewById(R.id.imgAuthor);
            tvNombre = (TextView) itemView.findViewById(R.id.tv_nombre);
            tvFecha = (TextView) itemView.findViewById(R.id.tv_fecha);
            tvHora = (TextView) itemView.findViewById(R.id.tv_hora);
            tvPublicacion = (TextView) itemView.findViewById(R.id.txt_publicacion);
        }
    }
}
