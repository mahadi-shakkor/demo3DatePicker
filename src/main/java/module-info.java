module com.oop.mahadi.demo3datepicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.demo3datepicker to javafx.fxml;
    exports com.oop.mahadi.demo3datepicker;
}