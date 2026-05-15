package org.example.view;

import org.example.controller.UsuarioController;
import org.example.entity.Usuario;

import java.util.Scanner;

public class UsuarioView {

    Scanner input;
    UsuarioController usuarioController;

    public UsuarioView(){
        input = new Scanner(System.in);
        usuarioController = new UsuarioController();
    }

    // SUGESTÃO ao invés de println colocar print, para que o usário coloque as informações
    // na mesma linha
    public void cadastro(){
        System.out.println("Insira seu nome: ");
        String nome = input.nextLine();
        System.out.println("Insira seu cpf: ");
        String cpf = input.nextLine();

        boolean sucesso = usuarioController.cadastrarUsuario();
        if(sucesso){
            System.out.println("Usuário Cadastrado com sucesso");
        }else{
            System.out.println("Usuário não foi possível ser cadastrado");
        }
    }
}
