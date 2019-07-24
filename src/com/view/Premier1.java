package com.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Premier1 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Parent root =FXMLLoader.load(getClass().getResource("P1.fxml"));
		Scene sc=new Scene(root);
		arg0.setTitle("premier1");
		arg0.setScene(sc);
		arg0.show();
	}

	

}
