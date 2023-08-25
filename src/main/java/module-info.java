module com.mihotel.hotelcocora {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.mihotel.hotelcocora to javafx.fxml;
    exports com.mihotel.hotelcocora;
}