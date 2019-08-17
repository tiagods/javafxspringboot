package com.tiagods.javafxspringboot.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.tiagods.javafxspringboot.JavafxspringbootApplication;
import com.tiagods.javafxspringboot.view.Menu;
import com.tiagods.javafxspringboot.view.Menu2;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Arrays;

import static javafx.stage.WindowEvent.WINDOW_HIDING;

@FXMLController
public class ControllerMenu {
    @Autowired
    private Menu2 menu2;

    @FXML
    private JFXComboBox<String> cbConta;

    @FXML
    private JFXTextField txSenha;

    @FXML
    private void initialize() {
        cbConta.getItems().addAll(Arrays.asList(new String[]{"Tiago","Aline"}));
    }

    @FXML
    public void acaoAbrir(ActionEvent event){
        Stage stage = JavafxspringbootApplication.showView(Menu2.class,Modality.APPLICATION_MODAL);
        stage.setOnHiding(c->System.out.println("Fechou1"));

    }
    public String valor(){
        return "M]te]";
    }
}
