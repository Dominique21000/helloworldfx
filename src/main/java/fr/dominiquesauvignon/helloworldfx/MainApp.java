package fr.dominiquesauvignon.helloworldfx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application{

	@Override
    public void start(Stage primaryStage) throws IOException {

		// Chargement du fichier xml
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MainView.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("Hello world FX :-)");
        primaryStage.setScene(new Scene(root, 500,500));
        primaryStage.show();
	}
     	
	
	public static void main(String[] args) {
		launch(args);
	}
}