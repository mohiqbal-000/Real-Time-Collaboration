package Controller;


import Model.User;
import Security.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User Register(@RequestBody User user){

        return userService.register();
    }

    @GetMapping("/login")

    public User login(@RequestBody User user){
        return userService.login();
    }
}
