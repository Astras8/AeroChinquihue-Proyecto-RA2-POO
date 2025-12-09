package cl.aerochinquihue.View;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Controller {

    @FXML
    private Button btnIngresar;

    @FXML
    private Label lblContrasena;

    @FXML
    private Label lblSesion;

    @FXML
    private Label lblUsuario;

    @FXML
    private PasswordField textContrasena;

    @FXML
    private TextField txtNombre;

    @FXML
    private Pane Pane;

    @FXML
    private Button btnCredito;

    @FXML
    private Button btnDebito;

    @FXML
    private Button btnPagar;

    @FXML
    private Button btnTransferencia;

    @FXML
    private ImageView imgMetodoPago;

    @FXML
    private ImageView imgPersonaDatos;

    @FXML
    private ImageView imgPersonaDatos1;

    @FXML
    private Label nomVentanaPago;

    @FXML
    private Label subEscogerMetodoPago;

    @FXML
    private Label subIngreseDatos;

    @FXML
    private Label subPrecio;

    @FXML
    private Label subTotalPagar;

    @FXML
    private TextField txtNombreApellido;

    @FXML
    private TextField txtRut;

    @FXML
    private Button btnGuardarPeso;

    @FXML
    private Button btnReservarPasaje;

    @FXML
    private ImageView btnVolverInicio;

    @FXML
    private ImageView imgEncomienda;

    @FXML
    private ImageView imgPasaje;

    @FXML
    private Label nomVentanaReservas;

    @FXML
    private Label subEncomienda;

    @FXML
    private TextField txtPesoEncomienda;

    @FXML
    private Label inicioTitulo;

    @FXML
    private PasswordField txtContraseña;

    @FXML
    private TextField txtUsuario;

     @FXML
    private ImageView ImgCessna208;

    @FXML
    private Button btnCessna208;

    @FXML
    private Button btnCessna310;

    @FXML
    private Button btnLet410;

    @FXML
    private ImageView imgCessna310;

    @FXML
    private ImageView imgLet410;

    @FXML
    private Label nomVentanaAviones;

    @FXML
    private Label pesoCessna208;

    @FXML
    private Label pesoCessna310;

    @FXML
    private Label pesoLet410;

    @FXML
    private Button btnHorario;

    @FXML
    private Button btnReservar;

    @FXML
    private ImageView imgAvion;

    @FXML
    private ImageView imgHorario;

    @FXML
    private Label inicioBienvenida;

    @FXML
    private Label nomVentanaInicio;

    @FXML
    private Button btnAsiento10Let410;

    @FXML
    private Button btnAsiento11Let410;

    @FXML
    private Button btnAsiento12Let410;

    @FXML
    private Button btnAsiento13Let410;

    @FXML
    private Button btnAsiento14Let410;

    @FXML
    private Button btnAsiento15Let410;

    @FXML
    private Button btnAsiento16Let410;

    @FXML
    private Button btnAsiento17Let410;

    @FXML
    private Button btnAsiento18Let410;

    @FXML
    private Button btnAsiento19Let410;

    @FXML
    private Button btnAsiento1Let410;

    @FXML
    private Button btnAsiento2Let410;

    @FXML
    private Button btnAsiento3Let410;

    @FXML
    private Button btnAsiento4Let410;

    @FXML
    private Button btnAsiento5Let410;

    @FXML
    private Button btnAsiento6Let410;

    @FXML
    private Button btnAsiento7Let410;

    @FXML
    private Button btnAsiento8Let410;

    @FXML
    private Button btnAsiento9Let410;

    @FXML
    private ImageView imgAsientosLet410;

    @FXML
    private Label nomVentanaLet410;

    @FXML
    private Button btnAsiento1Cessna310;

    @FXML
    private Button btnAsiento2Cessna310;

    @FXML
    private Button btnAsiento3Cessna310;

    @FXML
    private Button btnAsiento4Cessna310;

    @FXML
    private Button btnAsiento5Cessna310;

    @FXML
    private Button btnAsiento6Cessna310;

    @FXML
    private ImageView imgAsientosCessna310;

    @FXML
    private Label nomVentanaCessna310;

    @FXML
    private Button btnAsiento1Cessna208;

    @FXML
    private Button btnAsiento2Cessna208;

    @FXML
    private Button btnAsiento3Cessna208;

    @FXML
    private Button btnAsiento4Cessna208;

    @FXML
    private Button btnAsiento5Cessna208;

    @FXML
    private Button btnAsiento6Cessna208;

    @FXML
    private Button btnAsiento7Cessna208;

    @FXML
    private Button btnAsiento8Cessna208;

    @FXML
    private Button btnAsiento9Cessna208;

    @FXML
    private ImageView imgAsientosCessna208;

    @FXML
    private Label nomVentanaCessna208;

    @FXML
    private Button btnChepu;

    @FXML
    private Button btnCochamo;

    @FXML
    private Button btnContao;

    @FXML
    private Button btnPalqui;

    @FXML
    private Button btnPillan;

    @FXML
    private Button btnPueloBajo;

    @FXML
    private Button btnReñihue;

    @FXML
    private Button btnSiguiente;

    @FXML
    private ImageView imgChepu;

    @FXML
    private ImageView imgCochamo;

    @FXML
    private ImageView imgContao;

    @FXML
    private ImageView imgPalqui;

    @FXML
    private ImageView imgPillan;

    @FXML
    private ImageView imgPueloBajo;

    @FXML
    private ImageView imgReñihue;

    @FXML
    private Label nomVentanaDestino1;

    @FXML
    private Button btnAyacara;

    @FXML
    private Button btnChaiten;

    @FXML
    private Button btnIslaQuenac;

    @FXML
    private Button btnPupelde;

    @FXML
    private Button btnRioNegro;

    @FXML
    private Button btnSantaBarbara;

    @FXML
    private Button btnVolver;
    
    @FXML
    private ImageView imgAyacara;

    @FXML
    private ImageView imgChaiten;

    @FXML
    private ImageView imgIslaQuenac;

    @FXML
    private ImageView imgPupelde;

    @FXML
    private ImageView imgRioNegro;

    @FXML
    private ImageView imgSantaBarbara;

    @FXML
    private Label nomVentanaDestino2;

    @FXML
    private Label nomVentanaHorario;

    @FXML
    private TableView<?> tblHorario;

     @FXML
    private Button btnCrearVuelo;

    @FXML
    private ImageView imgAsiento;

    @FXML
    private ImageView imgDestino;

    @FXML
    private Label nomVentanaCrearVuelo;

    @FXML
    private Label subServicio;

    @FXML
    private TextField txtAsiento;

    @FXML
    private TextField txtAvion;

    @FXML
    private TextField txtDestino;

    @FXML
    private TextField txtEncomienda;

    @FXML
    private TextField txtHorario;

    @FXML
    private Button btnRegistro;

    @FXML
    private ImageView imgCrearVuelo;

    @FXML
    private ImageView imgRegistro;
    
    @FXML
    private Label nomVentanaRegistros;

    @FXML
    private TableView<?> tblRegistros;

    @FXML
    private ImageView imgPersonaDatos12;

    @FXML
    private ImageView imgPrecio;

    @FXML
    private Label subDescuentoAplicado;

    @FXML
    private Label subPrecioTotal;

    @FXML
    private Label subPrecioVuelo;

    @FXML
    private TextField txtDescuento;

}