package com.github.fancy.exchange;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ExchangeApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ExchangeApplication.class.getResource("converter-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 450);
        stage.setTitle("Currency converter");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
        SpringApplication.run(ExchangeApplication.class, args);
    }

}
