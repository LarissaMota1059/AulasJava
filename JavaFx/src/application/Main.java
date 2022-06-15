package application;
	

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	private static final Node IbiTeste = null;

	@Override
	public void start(Stage primaryStage) {
		try {
			
			GridPane grid = new GridPane();
			grid .setHgap(5.0);
			grid.setVgap(7.0);
			
			grid.add(new Label("Nome"), 0, 0);
			TextField txtNome = new TextField();
			grid.add(txtNome, 1, 0);
			
			grid.add(new Label("Sexo"), 0, 0);
			RadioButton btnMasc = new RadioButton("Masculino");
			RadioButton btnFem = new RadioButton("MFeminino");
			btnFem.setSelected(true);
			
			ToggleGroup group = new ToggleGroup();
			btnFem.setToggleGroup(group);
			btnMasc.setToggleGroup(group);
			
			HBox radioBox = new HBox(5.0,btnFem,btnMasc);
			grid.add(radioBox, 1, 1);
			
			ChoiceBox<String> chcEstados = new ChoiceBox<>();
			
			ObservableList<String> estados = FXCollections.observableArrayList("São Paulo", "Rio de Janeiro", "Minas gerais" );
			
			chcEstados.setItems(estados);
			
			Label lblTeste = new Label();
			
			grid.add(chcEstados, 0, 2);
			
			Button btnTeste = new Button("Teste");
			btnTeste.setOnAction(event -> lblTeste.setText(txtNome.getText()));
			btnTeste.setOnMouseEntered(event -> lblTeste.setText("Passou"));
			btnTeste.setOnMouseEntered(event -> lblTeste.setText("Saiu"));
			
			CheckBox ckbTeste = new CheckBox("Teste");
			
			grid.add(btnTeste, 0, 3);
			grid.add(lblTeste, 0, 4);
			grid.add(ckbTeste, 0, 5);
			
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
	
			
			root.setCenter(grid);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Object showDialog(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
