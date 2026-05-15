package org.example.repository;

import org.example.entity.Usuario;
import org.example.erros.UsuarioNaoEncontradoException;
import java.util.HashMap;

public class UsuarioRepository {

    private HashMap<Integer, Usuario> usuarios;

    public UsuarioRepository(){
        usuarios = new HashMap<>();
    }


    public Usuario[] getUsuarios(){
        return usuarios.values().toArray(new Usuario[0]);
    }

    public Usuario getUserByID(long id) throws UsuarioNaoEncontradoException {
        for (Usuario u : usuarios.values()) if (u.getId() == id) return u;
        throw new UsuarioNaoEncontradoException("Usuário não encontrado");
    }

    public Usuario getUserByName(String nome) throws UsuarioNaoEncontradoException {
        for (Usuario u : usuarios.values()) if (u.getNome().equals(nome)) return u;
        throw new UsuarioNaoEncontradoException("Usuário não encontrado");
    }

    public Usuario getUserByCPF(String cpf) throws UsuarioNaoEncontradoException {
        for (Usuario u : usuarios.values()) if (u.getCpf().equals(cpf)) return u;
        throw new UsuarioNaoEncontradoException("Usuário não encontrado");
    }

    public void insertUser(Usuario user){
        usuarios.put(usuarios.size() - 1, user);
    }

}
