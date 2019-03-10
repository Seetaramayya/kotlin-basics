# Week 4

### Properties

- Properties are nothing but like java getters and setters
  - `property` is `field` + `accessor` (from `get...` and `set...` needs to be called)
    ```
    class Contact(val name: String, var address: String)
    contact.name
    contact.address = "..."
    ```
  
  - `read-only property` is `field` + `getter`
  
    ```
    class Rectangle(val height: Int, val width: Int) {
    // What is the need of get() here why can not be just val
    // STRANGE THIS IS `val with get` calculates every time
    val isSquare: Boolean
        get() {
            return height == width
        }
    }
    ```
      
  - `mutable property` is `field` + `getter` + `setter`
      
  - Field is accessible from only inside accessors
    ```
    class StateLogger {
      var state = false
          private set(value) {
            println("state is changed $field -> $value")
            field = value
          }
    }
    ```

  - `property` can be defined in the `interface` (because it is just setter or getter)
    ```
    interface User {
        val nickname: String
    }
    
    class FacebookUser : User {
        override val nickname = "some user1"
    }
    
    class SubscribingUser : User {
        override val nickname: String
            get() {
                println("each time calculates")
                return "some user2"
            }
    }
    ```
      - open property can not be used in smart casts (compile time error)
  - Extension properties
    ```
    val String.lastIndex: Int get() = this.length - 1
    val String.indices: IntRange get() = 0..lastIndex
    ```
  - Lazy value are supported
  - `lateinit` are supported
    - can not be `val`
    - 
    
### OOP

- Either `interface` or `class` is inherited with `:`
- `constructors` are inline to class declaration. If there is a definition of that can go to `init` section
- `data` classes are like `case` classes in scala
- `sealed` classes are supported in kotlin
- `class deligation` is supported in kotlin. 
  ```
  interface A {
    fun a()
  }
  interface B {
    fun b()
  }
  
  // no need to call those methods explicitly
  class Seeta(a: A, b: B) : A by a, B by b {
  }
  ```
  
- `companion` is supported in kotlin
- `object expression` is possible. creating anonymous classes. I could not see real use case of this unless design is wrong
- `@JvmStatic` annotation is needs to put to access from java classes
- `const` is to declare constants. Why not `val`. I really did not like this
- `operator` overloading is possible in kotlin for fixed list of operators