package br.com.iramarandroid.coremasmovel;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TabCategorias extends ListFragment {

    AdapterItensCategoria adapterListViewCategoria;
    ArrayList<ItemCategoria> itens = new ArrayList<ItemCategoria>();

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        adapterListViewCategoria = new AdapterItensCategoria(getActivity().getApplication(), gerarDados());
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View list = inflater.inflate(R.layout.item_categorias, null);

        ListView listView = (ListView) list.findViewById(R.id.listViewCategorias);

        //listView.setAdapter(adapterListViewMusicas);
        adapterListViewCategoria.notifyDataSetChanged();

        setListAdapter(adapterListViewCategoria);


    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        // TODO implement some logic
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ItemCategoria itemCategoria = (ItemCategoria) adapterView.getItemAtPosition(i);
                Toast.makeText(getContext().getApplicationContext(), itemCategoria.getNome(),Toast.LENGTH_LONG).show();

            }
        });
    }


    private ArrayList<ItemCategoria> gerarDados() {
        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
//        itens.add(new ItemCategoria("Academias","ic_academia"));
//        itens.add(new ItemCategoria("Açougues","ic_acougue"));
//        itens.add(new ItemCategoria("Advocacia","ic_advocacia"));
//        itens.add(new ItemCategoria("Associações","ic_associacao"));
//        itens.add(new ItemCategoria("Auto Peças","ic_auto_peca"));
//        itens.add(new ItemCategoria("Bancos","ic_bancos"));
//        itens.add(new ItemCategoria("Bares","ic_bares"));
//        itens.add(new ItemCategoria("Bicicletas","ic_bicicleta"));
//        itens.add(new ItemCategoria("Borracharias","ic_borracharia"));
//        itens.add(new ItemCategoria("Calçados","ic_calcado"));
//        itens.add(new ItemCategoria("Cartórios","ic_cartorio"));
//        itens.add(new ItemCategoria("Casa e Construção","ic_casa_construcao"));
//        itens.add(new ItemCategoria("Escola","ic_escola"));
        return itens;
    }

}
