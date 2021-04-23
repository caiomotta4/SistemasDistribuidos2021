package br.com.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Compra {

    @org.springframework.data.annotation.Id
    private String _id;
    private Filme Filme;
    private String NomeF;
    private Client Client;
    private String NomeC;


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public br.com.model.Filme getFilme() {
        return Filme;
    }

    public void setFilme(br.com.model.Filme filme) {
        Filme = filme;
    }

    public br.com.model.Client getClient() {
        return Client;
    }

    public void setClient(br.com.model.Client client) {
        Client = client;
    }

    public String getNomeF() {
        return NomeF;
    }

    public void setNomeF(String nomeF) {
        NomeF = nomeF;
    }



    public String getNomeC() {
        return NomeC;
    }

    public void setNomeC(String nomeC) {
        NomeC = nomeC;
    }
}
