Feature: As a professor, I want to modify a course.

Scenario: As a professor, I want to modify a course's information so that it is correct.
  Given a course with name "Software Enginearing"
  When the professor modifies the name of the course to "Software Engineering"
  Then the name of the course is "Software Engineering"
