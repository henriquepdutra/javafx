/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author henrique
 */
public class PrincipalController implements Initializable {

    @FXML
    MenuItem btnTelas = new MenuItem();
    @FXML
    Button btnButton = new Button(); 

    @FXML
    public void inicial(ActionEvent event) throws Exception {
        Parent listagem = FXMLLoader.load(getClass().getResource("/fxml/Inicial.fxml"));

        Scene listagemCena = new Scene(listagem);
        Stage listagemTela = (Stage) ((Node) event.getSource()).getScene().getWindow();

        listagemTela.setScene(listagemCena);
        listagemTela.show();

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
