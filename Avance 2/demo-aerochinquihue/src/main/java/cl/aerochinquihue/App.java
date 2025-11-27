package cl.aerochinquihue;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    /*private static Registro registro;

    //Opcion 1
    @Override
    public void init() throws Exception {
        System.out.println("||| INICIALIZANDO DATOS |||\n\n");

        // "Base de datos"
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
        
        // Pruebas //
        // Vuelo
        Vuelo vueloPrueba = new Vuelo(destinos[0], modelosAviones[0], 26, 11, 2025, "08:00 AM");

        registro.agregarVuelo(vueloPrueba);

        System.out.println(registro.getRegistroVuelosEnPosicion(0).toString());

        // Transporte
        Cliente clientePrueba = new Cliente("astras", "kevin");
        clientePrueba.solicitarPasaje(2, 26, 11, 2025, vueloPrueba, registro);

        Asistente asistentePrueba = new Asistente("incorrecta", "clevin", "Clevin");
        asistentePrueba.calcularYEnviarPrecio(registro.getRegistroServicioEnPosicion(0), clientePrueba);

        clientePrueba.finalizarCompra(registro.getRegistroServicioEnPosicion(0), MedioPago.DEBITO);

        asistentePrueba.validarTransporte(registro.getRegistroServicioEnPosicion(0));

        System.out.println(registro.getRegistroServicioEnPosicion(0).toString());

        // Servicio
        clientePrueba.solicitarEncomienda(5, "rordrigo", vueloPrueba, 26, 11, 2025, registro);

        asistentePrueba.calcularYEnviarPrecio(registro.getRegistroServicioEnPosicion(1), clientePrueba);

        clientePrueba.finalizarCompra(registro.getRegistroServicioEnPosicion(1), MedioPago.TRANSFERENCIA);

        asistentePrueba.validarEncomienda(registro.getRegistroServicioEnPosicion(1));

        // registro.getRegistroServicioEnPosicion(1).confirmarEntrega();

        System.out.println(registro.getRegistroServicioEnPosicion(1));
    }

    //opcion 2
    @Override
public void init() throws Exception {
    System.out.println("||| INICIALIZANDO DATOS |||\n\n");

    // "Base de datos"
    registro = new Registro();

    // -------------------------
    // CARGA DE DESTINOS
    // -------------------------
    Destino[] destinos = new Destino[13];

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

    // -------------------------
    // CARGA DE MODELOS DE AVIONES
    // -------------------------
    Avion[] modelosAviones = new Avion[3];

    modelosAviones[0] = new cl.aerochinquihue.model.Cessna310("CESSNA310", 6, 910, "C310-1");
    modelosAviones[1] = new cl.aerochinquihue.model.Cessna208("CESSNA208 CARAVAN", 9, 1315, "C208C-1");
    modelosAviones[2] = new cl.aerochinquihue.model.Let410("LET410UVP-E20", 19, 1800, "LET420-1");

    // -------------------------
    // CREAR UN VUELO DE PRUEBA (solo se agrega, no se procesa)
    // -------------------------
    Vuelo vueloPrueba = new Vuelo(destinos[0], modelosAviones[0], 26, 11, 2025, "08:00 AM");

    // lo agregamos al registro
    registro.agregarVuelo(vueloPrueba);

    System.out.println("Vuelo cargado en registro:");
    System.out.println(registro.getRegistroVuelosEnPosicion(0).toString());

    System.out.println("||| DATOS CARGADOS CORRECTAMENTE |||\n\n");
}*/

    @Override
