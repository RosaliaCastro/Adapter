package com.example.alumno.telefono;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by alumno on 27/04/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<Persona> personas;

    public MyAdapter(List<Persona> personas){
        this.personas=personas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
        //crea el elemento xml
        //hace un una view con el metodo inflate de una xml
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Persona p = personas.get(position);
        holder.setTxtNombreApe(p.getNombre(),p.getApellido());
        //llena el objeto con la informacion que corresponde

    }

    @Override
    public int getItemCount() {
        return personas.size();
        //retorna la cantidad de elementos a dibujar
    }
}
