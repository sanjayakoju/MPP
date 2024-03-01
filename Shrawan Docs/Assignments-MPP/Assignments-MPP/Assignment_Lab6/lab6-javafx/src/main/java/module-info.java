module com.mpp.salab6javafx {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.mpp.salab6javafx.prob1;
    opens com.mpp.salab6javafx.prob1 to javafx.fxml;

    exports com.mpp.salab6javafx.prob2;
    opens com.mpp.salab6javafx.prob2 to javafx.fxml;
}