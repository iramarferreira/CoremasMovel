package br.com.iramarandroid.coremasmovel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TabCategorias extends ListFragment implements AdapterView.OnItemClickListener {

    AdapterItensCategoria adapterListViewCategoria;
    ArrayList<ItemCategoria> itens = new ArrayList<ItemCategoria>();

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.activity_tab_categorias, container, false);
//        return view;
//    }

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
        getListView().setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        ItemCategoria itemCategoria = (ItemCategoria) adapterView.getItemAtPosition(i);
        Intent intent = new Intent(getContext(), Lugares.class);
        intent.putExtra("categoria", itemCategoria.getNome());
        startActivity(intent);
        getActivity().finish();
    }

    private ArrayList<ItemCategoria> gerarDados() {
//        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
//        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
//        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
//        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
//        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
//        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
//        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
//        itens.add(new ItemCategoria("Academias","ic_academia_roxo"));
        itens.add(new ItemCategoria("Academias","ic_academia"));
        itens.add(new ItemCategoria("Açougues","ic_acougue"));
        itens.add(new ItemCategoria("Advocacia","ic_advocacia"));
        itens.add(new ItemCategoria("Associações","ic_associacao"));
        itens.add(new ItemCategoria("Auto Peças","ic_auto_peca"));
        itens.add(new ItemCategoria("Bancos","ic_bancos"));
        itens.add(new ItemCategoria("Bares","ic_bares"));
        itens.add(new ItemCategoria("Bicicletas","ic_bicicleta"));
        itens.add(new ItemCategoria("Borracharias","ic_borracharia"));
        itens.add(new ItemCategoria("Calçados","ic_calcado"));
        itens.add(new ItemCategoria("Cartórios","ic_cartorio"));
        itens.add(new ItemCategoria("Casa e Construção","ic_casa_construcao"));
        itens.add(new ItemCategoria("Celulares","ic_celulares"));
        itens.add(new ItemCategoria("Churrascarias","ic_churrrascaria"));
        itens.add(new ItemCategoria("Clínicas Médicas","ic_clinicas_medicas"));
        itens.add(new ItemCategoria("Comunicação Visual","ic_comunicaca_visual"));
        itens.add(new ItemCategoria("Concessionárias","ic_concessionaria"));
        itens.add(new ItemCategoria("Contabilidade","ic_contabilidade"));
        itens.add(new ItemCategoria("Copiadoras","ic_copiadoras"));
        itens.add(new ItemCategoria("Distribuidoras","ic_distribuidoras"));
        itens.add(new ItemCategoria("Docerias","ic_docerias"));
        itens.add(new ItemCategoria("Eletrônicas","ic_eletronicas"));
        itens.add(new ItemCategoria("Equipadoras","ic_equipadoras"));
        itens.add(new ItemCategoria("Escolas","ic_escola"));
        itens.add(new ItemCategoria("Farmácias","ic_farmacia"));
        itens.add(new ItemCategoria("Festas e Eventos","ic_festas_eventos"));
        itens.add(new ItemCategoria("Floriculturas","ic_floricultura"));
        itens.add(new ItemCategoria("Fotografia","ic_fotografia"));
        itens.add(new ItemCategoria("Frutarias","ic_frutarias"));
        itens.add(new ItemCategoria("Funerárias","ic_funerarias"));
        itens.add(new ItemCategoria("Gás","ic_gas"));
        itens.add(new ItemCategoria("Gráficas","ic_graficas"));
        itens.add(new ItemCategoria("Hospitais","ic_hospitais"));
        itens.add(new ItemCategoria("Hotéis e Pousadas","ic_hoteis_pousadas"));
        itens.add(new ItemCategoria("Igrejas","ic_igrejas"));
        itens.add(new ItemCategoria("Imobiliária","ic_imobiliaria"));
        itens.add(new ItemCategoria("Importados","ic_importados"));
        itens.add(new ItemCategoria("Indústrias e Fábricas","ic_industrias_fabricas"));
        itens.add(new ItemCategoria("Informática","ic_informatica"));
        itens.add(new ItemCategoria("Internet","ic_internet"));
        itens.add(new ItemCategoria("Laboratórios","ic_laboratorio"));
        itens.add(new ItemCategoria("Lanches","ic_lanches"));
        itens.add(new ItemCategoria("Livrarias","ic_livrarias"));
        itens.add(new ItemCategoria("Lojas","ic_lojas"));
        itens.add(new ItemCategoria("Marmitarias","ic_marmitarias"));
        itens.add(new ItemCategoria("Moda","ic_moda"));
        itens.add(new ItemCategoria("Motéis","ic_moteis"));
        itens.add(new ItemCategoria("Moto Táxis","ic_moto_taxi"));
        itens.add(new ItemCategoria("Móveis e Eletros","ic_moteis_eletros"));
        itens.add(new ItemCategoria("Oficinas","ic_oficinas"));
        itens.add(new ItemCategoria("Óticas","ic_oticas"));
        itens.add(new ItemCategoria("Padarias","ic_padarias"));
        itens.add(new ItemCategoria("Perfumes e Cosméticos","ic_perfumes_cosmeticos"));
        itens.add(new ItemCategoria("Pizzarias","ic_pizzarias"));
        itens.add(new ItemCategoria("Postos","ic_postos"));
        itens.add(new ItemCategoria("Publicidade","ic_publicidade"));
        itens.add(new ItemCategoria("Queijeiras","ic_queijeiras"));
        itens.add(new ItemCategoria("Rádios","ic_radios"));
            itens.add(new ItemCategoria("Restaurantes","ic_restaurantes"));
        itens.add(new ItemCategoria("Salão de Beleza","ic_salao_beleza"));
        itens.add(new ItemCategoria("Saúde","ic_saude"));
        itens.add(new ItemCategoria("Serviços","ic_servicos"));
        itens.add(new ItemCategoria("Som e Imagem","ic_som_imagem"));
        itens.add(new ItemCategoria("Sorveterias","ic_sorveterias"));
        itens.add(new ItemCategoria("Supermecados","ic_supermecado"));
        itens.add(new ItemCategoria("Taxí","ic_taxi"));
        itens.add(new ItemCategoria("Telefones Úteis","ic_telefones_uteis"));
        itens.add(new ItemCategoria("Transportes","ic_transportes"));
        itens.add(new ItemCategoria("Turismo","ic_turismo"));
        itens.add(new ItemCategoria("Variedades","ic_variedade"));
        itens.add(new ItemCategoria("Veículos","ic_veiculos"));
        itens.add(new ItemCategoria("Vidraçaria","ic_vidracaria"));



        return itens;
    }

}
