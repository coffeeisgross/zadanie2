package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller {
    public RadioButton rb1;
    public RadioButton rb2;
    public RadioButton rb3;
    public Button button;
    public Label label;
    public ToggleGroup group;



    public void handleClick(ActionEvent actionEvent) {
        String tekst;
        rb1.setUserData("Hufflepuff");
        rb2.setUserData("Slytherin");
        rb3.setUserData("Ravenclaw lub Gryffindor");
        tekst = group.getSelectedToggle().getUserData().toString();
        if (group.getSelectedToggle() != null) {
            label.setText(tekst);
        }



    }
}
