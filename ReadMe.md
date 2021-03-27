# Actions class to perform actions like moveover 
```java
    Actions action = new Actions(driver)
    
    // Example mouse over 
        actions.moveToElement(services)
        .pause(1000)
        .moveToElement(maps)
        .pause(1000)
        .moveToElement(destination)
        .pause(1000)
        .moveToElement(asia)
        .pause(1000)
        .click()
        .build()
        .perform();

  // Example - Double click
        actions.moveToElement(aside).pause(4000).doubleClick().build().perform();
```

# TEST SYNCHRONIZATION OR WAITS
