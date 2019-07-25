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
	opens com.view to javafx.fxml;
	exports com.view to javafx.graphics;
    exports com.control to javafx.fxml;
}