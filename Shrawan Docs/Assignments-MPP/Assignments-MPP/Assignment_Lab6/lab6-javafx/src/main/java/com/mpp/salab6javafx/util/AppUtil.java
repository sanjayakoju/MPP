package com.mpp.salab6javafx.util;

import javafx.scene.control.Alert;
import javafx.util.Pair;

import java.util.Map;

public class AppUtil {

    public static boolean showAlertIfAnyFieldIsEmpty(Map<String, Pair<String, String>> mapFieldAlerts) {

        StringBuilder sbAlertMsgContent = new StringBuilder();
        for (Map.Entry<String, Pair<String, String>> entry : mapFieldAlerts.entrySet()) {
            Pair<String, String> pair = entry.getValue();

            String key = pair.getKey();
            if (null == key || key.trim().length() <= 0) {
                sbAlertMsgContent.append(pair.getValue());
                sbAlertMsgContent.append("\n");
            }
        }

        if (!sbAlertMsgContent.isEmpty()) {
            Alert alert = createAlert(Alert.AlertType.WARNING, "You missed to enter some values !", sbAlertMsgContent.toString());
            alert.showAndWait();
            return true;
        }

        return false;
    }

    public static boolean showAlertIfFieldIsEmpty(String value, String alertText) {
        if (null == value || value.trim().length() <= 0) {
            Alert alert = createAlert(Alert.AlertType.WARNING, alertText, "Field can't be empty");
            alert.showAndWait();
            return true;
        }
        return false;
    }

    public static Alert createAlert(Alert.AlertType alertType, String headerText, String contentText) {
        Alert alert = new Alert(alertType);
        alert.setTitle("Oops !!!");
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        return alert;
    }
}
