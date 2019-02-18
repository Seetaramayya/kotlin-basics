# Week3

## Nullable Types
   Java did not handle `null` and it is history. Kotlin is tried level best to handle `null` well (But not as smooth as `scala`) 
   
 - `null` can not be assigned it to any type unless `?` is at the end of the type
 - if `null` check is done `kotlin compiler` does smart cast and then it can be used normal
 - if `null` check is not done then compiler gives error if actual methods of the type are called. 
   For example, 
   ```
     val name: String = null // gives compiler error
     
     val name: String? = "seeta" // Works fine
     val name: String? = null // Works fine
     
     name.length // compiler error
     name?.length // works fine. if name is null then result is null
     
     name?.length ?: 0 // ELVIS Operator: <leftHandWithSafeOperation> ?: Default Value 
   ```
   
## Common Collection Operations

 Check `CommonCollectionOperations` with inline documentation