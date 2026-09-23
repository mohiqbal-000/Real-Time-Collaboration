package Controller;


import Model.User;
import Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user){

        return userService.register(user);
    }

    @PostMapping("/login")

    public User login(@RequestBody User user){

        return userService.login(user);
    }
    @GetMapping("/{id}")

    public User getUserById(@PathVariable UUID id){
        return userService.getUserById(id);
    }



}
