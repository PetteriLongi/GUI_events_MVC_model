package view;

import controller.DictionaryController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class DictionaryView extends Application {
    private DictionaryController controller;

    @Override
    public void init() {
        controller = new DictionaryController();
    }

    @Override
    public void start(Stage stage) {
        show(stage);
    }

    public void show(Stage stage) {
        Label titleLabel = new Label("Virtual dictionary");

        TextField wordField = new TextField();
        wordField.setPromptText("Enter a word");

        Button searchButton = new Button("Search");

        TextArea meaningArea = new TextArea();
        meaningArea.setEditable(false);
        meaningArea.setWrapText(true);
        meaningArea.setPrefRowCount(4);
        meaningArea.setPromptText("Meaning will be displayed here");

        searchButton.setOnAction(event -> {
            String word = wordField.getText();
            String result = controller.searchWord(word);
            meaningArea.setText(result);
        });

        FlowPane layout = new FlowPane();
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));
        layout.setHgap(10);
        layout.setVgap(10);
        layout.getChildren().addAll(titleLabel, wordField, searchButton, meaningArea);

        Scene scene = new Scene(layout, 350, 250);

        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }
}
