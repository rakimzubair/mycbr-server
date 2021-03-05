package com.hha.server.controller;

import com.hha.server.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller {
    @Autowired
    private final ClientRepository clientRepository;

    public Controller(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping
    String homepage() {
        return "myCBR Server";
    }

    @GetMapping("/count")
    long numClients() {
        return clientRepository.count();
    }


    //SYNC ENDPOINTS - CLIENT
    //1. App has no data
    @GetMapping("/no-client")
    List<Client> emptySync() {
        clientRepository.save(new Client((long) 1, true, "date", "fname",
                "lname", 10, "m", "location", 2,
                "xxx", false, "", "disability",
                "hr", "hreq", "hgoal", "er", "ereq",
                "egoal", "sr", "sreq", "goal", 1));
        return clientRepository.findAll();
    }

    //2. App has only one entry
    @PostMapping("/client")
    List<Client> singleSync(@RequestBody Client client) {
        clientRepository.save(new Client(client. getID(), client.getCONSENT(), client.getDATE(), client.getFIRST_NAME(),
                    client.getLAST_NAME(), client.getAGE(), client.getGENDER(), client.getLOCATION(), client.getVILLAGE_NUMBER(),
                    client.getCONTACT(), client.getCAREGIVER_PRESENCE(), client.getCAREGIVER_NUMBER(), client.getDISABILITY(),
                    client.getHEALTH_RATE(), client.getHEALTH_REQUIREMENT(), client.getHEALTH_GOAL(), client.getEDUCATION_RATE(), client.getEDUCATION_REQUIRE(),
                    client.getEDUCATION_GOAL(), client.getSOCIAL_RATE(), client.getSOCIAL_REQUIREMENT(), client.getSOCIAL_GOAL(), 1));

        return clientRepository.findAll();
    }

    //3. App has multiple entries
    @PostMapping("/clients")
    List<Client> multipleSync(@RequestBody List<Client> clients) {
        for (Client client : clients) {
            clientRepository.save(new Client(client. getID(), client.getCONSENT(), client.getDATE(), client.getFIRST_NAME(),
                    client.getLAST_NAME(), client.getAGE(), client.getGENDER(), client.getLOCATION(), client.getVILLAGE_NUMBER(),
                    client.getCONTACT(), client.getCAREGIVER_PRESENCE(), client.getCAREGIVER_NUMBER(), client.getDISABILITY(),
                    client.getHEALTH_RATE(), client.getHEALTH_REQUIREMENT(), client.getHEALTH_GOAL(), client.getEDUCATION_RATE(), client.getEDUCATION_REQUIRE(),
                    client.getEDUCATION_REQUIRE(), client.getSOCIAL_RATE(), client.getSOCIAL_REQUIREMENT(), client.getSOCIAL_GOAL(), 1));
        }

        return clientRepository.findAll();
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



