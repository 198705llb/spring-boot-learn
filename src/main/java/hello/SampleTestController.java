package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleTestController {

    @RequestMapping("/Test")
    @ResponseBody
    String home() {
        return "Test!Hello World!";
    }
    
    @RequestMapping("/test")
    @ResponseBody
    String test(){
		return "Test!Hello World! test";
    	
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleTestController.class, args);
    }
}