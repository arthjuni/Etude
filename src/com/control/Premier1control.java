package com.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Premier1control {
	
	  @FXML
	    private Button button;

	    @FXML
	    private TextField textfil;
       public String st;
       @FXML
       private Label LabelCC;
       

        @FXML
	    void buttonaction(ActionEvent event) {
	LabelCC.setText(textfil.toString());
	  

	    }

	    @FXML
	    void textfilaction(ActionEvent event) {
System.out.println(st);
System.out.println("bonjour".toString());
	    }


}
