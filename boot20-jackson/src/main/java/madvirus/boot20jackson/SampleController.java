package madvirus.boot20jackson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/now")
    public Now time() {
        return new Now();
    }
}
