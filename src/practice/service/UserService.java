package practice.service;
import java.util.ArrayList;
import java.util.List;
import practice.exceptions.NotAllowedException;
import practice.exceptions.UserNotFoundException;
import practice.model.User;

public class UserService {
    private List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public User getUserByName(String name) throws NotAllowedException {
        if ("John".equalsIgnoreCase(name)) {
            throw new NotAllowedException("John adında istifadəçiyə icazə verilmir!");
        }

        for (User user : userList) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }

        throw new UserNotFoundException(name + " adlı istifadəçi tapılmadı.");
    }
}