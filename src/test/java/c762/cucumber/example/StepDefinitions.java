package c762.cucumber.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private Course course;

    @Given("a course with name {string}")
    public void a_course_with_name(String courseName) {
        course = new Course(courseName);
    }

    @When("the professor modifies the name of the course to {string}")
    public void the_professor_modifies_the_name_of_the_course_to(
        String newName
    ) {
        course.setName(newName);
    }

    @Then("the name of the course is {string}")
    public void the_name_of_the_course_is(String name) {
        assertEquals(name, course.getName());
    }
}
