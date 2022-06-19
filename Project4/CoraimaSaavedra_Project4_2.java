package CoraimaSaavedra_Project4;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CoraimaSaavedra_Project4 extends Application {
	
// Variables
	Stage window;
	Scene scene1, scene2;
	String name;

	@Override
	public void start(Stage primaryStage) throws IOException {
		
	// Setting up scene1 welcoming user to the game with Image
		window = primaryStage;
		FileInputStream stream = new FileInputStream("/Users/solange/Desktop/ITSS 4300/Untitled design.jpg");
		
		// Image object
		Image icon = new Image(stream);	
		
		// ImageView object
		ImageView iconIV = new ImageView(icon);
		iconIV.setFitWidth(500);
		iconIV.setFitHeight(300);	
		
		// Create a button to transition from Scene 1 to Scene 2
		Button beginGameButton = new Button( "Click to begin!");
		beginGameButton.setOnAction( e -> window.setScene(scene2));
		
		// Placing image and button on pane, then scene, then show 
		Pane layout1 = new Pane();
		layout1.getChildren().addAll(iconIV, beginGameButton);
		scene1 = new Scene(layout1, 500, 300);
		window.setScene(scene1);
		window.show();
		
	// Labels
		
		// Label for user's name 
		Label nameLabel = new Label("Name:"); 
		
		// Labels for first roll
		Label roll1Label = new Label("Roll 1");
		Label die1Label = new Label("Die 1");
		Label die2Label = new Label("Die 2");
		Label die3Label = new Label("Die 3");
		Label die1 = new Label("");
		Label die2 = new Label("");
		Label die3 = new Label("");
		Label lockLabel = new Label("Lock");
		Label rollLabel = new Label("Roll");
		Label sumLabel = new Label("Sum");
		Label pairLabel = new Label("Pair");
		Label tripLabel = new Label("Trip");
		Label straitLabel = new Label("Strait");
		Label pointsLabel = new Label("Points");
		Label sum = new Label("");
		Label pair = new Label("");
		Label trip = new Label("");
		Label strait = new Label("");
		Label points = new Label("");
		
		//Labels for second roll
		Label roll2Label = new Label("Roll 2");		
		Label die1Label_2 = new Label("Die 1");
		Label die2Label_2 = new Label("Die 2");
		Label die3Label_2 = new Label("Die 3");
		Label die1_2 = new Label("");
		Label die2_2 = new Label("");
		Label die3_2 = new Label("");
		Label sumLabel2 = new Label("Sum");
		Label pairLabel2 = new Label("Pair");
		Label tripLabel2 = new Label("Trip");
		Label straitLabel2 = new Label("Strait");
		Label pointsLabel2 = new Label("Points");
		Label improvementLabel = new Label("Improv");
		Font fontimprovementLabel = Font.font("Arial", FontWeight.BOLD, 14);
		improvementLabel.setFont(fontimprovementLabel);
		Label sum2 = new Label("");
		Label pair2 = new Label("");
		Label trip2 = new Label("");
		Label strait2 = new Label("");
		Label points2 = new Label("");
		Label improvement = new Label("");
		
		TextField fName = new TextField("");
		
		// Fonts for Labels 
		Font fontroll1Label = Font.font("Verdana", FontWeight.BOLD, 17);
		roll1Label.setFont(fontroll1Label); 
		Font fontroll2Label = Font.font("Verdana", FontWeight.BOLD, 17);
		roll2Label.setFont(fontroll2Label); 
		;
	
	// Create a button for Roll 1 
		Button roll1Button = new Button("Click for Roll 1");
		
		// Edit button Font, Font Color, and Fill
		Font fontRoll1Button = Font.font("Arial", FontWeight.BOLD, 17);
		roll1Button.setFont(fontRoll1Button);
		roll1Button.setStyle("-fx-background-color: ROYALBLUE; ");
		roll1Button.setTextFill(Color.WHITE);
		
		// Create a button for Roll 2
		Button roll2Button = new Button("Click for Roll 2");
		
		// Edit button Font, Font Color, and Fill
		Font fontRoll2Button = Font.font("Arial", FontWeight.BOLD, 17);
		roll2Button.setFont(fontRoll2Button);
		roll2Button.setStyle("-fx-background-color: ROYALBLUE; ");
		roll2Button.setTextFill(Color.WHITE);

		// Create a button for Roll 2
		Button playAgain = new Button("Click to Play Again");
		
		// Edit button Font, Font Color, and Fill
		Font fontPlayAgain = Font.font("Arial", FontWeight.BOLD, 25);
		playAgain.setFont(fontPlayAgain);
		playAgain.setStyle("-fx-background-color: BLUE;");
		playAgain.setTextFill(Color.WHITE);
		
		// Create RadioButtons for locking and rerolling each dice value
		RadioButton lock1 = new RadioButton();
		lock1.setStyle("-fx-background-color: green;");
		RadioButton reroll1 = new RadioButton();
		reroll1.setStyle("-fx-background-color: red;");
		RadioButton lock2 = new RadioButton();
		lock2.setStyle("-fx-background-color: green;");
		RadioButton reroll2 = new RadioButton();
		reroll2.setStyle("-fx-background-color: red;");
		RadioButton lock3 = new RadioButton();
		lock3.setStyle("-fx-background-color: green;");
		RadioButton reroll3 = new RadioButton();
		reroll3.setStyle("-fx-background-color: red;");
		
		// Create ToggleGroups to be able to click only lock or reroll for each dice
		ToggleGroup die1TGroup = new ToggleGroup();
		lock1.setToggleGroup(die1TGroup);
		reroll1.setToggleGroup(die1TGroup);
		ToggleGroup die2TGroup = new ToggleGroup();
		lock2.setToggleGroup(die2TGroup);
		reroll2.setToggleGroup(die2TGroup);	
		ToggleGroup die3TGroup = new ToggleGroup();
		lock3.setToggleGroup(die3TGroup);
		reroll3.setToggleGroup(die3TGroup);
		
		
		HBox die1HBox = new HBox(2, lock1, reroll1);
		die1HBox.setSpacing(21);
		HBox die2HBox = new HBox(2, lock2, reroll2);
		die2HBox.setSpacing(21);
		HBox die3HBox = new	HBox(2, lock3, reroll3);	
		die3HBox.setSpacing(21);

		
		HBox summaryHBox = new HBox(sumLabel, pairLabel, tripLabel, straitLabel, pointsLabel);
		summaryHBox.setSpacing(25);
		summaryHBox.setStyle("-fx-border-color: blue;");
		HBox summaryHBoxNumbers = new HBox(sum, pair, trip, strait, points);
		summaryHBoxNumbers.setSpacing(45);
		
		HBox summaryHBox_2 = new HBox(sumLabel2, pairLabel2, tripLabel2, straitLabel2, pointsLabel2, improvementLabel);
		summaryHBox_2.setSpacing(10);
		summaryHBox_2.setStyle("-fx-border-color: blue;");
		HBox summaryHBoxNumbers_2 = new HBox(sum2, pair2, trip2, strait2, points2, improvement);
		summaryHBoxNumbers_2.setSpacing(30);
		
		HBox lrHBox = new HBox(lockLabel, rollLabel);
		lrHBox.setSpacing(10);
					
		// Adding HBoxs and Labels to GridPane
		GridPane grid = new GridPane();
		grid.getChildren().addAll(nameLabel,fName, roll1Label, roll1Button, lrHBox, die1Label, die2Label, die3Label, die1, die2, die3, die1HBox, die2HBox, die3HBox, summaryHBox, summaryHBoxNumbers); 
		grid.getChildren().addAll(roll2Label, roll2Button, die1Label_2, die2Label_2, die3Label_2, die1_2, die2_2, die3_2, summaryHBox_2, summaryHBoxNumbers_2, playAgain);
		
		// Spacing in GridPane
		grid.setPadding(new Insets(40, 40, 50, 40)); 
		grid.setHgap(20); 
		grid.setVgap(10); 
		
	// Constraints to place Labels, HBox, and Buttons on GridPane
		grid.setConstraints(nameLabel, 0,0);
		grid.setConstraints(fName, 1,0); 
		
		grid.setConstraints(roll1Label, 0, 3);
		grid.setConstraints(roll1Button, 1, 3);
		grid.setConstraints(lrHBox, 2, 4);
		
		grid.setConstraints(die1HBox, 2, 5);
		grid.setConstraints(die2HBox, 2, 6);
		grid.setConstraints(die3HBox, 2, 7);
		
		grid.setConstraints(die1Label,0,5);
		grid.setConstraints(die1, 1, 5);
		grid.setConstraints(die2Label,0,6);
		grid.setConstraints(die2, 1, 6);
		grid.setConstraints(die3Label,0,7);
		grid.setConstraints(die3, 1, 7);
		
		grid.setConstraints(summaryHBox, 1, 8);
		grid.setConstraints(summaryHBoxNumbers, 1, 9);
		grid.setConstraints(roll2Label, 0, 10);
		grid.setConstraints(roll2Button, 1, 10);
		
		grid.setConstraints(die1Label_2,0,12);
		grid.setConstraints(die1_2, 1, 12);
		grid.setConstraints(die2Label_2,0,13);
		grid.setConstraints(die2_2, 1, 13);
		grid.setConstraints(die3Label_2,0,14);
		grid.setConstraints(die3_2, 1, 14);
		grid.setConstraints(summaryHBox_2, 1, 15);
		grid.setConstraints(summaryHBoxNumbers_2, 1, 16);
		grid.setConstraints(playAgain, 1, 18);
		
		
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(grid);
		Stage stage2 = new Stage();
		scene2 = new Scene(layout2, Color.BLACK);
		stage2.setScene(scene2);
		
// Event Handling **********************************************	
		fName.setOnKeyPressed(e -> {   
			if (e.getCode() == KeyCode.TAB || e.getCode() == KeyCode.DOWN || e.getCode() == KeyCode.ENTER) {
					name = fName.getText();
					System.out.println(name); 
					roll1Button.requestFocus(); 
					
			}
		});
		
		
		// Roll 1 event handling
		Roll rollObj = new Roll();
		roll1Button.setOnAction( e -> { 
			rollObj.setRoll1();
			rollObj.sortRoll(rollObj.getRoll1());
			System.out.println("Roll 1");
			die1.setText(Integer.toString(rollObj.getRoll1(0)));
			die2.setText(Integer.toString(rollObj.getRoll1(1)));
			die3.setText(Integer.toString(rollObj.getRoll1(2)));
				
			rollObj.setSum1();
			sum.setText(Integer.toString(rollObj.getSum1()));
			
			rollObj.setPairBonus1();
			pair.setText(Integer.toString(rollObj.getPairBonus1()));
			
			rollObj.setTripBonus1();
			trip.setText(Integer.toString(rollObj.getTripBonus1()));
			
			rollObj.setStrBonus1();
			strait.setText(Integer.toString(rollObj.getStrBonus1()));
			
			rollObj.setPoints1();
			points.setText(Integer.toString(rollObj.getPoints1()));
			
			
		});
		
		
		// Roll 2 event handling
		RadioButton [] lrArray = {lock1, reroll1, lock2, reroll2, lock3, reroll3};
		roll2Button.setOnAction( e-> {
			rollObj.setRoll2(rollObj.getLockNRoll(lrArray));
			rollObj.sortRoll(rollObj.getRoll2());
			System.out.println("Roll 2");
			die1_2.setText(Integer.toString(rollObj.getRoll2(0)));
			die2_2.setText(Integer.toString(rollObj.getRoll2(1)));
			die3_2.setText(Integer.toString(rollObj.getRoll2(2)));
			
			rollObj.setSum2();
			sum2.setText(Integer.toString(rollObj.getSum2()));
			
			rollObj.setPairBonus2();
			pair2.setText(Integer.toString(rollObj.getPairBonus2()));
			
			rollObj.setTripBonus2();
			trip2.setText(Integer.toString(rollObj.getTripBonus2()));
			
			rollObj.setStrBonus2();
			strait2.setText(Integer.toString(rollObj.getStrBonus2()));
			
			rollObj.setPoints2();
			points2.setText(Integer.toString(rollObj.getPoints2()));
			
			improvement.setText(Integer.toString(rollObj.getImprovement()));
			
			playAgain.requestFocus();
			
		}); 
		
		// Play Again event handling
		playAgain.setOnAction(e -> {
			
			// Clearing out info on roll1
			die1.setText("");
			die2.setText("");
			die3.setText("");
			sum.setText("");
			pair.setText("");
			trip.setText("");
			strait.setText("");
			points.setText("");
			
			// Clearing out info on roll2
			die1_2.setText("");
			die2_2.setText("");
			die3_2.setText("");
			sum2.setText("");
			pair2.setText("");
			trip2.setText("");
			strait2.setText("");
			points2.setText("");
			improvement.setText("");
			
			// Setting L/R on roll1 to "Roll"
			die1TGroup.selectToggle(lock1);
			die1TGroup.selectToggle(reroll1);
			die2TGroup.selectToggle(lock2);
			die2TGroup.selectToggle(reroll2);
			die3TGroup.selectToggle(lock3);
			die3TGroup.selectToggle(reroll3);
			
			// Starting playAgain at roll1 
			roll1Button.requestFocus();

		});

}

		
	
	public static void main(String[] args) {
		launch(args);
	}
}
