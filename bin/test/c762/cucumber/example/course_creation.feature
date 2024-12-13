Feature: As a professor, I want to create a course.

Scenario: As a professor, I want to create a course with a name.
  Given a professor with name "Prof. X" and email "prof@xmen.com"
  When the professor creates a course with name "Introduction to super-human abilities"
  Then a course exists with name "Introduction to super-human abilities"
