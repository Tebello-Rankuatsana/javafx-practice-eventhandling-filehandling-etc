package ranks.javafxeventhandlingfilehandling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class EventHandlingPracticeOne {

    @FXML
    private Button btnGreet;

    @FXML
    private Button btnShow;

    @FXML
    private Button btnOutput;

    @FXML
    private Label lblMessage;

    @FXML
    private TextField txtName;

    @FXML
    private CheckBox chkBoxing;

    @FXML
    private CheckBox chkChess;

    @FXML
    private CheckBox chkGaming;

    @FXML
    private CheckBox chkMusic;

    @FXML
    private Label lblResult;

    @FXML
    private Label lblOutput;

    @FXML
    private RadioButton rbJuice;

    @FXML
    private RadioButton rbMilk;

    @FXML
    private RadioButton rbWater;

    @FXML
    void handleGreet(ActionEvent event) {
        String name = txtName.getText();
        lblMessage.setText("Hello "+name+"!");
    }

    @FXML
    void showHobbies(ActionEvent event) {

        String hobbies = "";

        if(chkMusic.isSelected())
            hobbies += "Music ";

        if(chkChess.isSelected())
            hobbies += "Chess ";

        if(chkBoxing.isSelected()){
            hobbies += "Boxing";
        }

        if(chkGaming.isSelected()){
            hobbies += "Gaming";
        }

        lblResult.setText("Hobbies: " + hobbies);
    }

    @FXML
    void showRefreshments(ActionEvent event) {

        if(rbJuice.isSelected())
            lblOutput.setText("Juice selected");

        if(rbMilk.isSelected())
            lblOutput.setText("Milk selected");

        if(rbWater.isSelected())
            lblOutput.setText("Water selected");
    }


}
