package com.mpp.salab6javafx.prob1;

import com.mpp.salab6javafx.util.AppUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Prob1Controller {

    @FXML
    private TextField nameInput;
    @FXML
    private TextField streetInput;
    @FXML
    private TextField cityInput;
    @FXML
    private TextField stateInput;
    @FXML
    private TextField zipInput;

    @FXML
    protected void onSubmitClick() {
        HashMap<String, Pair<String, String>> hashMap = new LinkedHashMap<>() {{
            put("Name", new Pair<>(nameInput.getText(), "Name can't be empty"));
            put("Street", new Pair<>(streetInput.getText(), "Street can't be empty"));
            put("City", new Pair<>(cityInput.getText(), "City can't be empty"));
            put("State", new Pair<>(stateInput.getText(), "State can't be empty"));
            put("Zip", new Pair<>(zipInput.getText(), "Zip can't be empty"));
        }};
        boolean ifAnyFieldIsEmpty = AppUtil.showAlertIfAnyFieldIsEmpty(hashMap);
        if (ifAnyFieldIsEmpty) {
            return;
        }
        System.out.println(nameInput.getText().trim());
        System.out.println(streetInput.getText().trim());
        System.out.println(cityInput.getText().trim() + ", " + stateInput.getText().trim() + " " + zipInput.getText().trim());
    }

}