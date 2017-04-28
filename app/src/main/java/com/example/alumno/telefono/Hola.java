package com.example.alumno.telefono;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Hola extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola);

        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.rvPersonas);
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Jose","Perez"));
        personas.add(new Persona("Matias","Perez"));
        personas.add(new Persona("Jorge","Perez"));
        personas.add(new Persona("Juan","Perez"));
        personas.add(new Persona("Jose","Perez"));
        personas.add(new Persona("Jose","Perez"));
        personas.add(new Persona("Jose","Perez"));
        personas.add(new Persona("Jose","Perez"));
        personas.add(new Persona("Jose","Perez"));
        personas.add(new Persona("Jose","Perez"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MyAdapter myAdapter = new MyAdapter(personas);
        recyclerView.setAdapter(myAdapter);
    }
}
