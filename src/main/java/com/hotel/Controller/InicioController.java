package com.hotel.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import com.hotel.Application.MainApplication;
import java.net.URL;
import java.util.ResourceBundle;

public class InicioController implements Initializable {

    private MainApplication aplicacion;

    @FXML
    private Button btnIngresarAdmin;
    @FXML
    private Button btnIngresarCliente;
    @FXML
    private Button btnRegistrarseAdmin;
    @FXML
    private Button btnRegistraseCliente;
    @FXML
    void ingresarAdminEvent(ActionEvent event) {

    }
    @FXML
    void ingresarClienteEvent(ActionEvent event) {
         aplicacion.mostrarInicioSesionCliente();
    }
    @FXML
    void registrarseClienteEvent(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void setMain(MainApplication main) {
        this.aplicacion=main;

    }
}