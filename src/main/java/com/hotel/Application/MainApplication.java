package com.hotel.Application;

import com.hotel.Controller.InicioController;
import com.hotel.Controller.InicioSesionClienteController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApplication extends Application {

    public Stage primaryStage;
    @Override
    public void start(Stage Stage) {
        this.primaryStage =Stage;
        mostrarPantallaPrincipal();

    }
    public void mostrarPantallaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/Inicio.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();

            InicioController controller = loader.getController();
            controller.setMain(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Hotel Cocora");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void mostrarInicioSesionCliente() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/SesionCliente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();

            InicioSesionClienteController controller=loader.getController();


            controller.setMain(this);
            Scene scene = new Scene(rootLayout);
            Stage secondaryStage = new Stage();
            secondaryStage.setScene(scene);
            secondaryStage.setTitle("Iniciar Sesión Cliente");
            secondaryStage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void mostrarInicioSesionAdmin() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/SesionAdmin.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();

            InicioSesionClienteController controller=loader.getController();


            controller.setMain(this);
            Scene scene = new Scene(rootLayout);
            Stage secondaryStage = new Stage();
            secondaryStage.setScene(scene);
            secondaryStage.setTitle("Iniciar Sesión Admin");
            secondaryStage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);

    }
}