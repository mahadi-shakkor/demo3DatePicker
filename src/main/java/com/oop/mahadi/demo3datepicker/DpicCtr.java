package com.oop.mahadi.demo3datepicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DpicCtr {

    @FXML
    private DatePicker DatePickerFxid;

    @FXML
    private Label labelFxid;

    @FXML
    void DatePickerOnAction(ActionEvent event) {


        LocalDate myDate = DatePickerFxid.getValue();
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
        labelFxid.setText(myFormattedDate);



    }

}
