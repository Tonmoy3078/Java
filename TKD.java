import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TKD extends Application {

    @Override
    public void start(Stage stage) {

        Label label = new Label("Hello JavaFX!");

        Button button = new Button("Click Me");

        button.setOnAction(e -> {
            label.setText("You clicked the button!");
        });

        VBox layout = new VBox(10);

        layout.getChildren().add(label);
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 400, 250);

        stage.setTitle("My First JavaFX App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}