package com.github.fancy.exchange.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ConvertController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField amount;

    @FXML
    private VBox convert_result;

    @FXML
    private ComboBox<?> from_combo_box;

    @FXML
    private ComboBox<?> to_combo_box;

    @FXML
    private ImageView image_button_convert;

    @FXML
    void initialize() {
        from_combo_box.setOnAction(actionEvent ->
                from_combo_box.selectionModelProperty().getValue());
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(
                "http://data.fixer.io/api/latest?access_key=02b4ee3cd4e93434b1c8ccdfd79de11e& base = GBP"));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();

    }
}
