package cl.aerochinquihue;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HorarioView {

    private Stage stage;

    public HorarioView(Stage stage) {
        this.stage = stage;
    }

    public void mostrar() {

        GridPane horario = new GridPane();
        horario.setHgap(10);  
        horario.setVgap(10);  
        horario.setPadding(new Insets(20));

        // ----- Encabezados de días -----
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

        for (int col = 0; col < dias.length; col++) {
            Label diaLabel = new Label(dias[col]);
            diaLabel.setStyle("-fx-font-weight: bold;");
            horario.add(diaLabel, col + 1, 0);
        }

        // ----- Horas desde 8 AM a 10 PM -----
        int horaInicio = 8;
        int horaFin = 22;

        for (int fila = 0; fila <= horaFin - horaInicio; fila++) {
            int hora = horaInicio + fila;

            // Columna fija con la hora
            Label horaLabel = new Label(hora + ":00");
            horario.add(horaLabel, 0, fila + 1);

            // Botones de cada día en esa hora
            for (int col = 0; col < dias.length; col++) {

                Button btn = new Button(dias[col] + " " + hora + ":00");
                btn.setPrefWidth(110);

                btn.setOnAction(e -> {
                    System.out.println("Seleccionaste: " + btn.getText());
                    // Aquí puedes agregar lógica real (reservar, bloquear, mostrar info, etc)
                });

                horario.add(btn, col + 1, fila + 1);
            }
        }

        Scene escena = new Scene(horario, 700, 600);
        stage.setScene(escena);
        stage.show();
    }
}
