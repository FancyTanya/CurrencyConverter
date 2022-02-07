package com.github.fancy.exchange.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

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

    }
}
