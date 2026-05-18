package org.example.view;

import org.example.controller.ReservaController;
import org.example.entity.Sala;
import org.example.entity.Usuario;
import org.example.erros.CredenciaisInvalidasException;
import org.example.erros.UsuarioJaExisteException;

import java.util.Scanner;

public class ReservaView {

    Scanner input = new Scanner(System.in);
    ReservaController reservaController = new ReservaController();

    public void menuCriarReserva(Usuario usuario, Sala sala){
        System.out.println("Insira a data da reserva: ");
        String data = input.nextLine();
        System.out.println("Insira o horário da reserva: ");
        String horario = input.nextLine();
        System.out.println("Insira o status da reserva: ");
        String status = input.nextLine();

        try{
            reservaController.cadastrarReserva(usuario, sala, data, horario, status);
            System.out.println("Reserva cadastrada com sucesso!");
        }catch(UsuarioJaExisteException e){
            System.out.println(e.getMessage());
        }catch(CredenciaisInvalidasException e){
            System.out.println(e.getMessage());
        }
    }

    public void menuListarReserva(){

    }
}
