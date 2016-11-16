package br.com.iramarandroid.coremasmovel;

import android.content.ContentValues;

/**
 * Created by iramar on 15/11/16.
 */
public class ItensLugar {

    private int id;
    private String nome;
    private String bairro;
    private String rua;
    private String numero;
    private String telefone1;
    private String telefone2;
    private String categoria;
    private String favorito;
    private String logo;
    private String facebook;
    private String whatApp;
    private String instagram;
    private String email;


    public ItensLugar(int id, String bairro, String nome, String rua, String numero, String telefone1, String telefone2, String categoria, String favorito, String logo, String facebook, String whatApp, String instagram, String email) {
        this.id = id;
        this.bairro = bairro;
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.categoria = categoria;
        this.favorito = favorito;
        this.logo = logo;
        this.facebook = facebook;
        this.whatApp = whatApp;
        this.instagram = instagram;
        this.email = email;
    }


    public ItensLugar(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getWhatApp() {
        return whatApp;
    }

    public void setWhatApp(String whatApp) {
        this.whatApp = whatApp;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContentValues getContentValues() {
        ContentValues cv = new ContentValues();
        cv.put("nome", this.nome);
        cv.put("bairro", this.bairro);
        cv.put("rua", this.rua);
        cv.put("numero", this.numero);
        cv.put("telefone1", this.telefone1);
        cv.put("telefone2", this.telefone2);
        cv.put("categoria", this.categoria);
        cv.put("favorito", this.favorito);
        cv.put("logo", this.logo);
        cv.put("facebook", this.facebook);
        cv.put("whatsApp", this.whatApp);
        cv.put("instagram", this.instagram);
        cv.put("email", this.email);
        return cv;
    }


}

