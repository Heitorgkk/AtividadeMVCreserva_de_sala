package org.example.view;

import org.example.controller.SalaController;
import org.example.erros.CredenciaisInvalidasException;
import org.example.erros.UsuarioJaExisteException;

import java.util.Scanner;

public class SalaView {

    Scanner input = new Scanner(System.in);
    SalaController salaController = new SalaController();

    public void menuCadastroSala(){

        System.out.println("Insira o numero da sala: ");
        int numero = input.nextInt();
        System.out.println("Insira a capacidade da sala: ");
        int capacidade = input.nextInt();

        try{
            salaController.cadastrarSala(numero,capacidade);
            System.out.println("Usuário cadastrado com sucesso");
        }catch(UsuarioJaExisteException e){
            System.out.println(e.getMessage());
        }catch(CredenciaisInvalidasException e){
            System.out.println(e.getMessage());
        }
    }
}
