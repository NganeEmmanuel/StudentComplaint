module com.studentcomplaint.studentcompliant {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.studentcomplaint.studentcompliant to javafx.fxml;
    exports com.studentcomplaint.studentcompliant;
}