package br.com.iramarandroid.coremasmovel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by iramar on 16/11/16.
 */
public class AdapterItensLugar extends ArrayAdapter<ItensLugar> {

    private final Context context;
    private final ArrayList<ItensLugar> itens;

    public AdapterItensLugar(Context context, ArrayList<ItensLugar> itens) {
        super(context, R.layout.item_lugar, itens);
        this.context = context;
        this.itens = itens;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View item_lugar = inflater.inflate(R.layout.item_lugar, parent, false);

        TextView textNomeLugar = (TextView) item_lugar.findViewById(R.id.nomeLugar);
        TextView endereco = (TextView) item_lugar.findViewById(R.id.nomeEndereco);


        textNomeLugar.setText(itens.get(position).getNome());
        endereco.setText(itens.get(position).getRua() + ", " + itens.get(position).getNumero() + " - " +
                itens.get(position).getBairro());



        return item_lugar;

    }




}
