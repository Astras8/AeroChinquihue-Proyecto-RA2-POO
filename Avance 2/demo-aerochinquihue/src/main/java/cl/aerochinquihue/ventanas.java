package cl.aerochinquihue;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ventanas extends Application{
   @Override
   public void start(Stage stage) throws IOException {
    
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
                    Destino, fila1, fila2, fila3, fila4, fila5, fila6, fila7, fila8, fila9, fila10, fila11, fila12, fila13);
                
                // escena 4
                Scene escena4 = new Scene(layout4, 400, 600);
                stage.setScene(escena4);
   }
}
