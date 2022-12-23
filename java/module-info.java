module indi.compass.battool {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens indi.compass.battool to javafx.fxml;
    exports indi.compass.battool;
}