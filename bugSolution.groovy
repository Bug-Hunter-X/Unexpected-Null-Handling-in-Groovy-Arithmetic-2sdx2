```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    throw new IllegalArgumentException("Inputs cannot be null")
  }
  return a + b
}

println calculate(5, 3) // Output: 8
//println calculate(null, 3) // Throws IllegalArgumentException
//println calculate(5, null) // Throws IllegalArgumentException
//println calculate(null, null) // Throws IllegalArgumentException
```