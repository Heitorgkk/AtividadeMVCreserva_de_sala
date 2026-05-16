package org.example.controller;

import org.example.erros.CredenciaisInvalidasException;
import org.example.erros.UsuarioJaExisteException;
import org.example.service.UsuarioService;

public class UsuarioController {

    UsuarioService userService = new UsuarioService();

    public void cadastrarUsuario(String nome, String cpf) throws UsuarioJaExisteException {

        if(nome.isBlank()) throw new CredenciaisInvalidasException("Erro: Nome em branco.");
        if(nome.length() < 3) throw new CredenciaisInvalidasException("Erro: Nome inválido.");
        if(cpf.isBlank()) throw new CredenciaisInvalidasException("Erro: CPF em branco.");
        if(cpf.matches("\\d")) throw new CredenciaisInvalidasException("Erro: Formato de CPF inválido.");


        userService.cadastrarUsuario(nome, cpf);
    }
}
