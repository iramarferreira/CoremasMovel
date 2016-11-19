package br.com.iramarandroid.coremasmovel;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Lugares extends AppCompatActivity {

    ArrayList<ItensLugar> itens = new ArrayList<ItensLugar>();
    private LugaresController db = new LugaresController(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);

        Intent intent = getIntent();
        String categoria = intent.getStringExtra("categoria");


        ActionBar ab = getSupportActionBar();
        ab.setTitle(categoria);
        //ab.setSubtitle(R.string.subTitulo);
        ab.setBackgroundDrawable(getResources().getDrawable(R.color.colorPrimary));
        ab.setDisplayHomeAsUpEnabled(true);

        final AdapterItensLugar adapterListViewAdapterItensLugar = new AdapterItensLugar(this, gerarDados(categoria));

        ListView listView = (ListView) findViewById(R.id.listViewLugares);

        listView.setAdapter(adapterListViewAdapterItensLugar);
        adapterListViewAdapterItensLugar.notifyDataSetChanged();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

//                ItensLugar itensDisciplinas = (ItensLugar) adapterView.getItemAtPosition(i);
//
//                Intent intent = new Intent(Lugares.this, DetalheLugares.class);
//                intent.putExtra("nomeDisciplina", itensDisciplinas.getNome());
//                intent.putExtra("nota1", itensDisciplinas.getNota1());
//                intent.putExtra("nota2", itensDisciplinas.getNota2());
//                intent.putExtra("nota3", itensDisciplinas.getNota3());
//                intent.putExtra("nota4", itensDisciplinas.getNota4());
//
//                startActivity(intent);
//                Lugares.this.finish();

            }

        });



    }

    private ArrayList<ItensLugar> gerarDados(String categ) {

        Cursor cursor;
        try {
            cursor = db.carregaDados();


        }catch (Exception e) {
            Toast.makeText(this, "Falha ao carregar os dados", Toast.LENGTH_LONG).show();
            cursor = null;
        }

        if(cursor != null) {
            while (cursor.moveToNext()) {
                int id = cursor.getInt(cursor.getColumnIndex("id"));
                String nome = cursor.getString(cursor.getColumnIndex("nome"));
                String bairro = cursor.getString(cursor.getColumnIndex("bairro"));
                String rua = cursor.getString(cursor.getColumnIndex("rua"));
                String numero = cursor.getString(cursor.getColumnIndex("numero"));
                String telefone1 = cursor.getString(cursor.getColumnIndex("telefone1"));
                String telefone2 = cursor.getString(cursor.getColumnIndex("telefone2"));
                String categoria = cursor.getString(cursor.getColumnIndex("categoria"));
                String favorito = cursor.getString(cursor.getColumnIndex("favorito"));
                String logo = cursor.getString(cursor.getColumnIndex("logo"));
                String facebook = cursor.getString(cursor.getColumnIndex("facebook"));
                String whatsApp = cursor.getString(cursor.getColumnIndex("whatsApp"));
                String instagram = cursor.getString(cursor.getColumnIndex("instagram"));
                String email = cursor.getString(cursor.getColumnIndex("email"));
                ItensLugar itensLugar =
                        new ItensLugar(id, nome, bairro, rua, numero, telefone1, telefone2, categoria, favorito,
                                logo, facebook, whatsApp, instagram, email);


                if (categoria.equals(categ)) {
                    itens.add(itensLugar);
                }
            }
        }
        return itens;

    }




    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();


        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        Lugares.this.finish();
        startActivityForResult(myIntent, 0);
        return true;

    }


    @Override
    public void onBackPressed() {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        Lugares.this.finish();
    }

}
