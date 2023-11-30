@tag
Feature: Calculator2

  Scenario: sqrt(a/b) normal
    Given Two input values 8 and 2
    When I calculate the sqrt(a/b)
    Then I expect the result to be 2

  Scenario Outline: sqrt(a/b)
    Given Two input values <a> and <b>
    When I calculate the sqrt(a/b)
    Then I expect the result to be <result>

    Examples:
      | a     | b     | result |
      | 4     | 1     | 2      |
      | 36    | 4     | 3  	   |
      | -90   | -10   | 3	   |
      | -40   | 0     | Division by zero is undefined  |
      | -90   | 9     | Sqrt can not applied on negative number	   |