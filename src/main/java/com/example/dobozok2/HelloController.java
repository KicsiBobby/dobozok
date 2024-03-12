package com.example.dobozok2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HelloController {

    @FXML private Pane pnJatek;
    @FXML private Button btRandom;
    @FXML private Label lbOpenbox;
    @FXML private Label lbBox;
    @FXML private ImageView ivOpenbox;
    @FXML private ImageView ivBox;
    @FXML private ImageView ivArrow;



    private void start(){
        for (int o=0; o<15; o++){
            for (int s=0; s<10; s++){
                pnJatek.getChildren().add(new ImageView(new Image(getClass().getResourceAsStream("null.png"))));
                pnJatek.setTranslateX(10+s*64);
                pnJatek.getChildren();
            }
        }
        onMouseDragged();
    }

    private void onMouseDragged(){

    }

}