module edu.csueastbay.cs401.balls {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.csueastbay.cs401.balls to javafx.fxml;
    exports edu.csueastbay.cs401.balls;
}