public void start(Stage stage) throws IOException {

    System.out.println("||| INICIANDO METODO START |||\n\n");

    // -------------------------
    // ELEMENTOS DEL FORMULARIO (VENTANA 1)
    // -------------------------

    Label Inicio = new Label("Inicio de sesión\n");
    Inicio.setStyle("-fx-font-size: 18px;");

    Label Usuario = new Label("Usuario:");
    TextField txtUsuario = new TextField();
    txtUsuario.setPromptText("Ingrese su usuario");

    Label Contrasena = new Label("Contraseña:");
    PasswordField txtContrasena = new PasswordField();
    txtContrasena.setPromptText("Ingrese su contraseña");

    Button btnIngresar = new Button("Ingresar");

    // Acción del botón Ingresar (cambia a ventana 2)
    btnIngresar.setOnAction(e -> {

        System.out.println("Usuario ingresado: " + txtUsuario.getText()); 
        System.out.println("Contraseña ingresada: " + txtContrasena.getText());

        Label label = new Label("¡Bienvenidos a AeroChinquihue!");
        label.setStyle("-fx-font-size: 18px;");

        Button btnReserva = new Button("Reservar");
        Button btnHorario = new Button("Horarios");

        // ACCIÓN DEL BOTÓN RESERVAR (camina a ventana 3)
        btnReserva.setOnAction(r -> {

            //Reservas
            Label label2 = new Label("Reservas");
            label2.setStyle("-fx-font-size: 18px;");
            
            Button btnPasaje = new Button("Reservar pasaje");

             btnPasaje.setOnAction(i -> {

                Label label3 = new Label("Destino");
                label3.setStyle("-fx-font-size: 18px;");

                //Destino escogido
                Label Destino = new Label("Escoga una opcion:");
                        
                Button btnDestino1 = new Button("Cochamó");
                Button btnDestino2 = new Button("Puelo Bajo");
                Button btnDestino3 = new Button("Contao");
                Button btnDestino4 = new Button("Rio Negro");
                Button btnDestino5 = new Button("Pupelde");
                Button btnDestino6 = new Button("Chepu");
                Button btnDestino7 = new Button("Ayacara");
                Button btnDestino8 = new Button("Pillán");
                Button btnDestino9 = new Button("Reñihue");
                Button btnDestino10 = new Button("Isla Quenac");
                Button btnDestino11 = new Button("Palqui");
                Button btnDestino12 = new Button("Chaitén");
                Button btnDestino13 = new Button("Santa Bárbara");
              
                // Ventana 4
                VBox layout4 = new VBox(20);
                layout4.setPadding(new Insets(20));
                layout4.getChildren().addAll(label3, Destino, btnDestino1, btnDestino2, btnDestino3, btnDestino4, btnDestino5, btnDestino6, btnDestino7, btnDestino8, btnDestino9, btnDestino10, btnDestino11, btnDestino12, btnDestino13);

                Scene escena4 = new Scene(layout4, 400, 600);
                // escena 4
                stage.setScene(escena4);
            });
            
            
            //Encomiendas
            Label Encomienda = new Label("Encomienda:");
            TextField txtEncomienda = new TextField();
            txtEncomienda.setPromptText("Ingrese peso de encomienda");
            Button btnIngresar2 = new Button("Ingresar");

            btnIngresar2.setOnAction(i -> {
                System.out.println("Peso ingresado: " + txtEncomienda.getText()); 

                Label label3 = new Label("Destino");
                label3.setStyle("-fx-font-size: 18px;");

                Label Destino = new Label("Escoja una opción:");

                Button btnDestino1 = new Button("Cochamó");
                Button btnDestino2 = new Button("Puelo Bajo");
                Button btnDestino3 = new Button("Contao");
                Button btnDestino4 = new Button("Rio Negro");
                Button btnDestino5 = new Button("Pupelde");
                Button btnDestino6 = new Button("Chepu");
                Button btnDestino7 = new Button("Ayacara");
                Button btnDestino8 = new Button("Pillán");
                Button btnDestino9 = new Button("Reñihue");
                Button btnDestino10 = new Button("Isla Quenac");
                Button btnDestino11 = new Button("Palqui");
                Button btnDestino12 = new Button("Chaitén");
                Button btnDestino13 = new Button("Santa Bárbara");

                // LABELS (uno para cada botón)
                Label lb1 = new Label("Imagen 1 + precio");
                Label lb2 = new Label("Imagen 2 + precio");
                Label lb3 = new Label("Imagen 3 + precio");
                Label lb4 = new Label("Imagen 4 + precio");
                Label lb5 = new Label("Imagen 5 + precio");
                Label lb6 = new Label("Imagen 6 + precio");
                Label lb7 = new Label("Imagen 7 + precio");
                Label lb8 = new Label("Imagen 8 + precio");
                Label lb9 = new Label("Imagen 9 + precio");
                Label lb10 = new Label("Imagen 10 + precio");
                Label lb11 = new Label("Imagen 11 + precio");
                Label lb12 = new Label("Imagen 12 + precio");
                Label lb13 = new Label("Imagen 13 + precio");

                // HBox para poner Label + Botón juntos
                HBox fila1 = new HBox(10, btnDestino1, lb1 );
                HBox fila2 = new HBox(10, btnDestino2, lb2 );
                HBox fila3 = new HBox(10, btnDestino3, lb3 );
                HBox fila4 = new HBox(10, btnDestino4, lb4 );
                HBox fila5 = new HBox(10, btnDestino5, lb5 );
                HBox fila6 = new HBox(10, btnDestino6, lb6 );
                HBox fila7 = new HBox(10, btnDestino7, lb7 );
                HBox fila8 = new HBox(10, btnDestino8, lb8 );
                HBox fila9 = new HBox(10, btnDestino9, lb9 );
                HBox fila10 = new HBox(10, btnDestino10, lb10 );
                HBox fila11 = new HBox(10, btnDestino11, lb11 );
                HBox fila12 = new HBox(10, btnDestino12, lb12 );
                HBox fila13 = new HBox(10, btnDestino13, lb13 );

                // Ventana 4
                VBox layout4 = new VBox(12);
                layout4.setPadding(new Insets(20));
                layout4.getChildren().addAll(
                    label3, Destino,
                    fila1, fila2, fila3, fila4, fila5, fila6, fila7, fila8, fila9, fila10, fila11, fila12, fila13);
                
                // escena 4
                Scene escena4 = new Scene(layout4, 400, 600);
                stage.setScene(escena4);

            });

            // Ventana 3
            VBox layout3 = new VBox(20);
            layout3.setPadding(new Insets(20));
            layout3.getChildren().addAll(label2, btnPasaje, Encomienda, txtEncomienda, btnIngresar2);

            // escena 3
            Scene escena3 = new Scene(layout3, 400, 300);
            stage.setScene(escena3);
        });

        // Ventana 2 
        VBox layout2 = new VBox(20);
        layout2.setPadding(new Insets(20));
        layout2.getChildren().addAll(label, btnReserva, btnHorario);

        Scene escena2 = new Scene(layout2, 400, 300);

        // escena 2
        stage.setScene(escena2);
    });

    // -------------------------
    // LAYOUT VENTANA 1
    // -------------------------
    VBox layout = new VBox(12);
    layout.setPadding(new Insets(20));
    layout.getChildren().addAll(
        Inicio, Usuario, txtUsuario, Contrasena, txtContrasena, btnIngresar
    );

    Scene scene = new Scene(layout, 350, 250);

    stage.setTitle("AeroChinquihue - Login");
    stage.setScene(scene);
    stage.show();

    System.out.println(" || MOSTRANDO VENTANA ||\n\n");
    }

    public static void main(String[] args) {
        System.out.println("||| INICIANDO APLICACION |||\n\n");
        launch();
        System.out.println("||| CERRANDO APLICACION |||\n\n");
    }
}
