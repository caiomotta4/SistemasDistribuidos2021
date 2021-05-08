package br.com.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Orcamento {

    @Id
    private int _id;
    private String DtInicio;
    private String DtFim;
    private int QtdDia;
    private String Descricao;
    private String Titulo;
    private Modulo modulo;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getDtInicio() {
        return DtInicio;
    }

    public void setDtInicio(String dtInicio) {
        DtInicio = dtInicio;
    }

    public String getDtFim() {
        return DtFim;
    }

    public void setDtFim(String dtFim) {
        DtFim = dtFim;
    }

    public int getQtdDia() {
        return QtdDia;
    }

    public void setQtdDia(int qtdDia) {
        QtdDia = qtdDia;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
