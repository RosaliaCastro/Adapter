package com.example.alumno.telefono;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 27/04/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    View vista;

    public MyViewHolder (View vista){
        super(vista);
        this.vista=vista;

    }

    public void setTxtNombreApe(String nombre, String apellido) {
        TextView txtNombre = (TextView)itemView.findViewById(R.id.txtnombre);
        TextView txtApellido = (TextView)itemView.findViewById(R.id.txtApellido);
        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
    }


}
