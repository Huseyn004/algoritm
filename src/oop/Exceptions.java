package oop;
import oop.exceptions.NotAllowedException;
import oop.exceptions.UserNotFoundException;
import oop.model.User;
import oop.service.UserService;

public class Exceptions {
    public static void main(String[] args) {
        UserService service = new UserService();

        service.addUser(new User("Hüseyn"));
        service.addUser(new User("Nihad"));
        service.addUser(new User("Xəyyam"));
        service.addUser(new User("John"));

        searchUser(service, "John");
        searchUser(service, "İlqar");
        searchUser(service, "Hüseyn");
    }

    public static void searchUser(UserService service, String name) {
        try {
            System.out.println("Searching for: " + name);
            User user = service.getUserByName(name);
            System.out.println("User found: " + user);
        } catch (NotAllowedException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (UserNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Search finished.\n");
        }
    }
}