package cl.aerochinquihue.controller;

import java.io.IOException;

import cl.aerochinquihue.model.Asistente;
import cl.aerochinquihue.model.Gerente;
import cl.aerochinquihue.model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController {      
    
    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtContraseña;
    @FXML private Button btnIngresar;

    //no estoy seguro si esto es necesario
    private void Alerta(String titulo, String mensaje){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
    private void ingresarSistema(Usuario u, String nombreArchivoFXML, MouseEvent event){
        Contexto.setUsuarioActual(u);

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/cl/aerochinquihue/view/"+nombreArchivoFXML+".fxml"));
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
        String usuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();

        if(usuario.isEmpty() || contraseña.isEmpty()){
            Alerta("Error", "Datos Incompletos");
            return;
        }

        Usuario[] usuarios = Contexto.getUsuarioSistema();

        for(Usuario u : usuarios){
            if(u != null && u.getUsuario().equals(usuario)){
                if(u instanceof Asistente){
                    Asistente asis = (Asistente) u;
                    if (asis.getContraseña().equals(contraseña)){
                        ingresarSistema(u, "VentanaInicio", event);
                        return;
                    }
                }else if(u instanceof Gerente){
                    Gerente gere = (Gerente) u;
                    if (gere.getContraseña().equals(contraseña)){
                        ingresarSistema(u, "VentanaInicioGerente", event);
                        return;
                    }
                }
            }else{
                Alerta("Error","Usuario o contraseña incorrectas");
            }
        }
    }
}   