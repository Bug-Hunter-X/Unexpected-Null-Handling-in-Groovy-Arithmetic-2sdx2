# Groovy Null Handling in Arithmetic Operations

This example demonstrates a common issue in Groovy when performing arithmetic operations with potentially null values. Groovy's dynamic typing allows for flexibility, but it can also lead to unexpected results if null values are not handled properly.

The `calculate` function in `bug.groovy` shows a basic addition operation. While it handles null values by returning 0, a more robust solution might be to throw an exception or use a different default value, depending on your needs.

The `bugSolution.groovy` file offers a more refined approach to improve the code's error handling and clarity.

## How to reproduce:
1. Clone this repository.
2. Run `bug.groovy` and observe the output for different inputs, including null values. 
3. Compare the output with the results from `bugSolution.groovy`

This example highlights the importance of defensive programming in Groovy to handle potential null pointer exceptions and ensure the reliability of your code.