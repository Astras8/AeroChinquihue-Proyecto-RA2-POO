package cl.aerochinquihue;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HorarioView {

    private Stage stage;
    private Runnable onHorarioSeleccionado;

    public HorarioView(Stage stage, Runnable onHorarioSeleccionado) {
        this.stage = stage;
        this.onHorarioSeleccionado = onHorarioSeleccionado;
    }

    public void mostrar() {

        GridPane horario = new GridPane();
        horario.setHgap(10);  
        horario.setVgap(10);  
        horario.setPadding(new Insets(20));

        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

        // Columnas horario
        for (int col = 0; col < dias.length; col++) {
            Label diaLabel = new Label(dias[col]);
            diaLabel.setStyle("-fx-font-weight: bold;");
            horario.add(diaLabel, col + 1, 0);
        }

        int horaInicio = 8;
        int horaFin = 22;

        // Filas horario
        for (int fila = 0; fila <= horaFin - horaInicio; fila++) {

            int hora = horaInicio + fila;

            Label horaLabel = new Label(hora + ":00");
            horario.add(horaLabel, 0, fila + 1);

            for (int col = 0; col < dias.length; col++) {

                String texto = dias[col] + " " + hora + ":00";

                Button btn = new Button(texto);
                btn.setPrefWidth(110);

                btn.setOnAction(e -> {
                    System.out.println("Seleccionaste: " + texto);

                    // Ir a AvionesView
                    if (onHorarioSeleccionado != null) {
                        onHorarioSeleccionado.run();
                    }
                });

                horario.add(btn, col + 1, fila + 1);
            }
        }

        stage.setScene(new Scene(horario, 700, 600));
        stage.show();
    }
}
