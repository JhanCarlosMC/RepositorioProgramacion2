module co.edu.uniquindio.prestamocrud {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.prestamocrud to javafx.fxml;
    exports co.edu.uniquindio.prestamocrud;

    opens co.edu.uniquindio.prestamocrud.controller;
    exports co.edu.uniquindio.prestamocrud.controller;

    opens co.edu.uniquindio.prestamocrud.viewcontroller;
    exports co.edu.uniquindio.prestamocrud.viewcontroller;
}