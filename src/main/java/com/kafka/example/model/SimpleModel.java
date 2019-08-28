package com.kafka.example.model;

public class SimpleModel {

    private String titulo;
    private String descricao;

    public SimpleModel(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public SimpleModel() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "SimpleModel{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
