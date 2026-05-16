package org.example.service;

import org.example.entity.Usuario;
import org.example.controller.UsuarioController;
import org.example.erros.UsuarioJaExisteException;
import org.example.erros.UsuarioNaoEncontradoException;
import org.example.repository.UsuarioRepository;

public class UsuarioService {

    public UsuarioService(){}

    UsuarioRepository repo = new UsuarioRepository();

    public void cadastrarUsuario(String nome, String cpf){
        //TODO chamar View para pedir info (nome, cpf)

        if (validarExistente(new Usuario(nome, cpf))) {
            throw new UsuarioJaExisteException("Erro: Usuário já existe.");
        }else repo.insertUser(new Usuario(nome, cpf));

    }

    // Procura no Repository pelo usuário com o nome e cpf
    // retorna true se encontrar, se não encontrar retorna falso
    public boolean validarExistente(Usuario user){
        boolean out = false;

        try {
            repo.getUserByName(user.getNome());
            out = true;
        }catch (UsuarioNaoEncontradoException e){}

        try {
            repo.getUserByCPF(user.getCpf());
            out = true;
        }catch (UsuarioNaoEncontradoException e){}

        return out;
    }

}
