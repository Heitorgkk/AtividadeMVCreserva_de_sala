package org.example.entity;

public class Sala {

    private long id;
    private int numero;
    private int capacidade;
    private boolean disponivel;


    public Sala(long id, int numero, int capacidade, boolean disponivel){
        this.id = id;
        this.numero = numero;
        this.capacidade = capacidade;
        this.disponivel = disponivel;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getCapacidade(){
        return capacidade;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }


    public void exibirDados(){
        System.out.println("Id :"+ id);
        System.out.println("Numero: "+numero);
        System.out.println("Capacidade: "+capacidade);

        if(disponivel){
            System.out.println("Disponivel");
        }else{
            System.out.println("Indisponivel");
        }
    }

}
