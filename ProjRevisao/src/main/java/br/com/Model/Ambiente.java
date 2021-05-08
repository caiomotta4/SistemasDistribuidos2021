package br.com.Model;

import org.springframework.data.annotation.Id;

public class Ambiente {
    @Id
    private String _id;
    private String Descricao;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
