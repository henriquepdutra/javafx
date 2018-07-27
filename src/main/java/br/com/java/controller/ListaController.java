/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.controller;

import br.com.java.dao.PessoaDAO;
import br.com.java.domain.Pessoa;
import br.com.java.tabela.PessoaTabela;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author henrique
 *
 */
public class ListaController {

    @FXML
    private TableView<PessoaTabela> tabela;
    @FXML
    private TableColumn<PessoaTabela, String> colunaNome;
    @FXML
    private TableColumn<PessoaTabela, String> colunaIdade;

    private PessoaDAO dao = new PessoaDAO();

    private List<Pessoa> pessoaList;

    private ObservableList<PessoaTabela> listaPessoaTabela = FXCollections.observableArrayList();

    public ListaController() throws Exception {
        this.pessoaList = dao.listaPessoa();
    }

    public void listar() {
        if (!listaPessoaTabela.isEmpty()) {
            listaPessoaTabela.clear();
        }
        for (Pessoa pessoa : pessoaList) {
            PessoaTabela p = new PessoaTabela(pessoa.getId(), pessoa.getNome(), pessoa.getIdade());
            listaPessoaTabela.add(p);
        }

        colunaNome.setCellValueFactory(new PropertyValueFactory<PessoaTabela, String>("Nome"));
        colunaIdade.setCellValueFactory(new PropertyValueFactory<PessoaTabela, String>("Idade"));

        tabela.setItems(listaPessoaTabela);

    }

//    @FXML
//    public void listar(ActionEvent event) throws Exception {
//
//        Pessoa pessoa = new Pessoa();
//        pessoa.setIdade(Integer.parseInt(tfIdade.getText()));
//        pessoa.setNome(tfNome.getText());
//        PessoaDAO dao = new PessoaDAO();
//        dao.seleciona(pessoa.getId());
//
//        System.out.println("lista:" + dao.seleciona(pessoa.getId()));
//        colunaNome.setCellValueFactory(asd);
//        colunaIdade.setCellValueFactory();
//        Parent cadastro = FXMLLoader.load(getClass().getResource("/fxml/Inicial.fxml"));
//        Scene cadastroCena = new Scene(cadastro);
//        Stage cadastroTela = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        cadastroTela.setScene(cadastroCena);
//        cadastroTela.show();
//    }
    public void initialize(URL url, ResourceBundle rb) {
        listar();
    }
}
