package br.com.iramarandroid.coremasmovel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by iramar on 08/11/16.
 */
public class AdapterItensCategoria extends ArrayAdapter<ItemCategoria> {

    private final Context context;
    private final ArrayList<ItemCategoria> itens;

    public AdapterItensCategoria(Context context, ArrayList<ItemCategoria> itens) {
        super(context, R.layout.item_categorias, itens);
        this.context = context;
        this.itens = itens;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View item_categoria = inflater.inflate(R.layout.item_categorias, parent, false);

        TextView textNomeCategoria = (TextView) item_categoria.findViewById(R.id.text_nome);
        ImageView imageCategoria = (ImageView) item_categoria.findViewById(R.id.image_categoria);


        textNomeCategoria.setText(itens.get(position).getNome());
        imageCategoria.setImageResource(context.getResources().getIdentifier((String)itens.get(position).getImagem(), "drawable", context.getPackageName()));



        return item_categoria;

    }


}
