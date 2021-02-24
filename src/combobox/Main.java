/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Obituary
 */
public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("ComboBox Demo");
        button = new Button("Submit");
        
        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Good Will Hunting",
                "St. Vincent",
                "Blackhat"
        );
        // not like the choice box, you can put whatever you want, not mandatory to be an item of the list
        comboBox.setPromptText("What is your favourite movie ?");
        
        comboBox.setEditable(true);
        
        button.setOnAction(e -> printMovie());
        
        comboBox.setOnAction(e -> System.out.println("User selected: " + comboBox.getValue()));
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(comboBox, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
    // print out a movie
    private void printMovie(){
        System.out.println(comboBox.getValue());
    }
}
