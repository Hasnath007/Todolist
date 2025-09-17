module com.example.king {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.king to javafx.fxml;
    exports com.example.king;
}