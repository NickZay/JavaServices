package ru.nickzay.dataservice.count;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class CountController {
    private final CountService countService;

    @GetMapping("/getCountFor")
    public CountDto getCountFor(@RequestParam String name) {
        return countService.getCountFor(name);
    }
}
