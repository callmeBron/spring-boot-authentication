package basicAuthentication.controller;


import basicAuthentication.model.UserObjectModel;
import basicAuthentication.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// to be moved to independent model class
import java.util.List;

@RestController
@RequestMapping("/api/v1/paymentsPortal/users")
public class basicAuthenticationController {
    private final UserService userService;

    public basicAuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserObjectModel>> fetchUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }
}
