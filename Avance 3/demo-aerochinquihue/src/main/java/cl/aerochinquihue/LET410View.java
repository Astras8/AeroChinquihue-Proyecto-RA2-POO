package cl.aerochinquihue;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LET410View {
    private Stage stage;

    public LET410View(Stage stage) {
        this.stage = stage;
    }

    public void mostrar() {

        Label titulo = new Label("LET 410 UVP-E20");
        titulo.setStyle("-fx-font-size: 18px;");

        Label subtitulo = new Label("Escoja un asiento:");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        // Asientos
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btn10 = new Button("10");
        Button btn11 = new Button("11");
        Button btn12 = new Button("12");
        Button btn13 = new Button("13");
        Button btn14 = new Button("14");
        Button btn15 = new Button("15");
        Button btn16 = new Button("16");
        Button btn17 = new Button("17");
        Button btn18 = new Button("18");
        Button btn19 = new Button("19");

        // Coordenadas (columna, fila)
        grid.add(btn1, 0, 0);
        grid.add(btn2, 0, 1);
        grid.add(btn3, 0, 2);
        grid.add(btn4, 1, 0);
        grid.add(btn5, 1, 1);
        grid.add(btn6, 1, 2);
        grid.add(btn7, 2, 0);
        grid.add(btn8, 2, 1);
        grid.add(btn9, 2, 2);
        grid.add(btn10, 3, 0);
        grid.add(btn11, 3, 1);
        grid.add(btn12, 3, 2);
        grid.add(btn13, 4, 0);
        grid.add(btn14, 4, 1);
        grid.add(btn15, 4, 2);
        grid.add(btn16, 5, 0);
        grid.add(btn17, 5, 1);
        grid.add(btn18, 6, 0);
        grid.add(btn19, 6, 1);

        // Pagar
        btn1.setOnAction(e -> new PagoView(stage).mostrar());
        btn2.setOnAction(e -> new PagoView(stage).mostrar());
        btn3.setOnAction(e -> new PagoView(stage).mostrar());
        btn4.setOnAction(e -> new PagoView(stage).mostrar());
        btn5.setOnAction(e -> new PagoView(stage).mostrar());
        btn6.setOnAction(e -> new PagoView(stage).mostrar());
        btn7.setOnAction(e -> new PagoView(stage).mostrar());
        btn8.setOnAction(e -> new PagoView(stage).mostrar());
        btn9.setOnAction(e -> new PagoView(stage).mostrar());
        btn10.setOnAction(e -> new PagoView(stage).mostrar());
        btn11.setOnAction(e -> new PagoView(stage).mostrar());
        btn12.setOnAction(e -> new PagoView(stage).mostrar());
        btn13.setOnAction(e -> new PagoView(stage).mostrar());
        btn14.setOnAction(e -> new PagoView(stage).mostrar());
        btn15.setOnAction(e -> new PagoView(stage).mostrar());
        btn16.setOnAction(e -> new PagoView(stage).mostrar());
        btn17.setOnAction(e -> new PagoView(stage).mostrar());
        btn18.setOnAction(e -> new PagoView(stage).mostrar());
        btn19.setOnAction(e -> new PagoView(stage).mostrar());

        VBox layout = new VBox(15, titulo, subtitulo, grid);
        layout.setPadding(new Insets(20));

        stage.setScene(new Scene(layout, 400, 300));
    }
}
