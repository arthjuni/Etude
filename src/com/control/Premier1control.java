package com.control;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class Premier1control<zone_nuova_partita> {
	  @FXML // fx:id="zone_nuova_partita"
	    private HBox zone_nuova_partita; // Value injected by FXMLLoader

	    @FXML // fx:id="Btn_nuova_partita"
	    private Button Btn_nuova_partita; // Value injected by FXMLLoader

	    @FXML // fx:id="Txf_contattore_fatto"
	    private TextField Txf_contattore_fatto; // Value injected by FXMLLoader

	    @FXML // fx:id="Txf_contattore_max"
	    private TextField Txf_contattore_max; // Value injected by FXMLLoader

	    @FXML // fx:id="zona_inserire_numero"
	    private HBox zona_inserire_numero; // Value injected by FXMLLoader

	    @FXML // fx:id="Btn_invio"
	    private Button Btn_invio; // Value injected by FXMLLoader

	    @FXML // fx:id="Txf_numero_indovinato"
	    private TextField Txf_numero_indovinato; // Value injected by FXMLLoader

	    @FXML // fx:id="TxA_messagio"
	    private TextArea TxA_messagio; // Value injected by FXMLLoader

	    @FXML
	    void handler_Btn_invio(ActionEvent event) {

	    }

	    @FXML
	    void handler_Btn_nuova_partita(ActionEvent event) {

	    }

}
