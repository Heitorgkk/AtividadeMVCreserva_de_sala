package org.example.view;

import org.example.controller.UsuarioController;
import org.example.entity.Usuario;
import org.example.erros.CredenciaisInvalidasException;
import org.example.erros.UsuarioJaExisteException;

import java.util.Scanner;

public class UsuarioView {

    Scanner input;
    UsuarioController usuarioController;

    public UsuarioView(){
        input = new Scanner(System.in);
        usuarioController = new UsuarioController();
    }


    public void cadastro(){
        System.out.print("Insira seu nome: ");
        String nome = input.nextLine();
        System.out.print("Insira seu cpf: ");
        String cpf = input.nextLine();

        try {
            usuarioController.cadastrarUsuario(nome, cpf);
            System.out.println("Usuário cadastrado com sucesso!");

        }catch (UsuarioJaExisteException e){
            System.out.println(e.getMessage());
        }catch (CredenciaisInvalidasException e){
            System.out.println(e.getMessage());
        }

    }
}
