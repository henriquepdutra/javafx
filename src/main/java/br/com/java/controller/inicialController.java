package br.com.java.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class inicialController implements Initializable {

    @FXML
    Label lblTitulo = new Label();
    @FXML
    Button btnAdicionar = new Button();
    @FXML
    Button btnListar = new Button();
    @FXML
    Button btnSair = new Button();

    @FXML
    public void adicionar(ActionEvent event) throws IOException {
        System.out.println("Clicou!");
        lblTitulo.setText("Olá Mundo!");

        Parent cadastro = FXMLLoader.load(getClass().getResource("/fxml/Adiciona.fxml"));

        Scene cadastroCena = new Scene(cadastro);
        Stage cadastroTela = (Stage) ((Node) event.getSource()).getScene().getWindow();

        cadastroTela.setScene(cadastroCena);
        cadastroTela.show();

    }

    @FXML
    public void listar(ActionEvent event) throws Exception {
        Parent listagem = FXMLLoader.load(getClass().getResource("/fxml/Lista.fxml"));

        Scene listagemCena = new Scene(listagem);
        Stage listagemTela = (Stage) ((Node) event.getSource()).getScene().getWindow();

        listagemTela.setScene(listagemCena);
        listagemTela.show();

    }

    @FXML
    public void boots(ActionEvent event) throws Exception {
        Parent listagem = FXMLLoader.load(getClass().getResource("/fxml/bootstrap2overview.fxml"));

        Scene listagemCena = new Scene(listagem);
        Stage listagemTela = (Stage) ((Node) event.getSource()).getScene().getWindow();

        listagemTela.setScene(listagemCena);
        listagemTela.show();

    }

    @FXML
    public void boots2(ActionEvent event) throws Exception {
        Parent listagem = FXMLLoader.load(getClass().getResource("/fxml/bootstrap3overview.fxml"));

        Scene listagemCena = new Scene(listagem);
        Stage listagemTela = (Stage) ((Node) event.getSource()).getScene().getWindow();

        listagemTela.setScene(listagemCena);
        listagemTela.show();

    }

    @FXML
    public void sair(ActionEvent event) throws Exception {
        Platform.exit();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
