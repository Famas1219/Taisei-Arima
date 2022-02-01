package com.example.demo12;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public TextField textGetName;
    public TextField textGetNumber;
    public TextField textGetAge;
    public ListView FriendList = new ListView<>();
    public Label lbAge;
    public Label lbName;
    public Label lbNumber;
    public Button deleteFriend;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void addFriend(ActionEvent actionEvent) {
        String name = textGetName.getText();
        int num = Integer.parseInt(textGetNumber.getText());
        double age = Double.parseDouble((textGetAge.getText()));
        Friend temp = new Friend(name, age, num);
        FriendList.getItems().add(temp);
        textGetName.clear();
        textGetAge.clear();
        textGetNumber.clear();

    }
    public void deleteFriend(ActionEvent actionEvent){
        Friend temp;
        temp = (Friend) FriendList.getSelectionModel().getSelectedItem();
        FriendList.getItems().remove(FriendList.getSelectionModel().getSelectedIndex());
        if(temp != null){
            lbName.setText(temp.name);
            lbAge.setText(Double.toString(temp.getAge()));
            lbNumber.setText(Integer.toString(temp.getNumber()));

        }
        else {
            deleteFriend.setDisable(true);
            lbName.setText(null);
            lbAge.setText(null);
            lbNumber.setText(null);

        }
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = (Friend) FriendList.getSelectionModel().getSelectedItem();
        lbAge.setText(Double.toString(temp.getAge()));
        lbName.setText(temp.name);
        lbNumber.setText(Integer.toString(temp.getNumber()));

    }
}