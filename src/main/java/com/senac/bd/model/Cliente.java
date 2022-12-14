package com.senac.bd.model;

public class Cliente {

    private Long id;
    private String nome;
    private String cpf;

    public Cliente() {
    }

    public Cliente(long id, String nome, String cpf) {
        setId(id);
        setNome(nome);
        setCpf(cpf);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "-> " + id + " - " + nome + " - " + cpf;
    }

}
