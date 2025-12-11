package cl.aerochinquihue.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InicioGerenteController {
    private void Alerta(String titulo, String mensaje){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
    private void CambiarVentana(ActionEvent event, String nombreArchivofxml){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/cl/aerochinquihue/view/"+nombreArchivofxml+".fxml"));
            Parent root = loader.load();

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch(IOException e){
            Alerta("Error", "Error al cargar la ventana");
            e.printStackTrace();
        }
    }
    @FXML
    public void Cambio(ActionEvent event){
        Button botonref = (Button) event.getSource();
        String idboton = botonref.getId();

        switch(idboton){
            case "btnHorario":
                CambiarVentana(event, "Horario");
                break;
            case "btnReservar":
                CambiarVentana(event, "Reservas");
                break;
            case "btnRegistro":
                CambiarVentana(event, "Registros");
                break;
            case "btnCrearVuelo":
                CambiarVentana(event, "CrearVUelo");
                break;
            default:
                Alerta("Error", "Fallo interno");
        }
    }
    @FXML
    public void Cerrar(ActionEvent event){
        CambiarVentana(event, "InicioSesion");
    }
}
