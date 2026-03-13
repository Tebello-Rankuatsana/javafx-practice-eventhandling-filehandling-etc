package ranks.javafxeventhandlingfilehandling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BasicFileHandlingOperations {

    @FXML
    private Button btnEnter;

    @FXML
    private TextField txtName;

    @FXML
    void saveName(ActionEvent event) {
        try{
            FileWriter fw = new FileWriter("names.txt",true);
            fw.write(txtName.getText()+"\n");
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
