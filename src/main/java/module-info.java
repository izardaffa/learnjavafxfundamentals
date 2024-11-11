module com.izardaffa {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.izardaffa to javafx.fxml;
    exports com.izardaffa;
}
