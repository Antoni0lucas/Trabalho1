package com.example.lucasnascimento.trabalho1;

public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String name, String password){
        nome = name;
        senha = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
