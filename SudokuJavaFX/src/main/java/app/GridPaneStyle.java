package app;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
 

public class GridPaneStyle extends Application {
	  @Override public void start(final Stage stage) {
	    
	    GridPane grid = new GridPane();
	    grid.addRow(0, new Label("1"), new Label("2"), new Label("3"));
	    grid.addRow(1, new Label("A"), new Label("B"), new Label("C"));
	    
	    
	    for (Node n: grid.getChildren()) {
	      if (n instanceof Control) {
	        Control control = (Control) n;
	        control.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
	        control.setStyle("-fx-background-color: cornsilk; -fx-alignment: center;");
	      }
	      if (n instanceof Pane) {
	        Pane pane = (Pane) n;
	        pane.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
	        pane.setStyle("-fx-background-color: cornsilk; -fx-alignment: center;");
	      }
	    }

	    
	    grid.setStyle("-fx-background-color: palegreen; -fx-padding: 2; -fx-hgap: 2; -fx-vgap: 2;");
	    
	    grid.setSnapToPixel(false);

	    
	    ColumnConstraints oneThird = new ColumnConstraints();
	    oneThird.setPercentWidth(100/3.0);
	    oneThird.setHalignment(HPos.CENTER);
	    grid.getColumnConstraints().addAll(oneThird, oneThird, oneThird);
	    RowConstraints oneHalf = new RowConstraints();
	    oneHalf.setPercentHeight(100/2.0);
	    oneHalf.setValignment(VPos.CENTER);
	    grid.getRowConstraints().addAll(oneHalf, oneHalf);
	    
	    
	    StackPane layout = new StackPane();
	    layout.setStyle("-fx-background-color: whitesmoke; -fx-padding: 10;");
	    layout.getChildren().addAll(grid);
	    stage.setScene(new Scene(layout, 600, 400));
	    stage.show();
	    
	   
	  }
	  public static void main(String[] args) { launch(); }
	}
