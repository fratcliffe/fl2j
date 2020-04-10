package uk.fratcliffe.fl2j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uk.fratcliffe.fl2j.models.Embedded;

@RestController
public class WorldController {
    @Autowired
    private TeleportClient teleportClient;
    @RequestMapping("/Cities")
    public Embedded city(@RequestParam String name) {
        Embedded city = teleportClient.getCity(name);
        return city;
    }
}
