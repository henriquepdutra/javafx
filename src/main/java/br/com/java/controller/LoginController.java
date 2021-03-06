/*
 * Copyright (c) 2008, 2012 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package br.com.java.controller;

import br.com.java.javafxteste.MainApp;
import br.com.java.model.User;
import br.com.java.security.Authenticator;
import java.awt.Color;
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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Login Controller.
 */
public class LoginController extends AnchorPane implements Initializable {

    @FXML
    TextField userId;
    @FXML
    PasswordField password;
    @FXML
    Button login;
    @FXML
    Label errorMessage;

    private MainApp application;
    private User loggedUser;

    public void setApp(MainApp application) {
        this.application = application;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        errorMessage.setText("");
        userId.setPromptText("Usuário");
        password.setPromptText("Senha");

    }

    public void processLogin(ActionEvent event) throws Exception {
//        if (application == null) {
//            // We are running in isolated FXML, possibly in Scene Builder.
//            // NO-OP.
//            errorMessage.setText("Erro: " + userId.getText());
//        } else if (!this.userLogging(userId.getText(), password.getText())) {
//            errorMessage.setText("Usuário/Senha incorreto");

        Parent inicial = FXMLLoader.load(getClass().getResource("/fxml/Principal.fxml"));

        Scene inicialCena = new Scene(inicial);
        Stage inicialTela = (Stage) ((Node) event.getSource()).getScene().getWindow();

        inicialTela.setScene(inicialCena);
        inicialTela.show();

    }

//    public boolean userLogging(String userId, String password) {
//        if (Authenticator.validate(userId, password)) {
//            loggedUser = User.of(userId);
//            System.out.println("logado");
//            return true;
//        } else {
//            System.out.println("não logado");
//            return false;
//        }
//    }
//
//    public User getLoggedUser() {
//        return loggedUser;
//    }
}
