package com.controller;

import com.model.dto.PersonDTO;
import com.service.Service;
import com.view.Print;

public class Controller {
    private final Service service;
    private final Print print;
    public Controller() {
        service = new Service();
        print = new Print();
    }
    public void insertPerson(PersonDTO personDTO) {

        if (service.insertPerson(personDTO)) {
            print.printSuccessMessage("insert");
        } else {
            print.printErrorMessage("insert");
        }

    }
}
