package com.hha.server.controller;

import com.hha.server.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    private final ClientRepository clientRepository;

    public Controller(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping
    String hello() {
        return "Hello World";
    }

    @GetMapping("/clients")
    Iterable<Client> getAllClients() {
        return clientRepository.findAll();

    }

    //Exception Handlers
    @ResponseStatus(value = HttpStatus.BAD_REQUEST,
            reason = "Request ID not found.")
    @ExceptionHandler(IllegalArgumentException.class)
    public void badIdExceptionHandler() {

    }
}

interface ClientRepository extends JpaRepository<Client, Long> {

}



