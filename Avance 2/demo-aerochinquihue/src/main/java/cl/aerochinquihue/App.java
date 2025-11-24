package cl.aerochinquihue;

import cl.aerochinquihue.model.Avion;
import cl.aerochinquihue.model.Destino;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        Label label = new Label("ola");
        
        StackPane sceneRoot = new StackPane(label);
        Scene scene = new Scene(sceneRoot, 640, 480);
        
        stage.setTitle("ola");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
                // Arreglo para almacenar los datos de los destinos dados en el enunciado.
        Destino[] PoblamientoDatosDestinos = new Destino[13];

        // Destinos
        PoblamientoDatosDestinos[0] = new Destino("Cochamó", 20000, 5000);
        PoblamientoDatosDestinos[1] = new Destino("Puelo Bajo", 20000, 5000);
        PoblamientoDatosDestinos[2] = new Destino("Contao", 20000, 5000);
        PoblamientoDatosDestinos[3] = new Destino("Rio Negro", 25000, 6000);
        PoblamientoDatosDestinos[4] = new Destino("Pupelde", 25000, 6000);
        PoblamientoDatosDestinos[5] = new Destino("Chepu", 30000, 8000);
        PoblamientoDatosDestinos[6] = new Destino("Ayacara", 30000, 8000);
        PoblamientoDatosDestinos[7] = new Destino("Pillán", 40000, 12000);
        PoblamientoDatosDestinos[8] = new Destino("Reñihue", 40000, 12000);
        PoblamientoDatosDestinos[9] = new Destino("Isla Quenac", 40000, 12000);
        PoblamientoDatosDestinos[10] = new Destino("Palqui", 40000, 12000);
        PoblamientoDatosDestinos[11] = new Destino("Chaitén", 50000, 15000);
        PoblamientoDatosDestinos[12] = new Destino("Santa Bárbara", 50000, 15000);

        // Arreglo para almacenar los tipos de aviones dados en el enunciado.
        Avion[] PoblamientoDatosAviones = new Avion[3];

        // Modelos de aviones
        PoblamientoDatosAviones[0] = new cl.aerochinquihue.model.Cessna310("CESSNA310", 6, 910, "C310-1");
        PoblamientoDatosAviones[1] = new cl.aerochinquihue.model.Cessna208("CESSNA208 CARAVAN", 9, 1315, "C208C-1");
        PoblamientoDatosAviones[2] = new cl.aerochinquihue.model.Let410("LET410UVP-E20", 19, 1800, "LET420-1");

        launch();
    }
}