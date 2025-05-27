import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonClickFX extends Application {
    @Override
    public void start(Stage stage) {
        Button btn = new Button("Click Me");
        btn.setOnAction(e -> btn.setText("Clicked!"));

        StackPane layout = new StackPane(btn);
        Scene scene = new Scene(layout, 300, 200);
        stage.setTitle("Button Click");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
