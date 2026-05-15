package org.example.view;

import org.example.controller.SalaController;

import java.util.Scanner;

public class SalaView {

    Scanner input = new Scanner(System.in);
    SalaController salaController = new SalaController();

    public void menuCadastroSala(){

        System.out.println("Insira o numero da sala: ");
        int numero = input.nextInt();
        System.out.println("Insira a capacidade da sala: ");
        int capacidade = input.nextInt();

        boolean sucesso = salaController.cadastrarSala();
        if(sucesso){
            System.out.println("Cadastro da sala bem sucedido");
        }else{
            System.out.println("Cadastro da sala mal sucedido");
        }
    }
}
