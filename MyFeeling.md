# Kotlin / Java ++ / Scala --

My first experience with Kotlin was not nice, reasoning are

- Almost `NullPointerException` is avoided, but sometimes kotlin can not avoid it
  - More interestingly in some cases `NullPointerException` is translated it to `IllegalStateException`. 
  Why one is better than other? Both happens at runtime not at compile time  
- Hurry we have `val` but not really `val` they are evaluated every call. Then why are you calling `val` why not `fun`
- val properties can return different values on each invocation (strange). Its really stupid in my view
- Because `val` are not real `val` we introduce new concept called `const`
- We have smart casting, in most of the cases it is smart (try do n JVM limitations :D). Then why smart :D
- Fake `patter matching` 
- Not all functions can be store in variables, only lambdas can be stored in variables. It sounds very weired to me
- Some times `return` can be avoided
- Here comes most ugly thing, labeled return statements (`goto` statement)
    ```
    list.flatMap l@ {
        if (it == 0) return@l listOf<Int>()
        listOf(it, it)
    }
    ```
    or 
    
    ```
    list.flatMap {
        if (it == 0) return@flatMap listOf<Int>()
        listOf(it, it)
    }
    ```
- anonymous functions to overcome return issue
    ```
    list.flatMap(fun (e): List<Int> {
        if (e ==0) return listOf()
        return (e, e)
    })
    ```



Conclusion: If I need to rename Kotlin, it would be __SCALA--__ or __Java++__