package lendingapp.backend.loginWithGoogle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

@RestController
public class googleLoginController {


    @GetMapping("google")
    public String welcome() {
        return "Welcome to Google !!";
    }

    @GetMapping("/goolelogin")
    public Principal user(Principal principal) {
        System.out.println("username : " + principal.getName());
        return principal;
    }
}
