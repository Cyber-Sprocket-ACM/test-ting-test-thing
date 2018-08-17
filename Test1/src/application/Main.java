package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Label l1 = new Label("Here is label");
			HBox hbox = new HBox();
			
			
			BorderPane root = new BorderPane();
			Scene scene2 = new Scene(new Group(), 500, 400);
			scene2.getStylesheets().add("theme1.css");
			Scene scene = new Scene(root,400,400);
			//scene2.getStylesheets().add(getClass().getResource("theme1.css").toExternalForm());//NOT WORKING
			hbox.getChildren().add(l1);
			((Group)scene2.getRoot()).getChildren().add(hbox);
			primaryStage.setScene(scene2);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
