package com.hha.server.controller;

import com.hha.server.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

@RestController
public class Controller {
    @Autowired
    private final ClientRepository clientRepository;

    public Controller(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    /*@GetMapping
    String hello() {
        return "Hello World!";
    }*/

    @PostMapping("/clients")
    List<Client> sync(@RequestBody List<Client> clients) {
        //adding new data to database
        for (Client client : clients) {
            clientRepository.save(new Client(client.getConsentToInterview(), client.getDate(), client.getFirstName(),
                    client.getLastName(), client.getAge(), client.getGender(), client.getLocation(), client.getVillageNumber(),
                    client.getContactPhoneNumber(), client.getCaregiverPresent(), client.getCaregiverPhoneNumber(), client.getHealthRate(),
                    client.getHealthRequire(), client.getHealthIndividualGoal(), client.getEducationRate(), client.getEducationRequire(),
                    client.getEducationIndividualGoal(), client.getSocialStatusRate(), client.getSocialStatusRequire(), client.getSocialStatusIndividualGoal()));
        }

        return clientRepository.findAll();
    }

    @GetMapping("/count")
    long numClients() {
        return clientRepository.count();
    }

    //Exception Handlers
    @ResponseStatus(value = HttpStatus.BAD_REQUEST,
            reason = "Request ID not found.")
    @ExceptionHandler(IllegalArgumentException.class)
    public void badIdExceptionHandler() {

    }
}

@Component
interface ClientRepository extends JpaRepository<Client, Long> {}



