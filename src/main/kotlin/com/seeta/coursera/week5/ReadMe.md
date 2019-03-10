# Week 5

- inline functions are direct substitute where ever they are used for performance reasons (this how any function should be)
- Collections functions such as `map`, `filter` marked as inline creates new collection created eagerly, if you want to execute it lazyly then you need to use `sequences` 
- Lambda with receiver is noting but lambda extension
  
  For example, 
  ```
     inline fun <T, R> with(receiver: T, block: T.() -> R): R = receiver.block()
  ```
  
- Useful library functions

  ```
  inline fun <T, R> with(receiver: T, block: T.() -> R): R = receiver.block()
  inline fun <T, R> T.run(block: T.() -> R): R = block()
  inline fun <T, R> T.let(block: (T) -> R): R = block(this)
  inline fun <T> T.apply(block: T.() -> Unit): T { block(); return this }
  inline fun <T> T.also(block: (T) -> Unit): T { block(this); return this }
  ```