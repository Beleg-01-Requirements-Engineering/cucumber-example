package c762.cucumber.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private Professor professor;
    private Course course;

    @Given("a professor with name {string} and email {string}")
    public void a_professor_with_name_and_email(String name, String email) {
        professor = new Professor(name, email);
    }

    @When("the professor creates a course with name {string}")
    public void the_professor_creates_an_account_with_name(String name) {
        course = new Course(name);
    }

    @Then("a course exists with name {string}")
    public void a_course_exists_with_name(String name) {
        assertEquals(name, course.getName());
    }
}
