package com.example.gamelist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// Conecta la lista de videojuegos con las tarjetas.
public class VideojuegoAdapter
        extends RecyclerView.Adapter<VideojuegoAdapter.VideojuegoViewHolder> {

    // Lista de videojuegos que recibirá el Adapter.
    private List<Videojuego> listaVideojuegos;

    // Constructor: recibe la lista de videojuegos.
    public VideojuegoAdapter(List<Videojuego> listaVideojuegos) {
        this.listaVideojuegos = listaVideojuegos;
    }

    // Mantiene las referencias a las vistas de cada tarjeta.
    public static class VideojuegoViewHolder extends RecyclerView.ViewHolder {

        TextView txtNombre;
        TextView txtGenero;
        TextView txtDescripcion;

        public VideojuegoViewHolder(@NonNull View itemView) {
            super(itemView);

            // Conecta los TextView del XML con las variables Java.
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtGenero = itemView.findViewById(R.id.txtGenero);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
        }
    }

    // Infla el XML para crear una tarjeta.
    @NonNull
    @Override
    public VideojuegoViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_videojuego, parent, false);

        return new VideojuegoViewHolder(vista);
    }

    // Coloca los datos de un videojuego en su tarjeta.
    @Override
    public void onBindViewHolder(
            @NonNull VideojuegoViewHolder holder, int position) {

        // Obtiene el videojuego correspondiente a esta posición.
        Videojuego videojuego = listaVideojuegos.get(position);

        // Muestra sus datos en pantalla.
        holder.txtNombre.setText(videojuego.getNombre());
        holder.txtGenero.setText("Género: " + videojuego.getGenero());
        holder.txtDescripcion.setText(videojuego.getDescripcion());
    }

    // Devuelve la cantidad de videojuegos de la lista.
    @Override
    public int getItemCount() {
        return listaVideojuegos.size();
    }
}