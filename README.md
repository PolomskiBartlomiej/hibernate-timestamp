# hibernate-timestamp

* `@CreationTimestamp` - The property value will be set to the current VM date exactly once 
when saving the owning entity for the first time.
* `@UpdateTimestamp` - The property value will be set to the current VM date whenever the 
owning entity is updated.

Java 8 Date API is fully supported:
   * LocalDate
   * LocalDateTime
   * LocalTime
   
# project description
In `AppRunner` we add customer and check `creationTimestamp`, then we modify pre-existing 
customer and check `updateTimestamp`.