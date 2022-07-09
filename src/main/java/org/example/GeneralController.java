package org.example;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GeneralController {

    //Data Fields
    @FXML
    private Circle userIcon;
    @FXML
    private Label userName;
    @FXML
    private Label welcomeText;

    //Buttons
    @FXML
    private Button minimalizeButton;
    @FXML
    private Button  menuButton1, menuButton2, menuButton3, menuButton4;

    //Elements dependent on data base
    @FXML
    public void initialize(){
        Image iconImage = new Image("/person.png", false);
        userIcon.setFill(new ImagePattern(iconImage));
        userIcon.setEffect(new DropShadow(20, Color.WHITESMOKE));
    }


    //Deal with some actions int window
    @FXML
    protected void onExitbutton(){
        Platform.exit();
    }

    @FXML
    protected void onMinimalization(){
        ((Stage) minimalizeButton.getParent().getScene().getWindow()).setIconified(true);
    }
}