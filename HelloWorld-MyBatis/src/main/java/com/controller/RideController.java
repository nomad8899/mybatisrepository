package com.controller;

import com.model.dto.RideDTO;
import com.service.RideService;
import com.service.Service;
import com.view.Print;

public class RideController {
    private final RideService rideService;
    private final Print print;
    public RideController() {
        rideService = new RideService();
        print = new Print();
    }

    public void waitingLine(RideDTO ridewaiting) {
        ridewaiting.setEntranceCode(ridewaiting.getEntranceCode());

        boolean successUpdateRide = rideService.modifyRideInfo(ridewaiting);

//        if(successUpdateRide) {
//            Print.printSuccessMessage("successUpdate");
//        } else {
//            productPrint.printErrorMessage("failUpdate");
//        }
    }
}
