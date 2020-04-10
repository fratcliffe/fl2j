package uk.fratcliffe.fl2j;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import uk.fratcliffe.fl2j.models.Embedded;

@FeignClient(url = "https://api.teleport.org/api", value = "teleport")
public interface TeleportClient {
    @GetMapping(value = "/cities?search={city}")
    public Embedded getCity(@PathVariable("city") String city);
}
