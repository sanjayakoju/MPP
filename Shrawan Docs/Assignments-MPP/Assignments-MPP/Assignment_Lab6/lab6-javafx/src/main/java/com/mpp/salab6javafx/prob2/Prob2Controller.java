package com.mpp.salab6javafx.prob2;

import com.mpp.salab6javafx.util.AppUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.HashSet;
import java.util.Set;

public class Prob2Controller {

    @FXML
    private Button btnCountLetter;

    @FXML
    private Button btnReverseLetter;

    @FXML
    private Button btnRemoveDuplicate;

    @FXML
    private TextField inputText;

    @FXML
    private TextField outputText;

    @FXML
    protected void onCountLetterClick() {
        String value = inputText.getText().trim();
        boolean fieldIsEmpty = AppUtil.showAlertIfFieldIsEmpty(value, "Input text is required");
        if(fieldIsEmpty) {
            return;
        }
        outputText.setText(String.valueOf(value.length()));
    }

    @FXML
    protected void onReverseLetterClick() {
        String value = inputText.getText().trim();
        boolean fieldIsEmpty = AppUtil.showAlertIfFieldIsEmpty(value, "Input text is required");
        if(fieldIsEmpty) {
            return;
        }
        String reverseString = new StringBuilder(value).reverse().toString();
        outputText.setText(reverseString);
    }

    @FXML
    protected void onRemoveDuplicateClick() {
        String inputValue = inputText.getText().trim();
        boolean fieldIsEmpty = AppUtil.showAlertIfFieldIsEmpty(inputValue, "Input text is required");
        if(fieldIsEmpty) {
            return;
        }
        char[] inputChars = inputValue.toCharArray();
        Set<Character> uniqueCharSetHolder = new HashSet<>();
        int dCount = 0;
        for (char c : inputChars) {
            if (uniqueCharSetHolder.add(c)) {
                inputChars[dCount] = c;
                dCount++;
            }
        }
        String distinctString = new String(inputChars, 0, dCount);
        outputText.setText(distinctString);

    }

}
