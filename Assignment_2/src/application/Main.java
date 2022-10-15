package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) { 
		try {
			
			VBox vb = new VBox();
			
			HBox  hb1 = new HBox();
			Label l1 = new Label();
			l1.setText("Username : ");
			TextField tf = new TextField();
			hb1.getChildren().addAll(l1,tf);
			
			HBox hb2 =new HBox();
			Label l2 = new Label();
			l2.setText("Password  : ");
			PasswordField pf = new PasswordField();
			hb2.getChildren().addAll(l2,pf);
			
			HBox hb3 = new HBox();
			Button b1 = new Button();
			b1.setText("Login");
			Button b2 = new Button("Reset");
			hb3.getChildren().addAll(b1,b2);
			vb.getChildren().addAll(hb1,hb2,hb3);
			
			//BorderPane root = new BorderPane();
			Scene scene = new Scene(vb,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
