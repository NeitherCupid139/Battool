package indi.compass.battool;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Random;

public class HelloController {

    @FXML
    private ImageView settingButton;
    @FXML
    private Button minimizeButton;

    @FXML
    private Button maximizeButton;

    @FXML
    private Button closeButton;

    @FXML
    private Button secureButton;

    @FXML
    private Button cleanButton;

    @FXML
    private Button optimizeButton;
    @FXML
    private Text city;
    @FXML
    private Text month;

    @FXML
    private Text day;
    @FXML
    private Text temperature;

    @FXML
    private Text message;
    public void setInfo() throws Exception{
        Random random = new Random();
        int num = random.nextInt(8);
        message.setText(Message.getMessage(num));
        city.setText(Weather.getAddress());
       temperature.setText(Weather.getTemperature()+" ℃");
        month.setText(Calendar.getMonth());
        day.setText(Calendar.getDay());
    }
    @FXML
    void clean(ActionEvent event) throws IOException {
        BatController.runBat("clean.bat");
        Stage stage= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tip.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("提示");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void maximize(ActionEvent event) {

    }
    @FXML
    void minimize(ActionEvent event) {

    }

    @FXML
    void optimize(ActionEvent event) throws IOException {
        BatController.runBat("optimize.bat");
        Stage stage= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tip.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("提示");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void secure(ActionEvent event) throws IOException {
        BatController.runBat("secure.bat");
        Stage stage= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tip.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("提示");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void setting(MouseEvent event) throws IOException {
        Stage stage= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("setting.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("设置");
        stage.setScene(scene);
        stage.show();
    }

}
