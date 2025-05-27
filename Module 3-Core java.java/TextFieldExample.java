import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldExample extends Application {
    @Override
    public void start(Stage stage) {
        TextField tf = new TextField();
        Button btn = new Button("Submit");
        Label lbl = new Label();

        btn.setOnAction(e -> lbl.setText("Hello " + tf.getText()));

        VBox root = new VBox(10, tf, btn, lbl);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("TextField Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
