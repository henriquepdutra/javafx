/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.tabela;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author henrique
 */
public class PessoaTabela {

    private final SimpleIntegerProperty id;
    private final SimpleStringProperty nome;
    private final SimpleStringProperty idade;

    public PessoaTabela(int id, String nome, String idade) {
        super();
        this.id = new SimpleIntegerProperty(id);
        this.nome = new SimpleStringProperty(nome);
        this.idade = new SimpleStringProperty(idade);

    }

    public int getId() {
        return id.get();
    }

    public String getNome() {
        return nome.get();
    }

    public String getIdade() {
        return idade.get();
    }

}
