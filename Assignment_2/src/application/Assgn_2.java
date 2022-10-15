package application;


import java.lang.StackWalker.Option;

//Demonstrate Menus
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;

public class Assgn_2 extends Application {
	Label response;

	public static void main(String[] args) {
		// Start the JavaFX application by calling launch().
		launch(args);
	}

	// Override the start() method.
	public void start(Stage myStage) {

		// Give the stage a title.
		myStage.setTitle("Menu");

		// Use a BorderPane for the root node.
		BorderPane rootNode = new BorderPane();

		// Create a scene.
		Scene myScene = new Scene(rootNode, 300, 300);

		// Set the scene on the stage.
		myStage.setScene(myScene);

		// Create a label that will report the selection.
		response = new Label("WelCome");

		// Create the menu bar.
		MenuBar mb = new MenuBar();

		// Create the File menu.
		Menu fileMenu = new Menu("_File"); // now defines a mnemonic
		MenuItem New = new MenuItem("New");
		MenuItem open = new MenuItem("Open");
		MenuItem save = new MenuItem("Save");
		
		fileMenu.getItems().addAll(New, open, save, new SeparatorMenuItem());

		// Turn on mnemonic
		fileMenu.setMnemonicParsing(true);

		// Add keyboard accelerators for the File menu.
		New.setAccelerator(KeyCombination.keyCombination("shortcut+n"));
		open.setAccelerator(KeyCombination.keyCombination("shortcut+o"));
		save.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
		

		// Add File menu to the menu bar.
		mb.getMenus().add(fileMenu);

		// Create the File menu.
		Menu edit = new Menu("Edit"); // now defines a mnemonic
		MenuItem cut = new MenuItem("Cut");
		MenuItem copy = new MenuItem("Copy");
		MenuItem paste = new MenuItem("Paste");
				
		edit.getItems().addAll(cut, copy, paste, new SeparatorMenuItem());

		// Turn on mnemonic
		edit.setMnemonicParsing(true);

		// Add keyboard accelerators for the File menu.
		cut.setAccelerator(KeyCombination.keyCombination("shortcut+x"));
		copy.setAccelerator(KeyCombination.keyCombination("shortcut+c"));
		paste.setAccelerator(KeyCombination.keyCombination("shortcut+p"));
				

		
		// Add Options menu to the menu bar.
		mb.getMenus().add(edit);

		// Create the Help menu.
		Menu helpMenu = new Menu("Help");
		MenuItem helpcenter = new MenuItem("Help Centre");
		MenuItem about = new MenuItem("About us");
		helpMenu.getItems().add(helpcenter);
		helpMenu.getItems().add(about);
		helpMenu.setMnemonicParsing(true);

		// Add keyboard accelerators for the File menu.
		helpcenter.setAccelerator(KeyCombination.keyCombination("shortcut+h"));
		about.setAccelerator(KeyCombination.keyCombination("shortcut+a"));
		// Add Help menu to the menu bar.
		mb.getMenus().add(helpMenu);

		// Create one event handler that will handle menu action events.
		EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String name = ((MenuItem) ae.getTarget()).getText();
				// If Exit is chosen, the program is terminated.
				if (name.equals("Exit"))
					Platform.exit();
				response.setText(name + " selected");
			}
		};

		// Set action event handlers for the menu items.
		New.setOnAction(MEHandler);
		open.setOnAction(MEHandler);
		save.setOnAction(MEHandler);
		
		cut.setOnAction(MEHandler);
		copy.setOnAction(MEHandler);
		paste.setOnAction(MEHandler);
		
		helpcenter.setOnAction(MEHandler);
		about.setOnAction(MEHandler);

		// Add the menu bar to the top of the border pane and
		// the response label to the center position.
		rootNode.setTop(mb);
		rootNode.setCenter(response);

		// Show the stage and its scene.
		myStage.show();
	}
}