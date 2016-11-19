package br.com.iramarandroid.coremasmovel;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLException;

/**
 * Created by iramar on 16/11/16.
 */
public class LugaresController {

    private SQLiteDatabase dbInstancia;
    private CriaBancoDeDados banco;
    Context context;

    public LugaresController(Context context){
        banco = new CriaBancoDeDados(context);
        this.context = context;
    }


    public void salvarLugares(ItensLugar itensLugar) throws SQLException {
        banco.abrirDB();
        dbInstancia = banco.getWritableDatabase();
        dbInstancia.insert("lugar", null, itensLugar.getContentValues());
        //Toast.makeText(context, "Disciplina cadastrada.",
        //        Toast.LENGTH_LONG).show();

        banco.fecharDB();
    }

    public Cursor carregaDados() throws SQLException {
        banco.abrirDB();
        Cursor cursor;
        String[] campos =  {"id","nome","bairro", "rua","numero","telefone1", "telefone2",
                "categoria", "favorito", "logo", "facebook", "whatsApp","instagram","email"};
        dbInstancia = banco.getReadableDatabase();
        cursor = dbInstancia.query("lugar", campos, null, null, null, null, null, null);
//        ArrayList<ItemListViewAreasSelecionadas> lista = new ArrayList<ItemListViewAreasSelecionadas>();
        if(cursor!=null){
            cursor.moveToFirst();
        }
        banco.fecharDB();
        return cursor;
    }


    public void deletaRegistro(int id) throws SQLException {
        banco.abrirDB();
        String where = "id = " + id;

        dbInstancia = banco.getReadableDatabase();
        dbInstancia.delete("lugar",where,null);
        //Toast.makeText(context, "Disciplina removida",
        //        Toast.LENGTH_LONG).show();
        banco.fecharDB();
    }

    public void atualizarRegistro(ItensLugar itensLugar) throws SQLException {
        banco.abrirDB();
        String where = "id = " + itensLugar.getId();

        dbInstancia = banco.getReadableDatabase();
        dbInstancia.update("lugar",itensLugar.getContentValues(), where,null);

        banco.fecharDB();
    }
}
