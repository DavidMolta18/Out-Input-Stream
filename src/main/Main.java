package main;

import javafx.application.Application;
import javafx.stage.Stage;
import ui.MainWindow;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		MainWindow mw = new MainWindow();
		mw.show();
	}

}
