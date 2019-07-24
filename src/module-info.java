/**
 * 
 */
/**
 * @author Administrator
 *
 */
module Etude {
	
	requires javafx.controls;
	requires transitive javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	opens com.control to javafx.fxml;
	exports com.view;
    exports com.control to javafx.fxml;
}