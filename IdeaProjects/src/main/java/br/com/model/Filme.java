package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Filme {

    @org.springframework.data.annotation.Id
    private String _id;
    private String NomeFilme;
    private String GeneFilme;
    private String DiretorFilme;
    private String SinopseFilme;
    private String Preco;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNomeFilme() {
        return NomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        NomeFilme = nomeFilme;
    }

    public String getGeneFilme() {
        return GeneFilme;
    }

    public void setGeneFilme(String geneFilme) {
        GeneFilme = geneFilme;
    }

    public String getDiretorFilme() {
        return DiretorFilme;
    }

    public void setDiretorFilme(String diretorFilme) {
        DiretorFilme = diretorFilme;
    }

    public String getSinopseFilme() {
        return SinopseFilme;
    }

    public void setSinopseFilme(String sinopseFilme) {
        SinopseFilme = sinopseFilme;
    }

    public String getPreco() {
        return Preco;
    }

    public void setPreco(String preco) {
        Preco = preco;
    }
}