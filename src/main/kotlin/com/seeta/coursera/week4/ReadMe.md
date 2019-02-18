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
  