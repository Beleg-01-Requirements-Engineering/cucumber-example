package c762.cucumber.example;

public class Professor {

    private String name;
    private String email;

    public Professor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
