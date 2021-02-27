package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea mainTextArea;
    @FXML
    TextField messageField;

    public void sendText() {
        if (!messageField.getText().isEmpty()) {
            mainTextArea.appendText(messageField.getText() + "\n");
            messageField.clear();
        }
    }
}
