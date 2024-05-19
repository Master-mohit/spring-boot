package coding.vala.dummy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {  // Class name should be capitalized as per Java conventions

    @RequestMapping("/m")  // Added leading slash for correct URL mapping
    public String myMethod() {  // Removed static modifier
        return "mohit nougrahiya";
    }

    @GetMapping("/process-form")  // Added leading slash for correct URL mapping
    public String getData(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 + num2;
        return "result = " + result;
    }
}
