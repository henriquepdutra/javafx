/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.controller;

import br.com.java.dao.PessoaDAO;
import br.com.java.domain.Pessoa;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author henrique
 */
public class AdicionaController {

    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnSair;
    @FXML
    private Label lblNome;
    @FXML
    private Label lblIdade;
    @FXML
    private Label lblTitulo;
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfIdade;

    @FXML
    public void salvar(ActionEvent event) throws Exception {

        Pessoa pessoa = new Pessoa();

        pessoa.setIdade(Integer.parseInt(tfIdade.getText()));
        pessoa.setNome(tfNome.getText());

        PessoaDAO dao = new PessoaDAO();
        dao.addPessoa(pessoa);

        Parent cadastro = FXMLLoader.load(getClass().getResource("/fxml/Inicial.fxml"));
        Scene cadastroCena = new Scene(cadastro);
        Stage cadastroTela = (Stage) ((Node) event.getSource()).getScene().getWindow();

        cadastroTela.setScene(cadastroCena);
        cadastroTela.show();

    }

}
