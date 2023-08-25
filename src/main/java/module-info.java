module com.mihotel.hotelcocora {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.hotel.Controller to javafx.fxml;
    exports com.hotel.Controller;
    exports com.hotel.Application;
    opens com.hotel.Application to javafx.fxml;
}