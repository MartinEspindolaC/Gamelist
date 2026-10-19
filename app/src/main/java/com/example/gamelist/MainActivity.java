package com.example.gamelist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Lista que almacenará los videojuegos.
    private List<Videojuego> listaVideojuegos;

    // Componente que mostrará las tarjetas.
    private RecyclerView recyclerVideojuegos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Carga el diseño de la pantalla principal.
        setContentView(R.layout.activity_main);

        // Conecta la variable con el RecyclerView del XML.
        recyclerVideojuegos = findViewById(R.id.recyclerVideojuegos);

        // Crea una lista vacía.
        listaVideojuegos = new ArrayList<>();

        // Agrega los videojuegos a la lista.
        listaVideojuegos.add(new Videojuego(
                "Minecraft",
                "Sandbox",
                "Construcción, creatividad y exploración."
        ));

        listaVideojuegos.add(new Videojuego(
                "Hollow Knight",
                "Metroidvania",
                "Explora un reino subterráneo lleno de misterios."
        ));

        listaVideojuegos.add(new Videojuego(
                "Stardew Valley",
                "Simulación",
                "Administra tu granja y conoce a sus habitantes."
        ));

        listaVideojuegos.add(new Videojuego(
                "The Legend of Zelda",
                "Aventura",
                "Resuelve desafíos y explora un mundo fantástico."
        ));

        listaVideojuegos.add(new Videojuego(
                "Terraria",
                "Sandbox",
                "Excava, construye y descubre nuevos lugares."
        ));

        // Configura una lista vertical desplazable.
        recyclerVideojuegos.setLayoutManager(
                new LinearLayoutManager(this)
        );

        // Crea el Adapter y le entrega la lista.
        VideojuegoAdapter adapter =
                new VideojuegoAdapter(listaVideojuegos);

        // Conecta el Adapter con el RecyclerView.
        recyclerVideojuegos.setAdapter(adapter);
    }
}