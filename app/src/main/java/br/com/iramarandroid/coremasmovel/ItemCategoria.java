package br.com.iramarandroid.coremasmovel;

/**
 * Created by iramar on 08/11/16.
 */
public class ItemCategoria {

    private String nome;
    private String imagem;

    public ItemCategoria(String nome, String imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    public ItemCategoria(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
