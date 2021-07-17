package firstweb.web.client;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/clients")
public class ClientManagementController {
    private static final List<Client> CLIENTS = Arrays.asList(
            new Client(1, "James Curry"),
            new Client(2, "Getter Setter"),
            new Client(3, "Mister Bean")

    );
    @GetMapping
    public List<Client> getAllClients(){
        return CLIENTS;
    }
    @PostMapping
    public void registerNewClient(@RequestBody Client client){
        System.out.println(client);
    }
    @DeleteMapping(path = {"{clientId}"})
    public void deleteClient(@PathVariable("clientId") Integer clientId){
        System.out.println(clientId);
    }
    @PostMapping(path = "{clientId}")
    public void updateClient(@PathVariable("clientId") Integer clientId, Client client){
        System.out.printf("%s %s%n", clientId, client);
    }
}
