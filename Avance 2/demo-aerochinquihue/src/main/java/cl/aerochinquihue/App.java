package cl.aerochinquihue;

import java.io.IOException;

import cl.aerochinquihue.controller.Contexto;
import cl.aerochinquihue.model.Asistente;
import cl.aerochinquihue.model.Avion;
import cl.aerochinquihue.model.Cliente;
import cl.aerochinquihue.model.Destino;
import cl.aerochinquihue.model.Gerente;
import cl.aerochinquihue.model.MedioPago;
import cl.aerochinquihue.model.Registro;
import cl.aerochinquihue.model.Usuario;
import cl.aerochinquihue.model.Vuelo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private static Registro registro;

    //Opcion 1
    @Override
    public void init() throws Exception {
        System.out.println("||| INICIALIZANDO DATOS |||\n\n");

        // "Base de datos" Falta añadir
        registro = new Registro();

        // Arreglo para almacenar los datos de los destinos dados en el enunciado.
        Destino[] destinos = new Destino[13];

        // Destinos
        destinos[0] = new Destino("Cochamó", 20000, 5000);
        destinos[1] = new Destino("Puelo Bajo", 20000, 5000);
        destinos[2] = new Destino("Contao", 20000, 5000);
        destinos[3] = new Destino("Rio Negro", 25000, 6000);
        destinos[4] = new Destino("Pupelde", 25000, 6000);
        destinos[5] = new Destino("Chepu", 30000, 8000);
        destinos[6] = new Destino("Ayacara", 30000, 8000);
        destinos[7] = new Destino("Pillán", 40000, 12000);
        destinos[8] = new Destino("Reñihue", 40000, 12000);
        destinos[9] = new Destino("Isla Quenac", 40000, 12000);
        destinos[10] = new Destino("Palqui", 40000, 12000);
        destinos[11] = new Destino("Chaitén", 50000, 15000);
        destinos[12] = new Destino("Santa Bárbara", 50000, 15000);

        // Arreglo para almacenar los tipos de aviones dados en el enunciado.
        Avion[] modelosAviones = new Avion[3];

        // Modelos de aviones
        modelosAviones[0] = new cl.aerochinquihue.model.Cessna310("CESSNA310", 6, 910, "C310-1");
        modelosAviones[1] = new cl.aerochinquihue.model.Cessna208("CESSNA208 CARAVAN", 9, 1315, "C208C-1");
        modelosAviones[2] = new cl.aerochinquihue.model.Let410("LET410UVP-E20", 19, 1800, "LET420-1");
        
        // Pruebas
        //esto de abajo deberia guardar esos datos para los controladores
        Usuario[] listaPrueba = new Usuario[2];
        listaPrueba[0] = new Asistente("123", "AsistP", "Clevin");
        listaPrueba[1] = new Gerente("1234","GerenteP","kovid");
        Contexto.setUsuariosSistema(listaPrueba);

        Vuelo vueloPrueba = new Vuelo(destinos[0], modelosAviones[0], 26, 11, 2025, "08:00 AM");

        Cliente clientePrueba = new Cliente("astras", "kevin");
        clientePrueba.solicitarPasaje(2, 26, 11, 2025, vueloPrueba, registro);

        Asistente asistentePrueba = new Asistente("incorrecta", "clevin", "Clevin");
        asistentePrueba.calcularYEnviarPrecio(registro.getRegistroServicioEnPosicion(0), clientePrueba);

        clientePrueba.finalizarCompra(registro.getRegistroServicioEnPosicion(0), MedioPago.DEBITO);

        asistentePrueba.validarTransporte(registro.getRegistroTransportesEnPosicion(0));

        System.out.println(registro.getRegistroServicioEnPosicion(0).toString());

        // Servicio
        clientePrueba.solicitarEncomienda(5, "rordrigo", vueloPrueba, 26, 11, 2025, registro);

        asistentePrueba.calcularYEnviarPrecio(registro.getRegistroServicioEnPosicion(1), clientePrueba);

        clientePrueba.finalizarCompra(registro.getRegistroServicioEnPosicion(1), MedioPago.TRANSFERENCIA);

        asistentePrueba.validarEncomienda(registro.getRegistroEncomiendasEnPosicion(0));

        registro.getRegistroEncomiendasEnPosicion(0).confirmarEntrega();

        System.out.println(registro.getRegistroServicioEnPosicion(1).toString());
    }

@Override
public void start(Stage primaryStage) throws IOException {

    System.out.println("||| INICIANDO METODO START |||\n\n");
    System.out.println(" || MOSTRANDO VENTANA ||\n\n");
    
    try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/cl/aerochinquihue/view/InicioSesion.fxml"));
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("AeroChinquihue | Inicio de sesion");
        primaryStage.setScene(scene);
        primaryStage.show();

    }catch(Exception e){
        System.err.println("Error al cargar la ventana/fxml");
        }
    }

    public static void main(String[] args) {
        System.out.println("||| INICIANDO APLICACION |||\n\n");
        launch();
        System.out.println("||| CERRANDO APLICACION |||\n\n");
    }
}


