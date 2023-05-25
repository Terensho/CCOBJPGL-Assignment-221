package Controller;


import Model.Arjay;
import Model.Beatriz;
import Model.Carlo;
import Model.Jasper;
import Model.Lhara;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;


public class ClassmateController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Lhara lhara = new Lhara();
    Jasper jasper = new Jasper();
    Carlo carlo = new Carlo();
    Arjay arjay = new Arjay();
    Beatriz beatriz = new Beatriz();
    

    public void initialize() {

        lhara.setGender("Female");
        lhara.setAge("19");

        jasper.setGender("Male");
        jasper.setAge("20");

        carlo.setGender("Male");
        carlo.setAge("19");
        
        arjay.setGender("Prefer not to say");
        arjay.setAge("19");
        
        beatriz.setGender("Female");
        beatriz.setAge("19");

        
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Bea " + beatriz.getGender() + " and  " + beatriz.getAge());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Jasper " + jasper.getGender() + " and " + jasper.getAge());
        }
        if (sourceButton == btn3) {
            alert.setContentText("Carlo " + carlo.getGender() + " and " + carlo.getAge());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Arjay " + arjay.getGender() + " and " + arjay.getAge());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Lhara" + lhara.getGender() + " and " + lhara.getAge());
        }



        alert.showAndWait();

    }
}



