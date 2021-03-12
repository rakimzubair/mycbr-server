package com.hha.server.controller;

import com.hha.server.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    //TODO: Add repositories for all objects that are created, and annotate with @Autowired.
    @Autowired
    private final ClientRepository clientRepository;

    public Controller(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping
    String homepage() {
        return "Welcome to myCBR Server!";
    }

    @GetMapping("/count")
    long numClients() {
        return clientRepository.count();
    }


    //SYNC ENDPOINTS - CLIENT
    //1. App has no data
    @GetMapping("/get-clients")
    List<Client> emptySync() {
        return clientRepository.findAll();
    }

    //2. App has entries
    @PostMapping("/clients")
    List<Client> multipleSync(@RequestBody List<Client> clients) {
        int ID = 0;

        for (Client client : clients) {
            ID = (int) Long.parseLong(client.getID());

            if (!clientRepository.findByID(client.getID()).isEmpty()) {
                ID += 1;
            }

            clientRepository.save(new Client(String.valueOf(ID), client.getCONSENT(), client.getDATE(), client.getFIRST_NAME(),
                    client.getLAST_NAME(), client.getAGE(), client.getGENDER(), client.getLOCATION(), client.getVILLAGE_NUMBER(),
                    client.getCONTACT(), client.getCAREGIVER_PRESENCE(), client.getCAREGIVER_NUMBER(), client.getDISABILITY(),
                    client.getHEALTH_RATE(), client.getHEALTH_REQUIREMENT(), client.getHEALTH_GOAL(), client.getEDUCATION_RATE(), client.getEDUCATION_REQUIRE(),
                    client.getEDUCATION_GOAL(), client.getSOCIAL_RATE(), client.getSOCIAL_REQUIREMENT(), client.getSOCIAL_GOAL(), "1"));
        }

        return clientRepository.findAll();
    }


    /*-------TODO: Adding endpoints for other tables-------------
    Just change the "Client" to whatever object you're adding.

    //1. App has no data
    @GetMapping("/get-clients")
    List<Client> emptySync() {
        return clientRepository.findAll();
    }

    //2. App has entries
    @PostMapping("/clients")
    List<Client> multipleSync(@RequestBody List<Client> clients) {
        int ID = 0;

        for (Client client : clients) {
            ID = (int) Long.parseLong(client.getID());

            if (!clientRepository.findByID(client.getID()).isEmpty()) {
                ID += 1;
            }

            clientRepository.save(new Client(String.valueOf(ID), client.getCONSENT(), client.getDATE(), client.getFIRST_NAME(),
                    client.getLAST_NAME(), client.getAGE(), client.getGENDER(), client.getLOCATION(), client.getVILLAGE_NUMBER(),
                    client.getCONTACT(), client.getCAREGIVER_PRESENCE(), client.getCAREGIVER_NUMBER(), client.getDISABILITY(),
                    client.getHEALTH_RATE(), client.getHEALTH_REQUIREMENT(), client.getHEALTH_GOAL(), client.getEDUCATION_RATE(), client.getEDUCATION_REQUIRE(),
                    client.getEDUCATION_GOAL(), client.getSOCIAL_RATE(), client.getSOCIAL_REQUIREMENT(), client.getSOCIAL_GOAL(), "1"));
        }

        return clientRepository.findAll();
    }

    */

    //Exception Handlers
    @ResponseStatus(value = HttpStatus.BAD_REQUEST,
            reason = "Request ID not found.")
    @ExceptionHandler(IllegalArgumentException.class)
    public void badIdExceptionHandler() {

    }
}

/*TODO: implement interfaces for all objects that are added.
The code below can be reused, again just change Client to whatever object you're implementing
*/

@Component
interface ClientRepository extends JpaRepository<Client, Long> {
    @Query(value = "SELECT * FROM CLIENT_DATA WHERE ID = ?1", nativeQuery = true)
    List<Client> findByID(String ID);
}



