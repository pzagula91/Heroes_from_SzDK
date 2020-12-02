module battle.gui {

    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires java.desktop;


    opens pl.sdk.gui;
    opens pl.sdk.gui.gui to javafx.fxml;
}