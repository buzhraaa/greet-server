import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingApplication {

    @GetMapping("/greet")
    public String greet() {
        String myName = "Bushra"; // Replace "YourName" with your actual name
        return "Hello " + myName;
    }
}

