# Basics

- `Variables` are defined with `val` and `var`
- `Functions` are defined with the following syntax `fun <fun_name>(<args?>): <ReturnType> {}`
    ```
        fun main(args: Array<String>) {
        }
    ```
    
    ```
    fun isValidIdentifier(s: String): Boolean = 
       s.isNotEmpty() && s.matches("[A-Za-z_][a-zA-Z0-9_]*".toRegex())
    ```
    - return is mandatory in `kotlin` if function defined with `{}`.
    If function is defined with `=` then `return` should not present,
    these type of function are known as `expression body`

    - Functions can be defined in top level, member function and local functions.
    - Default arguments and named arguments are supported in Kotlin
    - Top level functions are called in java with `filename`.`functionName` (if `JvmName` annotation is not specified)
      - Example is in `ListExtensionsKtTest.java`
      - By default JVM byte code level all possible functions are not generated. `@JvmOverloads` defines all possible combinations of functions when default arguments are specified at byte code level
    
    - `Extension` functions can be defined in the following way 
        ```
           fun <A> List<A>.mkString(prefix: String = "", delimiter: String = "", postfix: String = "") = ...
        ```

- `Conditionals` 

    - `if & else` is expression in Kotlin
    - `when` is like java `switch` but powerful than `switch`. `break` not required
      ```
      when(color) {
        BLUE -> "cold"
        ORANGE -> "mild"
        RED -> "hot"
      }
      ```
      ```
      when(a) {
        0 -> "is zero"
        is Int -> "is int"
        is String -> "is string with length ${a.length}" // notice here smart cast
        else -> "NONE"
      }
      ```
      
- `Loops`: Kotlin have `while`, `do..while` and `for`
  - `while` and `do..while` are similar to `java`
  - `for` loops are different. Few examples are given here 
    ```
    for (i in (1..10).toList()) { print(i) }
    
    for ((index, element) in list.withIndex()) {
        print("($index -> $element) ")
    }
    
    
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    for ((key, value) in map) {
        print("($key, $value) ")
    }
    ```

- `Exceptions` are mandatory to catch (There are no checked exceptions)