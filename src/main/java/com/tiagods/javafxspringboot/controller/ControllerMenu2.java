package com.tiagods.javafxspringboot.controller;

import com.tiagods.javafxspringboot.JavafxspringbootApplication;
import com.tiagods.javafxspringboot.view.Menu2;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@FXMLController
public class ControllerMenu2{
    @Autowired
    private Menu2 menu2;
    @Autowired
    ControllerMenu controllerMenu;

    @FXML
    private void initialize() {

    }
    @FXML
    void botaoAcionado(ActionEvent event){
        menu2.close();
        System.out.println(controllerMenu.valor());
    }


}
