package com.rosu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            FXMLLoader fxmlLoader=new FXMLLoader();
            InputStream resourcesAsStream= getClass().getClassLoader().getResourceAsStream("sample.fxml");
            Parent root = fxmlLoader.load(resourcesAsStream);
            primaryStage.setTitle("todo_app");
            primaryStage.setScene(new Scene(root, 800, 700));
            primaryStage.show();
        }


        public static void main(String[] args) {
            launch(args);

        }
    }
