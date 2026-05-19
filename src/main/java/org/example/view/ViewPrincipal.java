package org.example.view;


import org.example.erros.NumeroForaDoEsperado;

import java.util.Scanner;

public class ViewPrincipal {

    ReservaView reservaView = new ReservaView();
    SalaView salaView = new SalaView();
    UsuarioView usuarioView = new UsuarioView();

    Scanner input = new Scanner(System.in);

    public int menuPrincipal(){
        int x = 0;
        int y = 10;
        System.out.println("1 - Cadastrar usuários" +
                "\n2 - Cadastrar sala" +
                "\n3 - Criar reservas" +
                "\n4 - Listar reservas" +
                "\n5 - Atualizar reservas"+
                "\n6 - Cancelar/remover reservas"+
                "\n0 - Sair");
        x = input.nextInt();

        try{
            switch (x){
                case 1:
                    usuarioView.menuCadastroUsuario();
                    break;
                case 2:
                    salaView.menuCadastroSala();
                    break;
                case 3:
                    reservaView.menuCriarReserva();
                    break;
                case 4:
                    reservaView.menuListarReserva();
                    break;
                case 5:
                    reservaView.atualizarReserva();
                    break;
                case 6:
                    reservaView.removerReserva();
                    break;
                case 0:
                    y = 0;
                    break;
                default:
                    throw new NumeroForaDoEsperado("\nPor favor escolha um número válido\n");
            }
        }catch (NumeroForaDoEsperado e){
            System.out.println(e.getMessage());
        }
        return y;
    }
}
