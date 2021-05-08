package br.com.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Squad {

    @Id
    private String _id;
    private String nome;
    private String QtdPessoas;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQtdPessoas() {
        return QtdPessoas;
    }

    public void setQtdPessoas(String qtdPessoas) {
        QtdPessoas = qtdPessoas;
    }
}
