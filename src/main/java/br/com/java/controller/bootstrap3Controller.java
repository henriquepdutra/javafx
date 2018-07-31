/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author henrique
 */
public class bootstrap3Controller {

//    @FXML
//    Button btnVoltar = new Button();

    @FXML
    public void voltar(ActionEvent event) throws Exception {
        Parent listagem = FXMLLoader.load(getClass().getResource("/fxml/Inicial.fxml"));

        Scene listagemCena = new Scene(listagem);
        Stage listagemTela = (Stage) ((Node) event.getSource()).getScene().getWindow();

        listagemTela.setScene(listagemCena);
        listagemTela.show();

    }

}
