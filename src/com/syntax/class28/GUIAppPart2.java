package com.syntax.class28;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import reviewJavaClass07.GUIApplication;

public class GUIAppPart2 extends Application implements EventHandler<ActionEvent> {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("Touch me");
        Label label = new Label("Enter your name");
        TextField text = new TextField("");
        VBox vBoxlayout = new VBox();
        vBoxlayout.getChildren().add(label);
        button.setOnAction(this);
        vBoxlayout.getChildren().add(text);
        vBoxlayout.getChildren().add(button);
        Scene scene = new Scene(vBoxlayout, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Next Billion dollar app");
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {
        //System.out.println(text.getCharacters());

    }
}
