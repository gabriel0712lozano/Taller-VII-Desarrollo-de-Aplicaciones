import Clases.ConsumoAgua;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CSemana041 extends Application {

    ConsumoAgua objConsumo = new ConsumoAgua();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CONSUMO DE AGUA");

        // Crear controles
        Label tituloLabel = new Label("CONSUMO DE AGUA");
        tituloLabel.setStyle("-fx-font-size: 18px; -fx-text-fill: white; -fx-font-family: Algerian;");
        Label consumoLabel = new Label("Consumo en Metros Cúbicos:");
        consumoLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: white; -fx-font-family: Arial;");
        TextField txtConsumo = new TextField();
        txtConsumo.setPromptText("Ingrese el consumo");
        txtConsumo.setStyle("-fx-background-color: #F97141; -fx-text-fill: white; -fx-prompt-text-fill: white;");
        Button btnCalcular = new Button("CALCULAR");
        Button btnNuevo = new Button("NUEVO");
        Button btnSalir = new Button("SALIR");
        TextArea txtResultado = new TextArea();
        txtResultado.setEditable(false);
        txtResultado.setStyle("-fx-background-color: #494949; -fx-text-fill: black;");

        // Establecer eventos
        btnCalcular.setOnAction(e -> {
            try {
                double consumo = Double.parseDouble(txtConsumo.getText().trim());
                objConsumo.setConsumo(consumo);
                txtResultado.setText("Resultado\n--------------\n");
                txtResultado.appendText("Consumo en m3: " + objConsumo.hallarConsumo() + "\n");
                txtResultado.appendText("Impuesto en m3: " + objConsumo.hallarImpuesto() + "\n");
                txtResultado.appendText("Monto total en m3: " + objConsumo.hallarMontoTotal());
            } catch (NumberFormatException ex) {
                txtResultado.setText("Por favor, ingrese un valor numérico para el consumo.");
            }
        });

        btnNuevo.setOnAction(e -> {
            txtConsumo.clear();
            txtResultado.clear();
            txtConsumo.requestFocus();
        });

        btnSalir.setOnAction(e -> primaryStage.close());

        // Crear contenedores
        VBox contenedorPrincipal = new VBox(10);
        contenedorPrincipal.setStyle("-fx-background-color: #494949;");
        contenedorPrincipal.setPadding(new Insets(10));
        HBox contenedorBotones = new HBox(10);
        contenedorBotones.getChildren().addAll(btnCalcular, btnNuevo, btnSalir);
        BorderPane contenedorResultado = new BorderPane();
        contenedorResultado.setCenter(txtResultado);

        // Agregar controles a los contenedores
        contenedorPrincipal.getChildren().addAll(tituloLabel, consumoLabel, txtConsumo, contenedorBotones, contenedorResultado);

        // Crear escena y mostrarla
        Scene scene = new Scene(contenedorPrincipal, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
