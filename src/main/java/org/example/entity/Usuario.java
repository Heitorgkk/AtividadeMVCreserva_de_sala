package org.example.entity;

public class Usuario {

    private long id;
    private String nome;
    private String cpf;

    public Usuario (long id, String nome, String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void exibirDados(){
        System.out.println("Id: "+ id);
        System.out.println("Nome: "+ nome);
        System.out.println("CPF: "+ cpf);
    }
}
