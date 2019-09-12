package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main extends Application {

	private static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
    	stage=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("codeeditor.fxml"));
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        Scene scene = new Scene(root, (double) width / 2, (double) height / 2);
        primaryStage.setTitle("Code Editor v1.0");
        primaryStage.setScene(scene);
        primaryStage.show();
      
    }


    public static void main(String[] args) {
        launch(args);
    }
    public static Stage getStage() {
    	return stage;
    }
   
}
}