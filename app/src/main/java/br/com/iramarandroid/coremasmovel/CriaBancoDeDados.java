package br.com.iramarandroid.coremasmovel;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLException;

/**
 * Created by iramar on 15/11/16.
 */
public class CriaBancoDeDados extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "CoremasMovel.db";
    private static final int VERSAO_BANCO = 1;
    private Context context;
    private SQLiteDatabase dbInstancia = null;


    public CriaBancoDeDados(Context context) {
        super(context, NOME_BANCO, null, VERSAO_BANCO);
        context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE lugar (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nome TEXT NOT NULL, bairro TEXT NOT NULL, rua TEXT NOT NULL, " +
                "numero TEXT NOT NULL, telefone1 TEXT NOT NULL, telefone2 TEXT NOT NULL, " +
                "categoria TEXT NOT NULL, favorito TEXT NOT NULL, logo TEXT NOT NULL," +
                "facebook TEXT NOT NULL, whatsApp TEXT NOT NULL, instagram TEXT NOT NULL, " +
                "email TEXT NOT NULL )");


        db.execSQL("INSERT INTO disciplina ('nome', 'bairro', 'rua', 'numero', 'telefone1, " +
                "telefone2', 'categoria', 'favorito', 'facebook', 'whatsApp', 'instagram', 'email') " +
                "Values ('n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n')");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS lugar");
        onCreate(db);
    }

    public void abrirDB() throws SQLException {
        if (this.dbInstancia == null){
            this.dbInstancia = this.getWritableDatabase();
        }
    }

    public void fecharDB() throws SQLException {
        if (this.dbInstancia != null) {
            if (this.dbInstancia.isOpen())
                this.dbInstancia.close();
        }
    }


}
