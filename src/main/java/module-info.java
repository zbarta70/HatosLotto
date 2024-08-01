module bz.hatoslotto {
    requires javafx.controls;
    requires javafx.fxml;

    opens bz.hatoslotto to javafx.fxml;
    exports bz.hatoslotto;
}
