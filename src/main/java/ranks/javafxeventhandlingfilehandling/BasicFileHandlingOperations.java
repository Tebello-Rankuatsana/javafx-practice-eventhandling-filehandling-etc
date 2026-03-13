package ranks.javafxeventhandlingfilehandling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.*;

public class BasicFileHandlingOperations {

    @FXML
    private Button btnEnter;

    @FXML
    private TextField txtName;

    @FXML
    private Button btnLoad;

    @FXML
    private TextField txtLoad;

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

    @FXML
    void loadNames(ActionEvent event) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("names.txt"));
            String line;
            while((line = br.readLine()) != null){
                txtLoad.appendText(line+"\n");
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
