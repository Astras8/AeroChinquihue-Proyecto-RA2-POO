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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Destino1Controller {
    @FXML private Button btnContao;
    @FXML private Button btnCochamo;
    @FXML private Button btnPalqui;
    @FXML private Button btnPillan;
    @FXML private Button btnReñihue;
    @FXML private Button btnChepu;
    @FXML private Button btnPueloBajo;
    @FXML private Button btnSiguiente;
    @FXML private javafx.scene.image.ImageView btnVolverInicio;

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

        } catch (IOException e){
            Alerta("Error", "No se pudo llevar a la ventana");
            e.printStackTrace();
        }
    }
    @FXML
    public void OnClick(MouseEvent event){
        CambiarVentana(new ActionEvent(event.getSource(), event.getTarget()),"VentanaInicio");
    }
    private void disponibilidad(ActionEvent event){
        Button botonref = (Button) event.getSource();
        String botonId = botonref.getId();

        //falta la cosa pa ver la disponibilidad y las validaciones de los vuelos

        //esto iria al final lol
        CambiarVentana(event, "Horario");
    }
    @FXML
    public void Siguiente(ActionEvent event){
        Button botonref =(Button) event.getSource();
        String botonid = botonref.getId();
        
        CambiarVentana(event, "Destino2");
    }
}
