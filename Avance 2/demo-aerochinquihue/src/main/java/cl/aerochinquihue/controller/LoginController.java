package cl.aerochinquihue.controller;

import cl.aerochinquihue.model.Asistente;
import cl.aerochinquihue.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

//Los controladores se intentaron hacer sin el "esqueleto de interfaz" de Scene builder por ende su funcionalidad es dudosa

public class LoginController {      
    
    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtContraseña;
    @FXML private Button botonIngresar;

    //no estoy seguro si esto es necesario
    private void Alerta(String titulo, String mensaje){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
    //falta lo de las ventanas
    private void ingresarSistema(Usuario u, String nombreArchivoFXML){
        Contexto.setUsuarioActual(u);

        try{
            //ventana que se busca
        } catch (Exception e){
            Alerta("Error", "No se pudo llevar a la ventana");
        }
    }
    @FXML
    public void Login(ActionEvent event){
        String usuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();

        if(usuario.isEmpty() || contraseña.isEmpty()){
            Alerta("Error", "Datos Incompletos");
            return;
        }

        Usuario[] usuarios = Contexto.getUsuarioSistema();
        Boolean usuarioEncontrado = false;

        if(usuarios != null){
            for(int i = 0; i < usuarios.length; i++){
                Usuario u = usuarios[i];

                if (u != null && u.getUsuario().equals(usuarioEncontrado)){
                    if(u instanceof Asistente){
                        Asistente asiste = (Asistente) u;
                        if(asiste.getContraseña().equals(contraseña));
                        ingresarSistema(u, "menu");//en menu deberia ir el fxml del menu.
                        usuarioEncontrado = true;
                    }
                }
            }
        }
    }
}  
    