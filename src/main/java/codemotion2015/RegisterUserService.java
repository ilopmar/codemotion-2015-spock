package codemotion2015;

public class RegisterUserService {

    private NotificationService notificationService;

    public RegisterUserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    void registerUser(String name, String lastName) {
        Person person = new Person(name, lastName);

        notificationService.sendNotification(person, "User created");
    }
}
