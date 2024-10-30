module co.edu.uniquindio.projectparcial2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.projectsupermercado to javafx.fxml;
    exports co.edu.uniquindio.projectsupermercado;

    exports co.edu.uniquindio.projectsupermercado.viewcontroller;
    opens co.edu.uniquindio.projectsupermercado.viewcontroller to javafx.fxml;

}