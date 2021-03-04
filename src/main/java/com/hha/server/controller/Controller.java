package com.hha.server.controller;

import com.hha.server.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
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

    @GetMapping
    String hello() {
        return "Hello World!";
    }

    @GetMapping("/clients")
    List<Client> getAllClients() {
        clientRepository.save(new Client(TRUE, "date", "first", "last", 20, "M", "location", 3, "xxx", FALSE, "none", "hr", "hreq", "hgoal", "edr", "edreq", "edgoal", "sr", "sreq", "sgoal"));
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

@Repository
interface ClientRepository extends JpaRepository<Client, Long> {}



