module ranks.javafxeventhandlingfilehandling {
    requires javafx.controls;
    requires javafx.fxml;


    opens ranks.javafxeventhandlingfilehandling to javafx.fxml;
    exports ranks.javafxeventhandlingfilehandling;
}