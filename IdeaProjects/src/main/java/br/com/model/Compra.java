package br.com.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Compra {

    @org.springframework.data.annotation.Id
    private String _id;
    private String IDFilme;
    private String NomeF;
    private String IDCliente;
    private String NomeC;


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getIDFilme() {
        return IDFilme;
    }

    public void setIDFilme(String IDFilme) {
        this.IDFilme = IDFilme;
    }

    public String getNomeF() {
        return NomeF;
    }

    public void setNomeF(String nomeF) {
        NomeF = nomeF;
    }

    public String getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(String IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNomeC() {
        return NomeC;
    }

    public void setNomeC(String nomeC) {
        NomeC = nomeC;
    }
}
