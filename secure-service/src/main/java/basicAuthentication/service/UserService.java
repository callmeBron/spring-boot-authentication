package basicAuthentication.service;

import basicAuthentication.model.UserObjectModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<UserObjectModel> getUsers() {
        List<UserObjectModel> users = List.of(
                new UserObjectModel(
                        "Jack",
                        "jack.handle@gmail.com",
                        "Discovery bank"
                ),
                new UserObjectModel(
                        "MindieShaka",
                        "shakaMindies09@gmail.com",
                        "First National Bank"
                )
        );
        return users;
    }
}
