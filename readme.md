> ### All data structures implementations
>
> For a list of all the data structures I have implemented, click [here](https://gist.github.com/contactsunny/4a97886c7da57461efa8cd2538a49dbc).

---

# Simple Stack Implementation using LinkedList in Java

This is a very simple example of a stack implementation in Java. This example is uses a custom LinkedList implementation internally to maintain
the stack elements. You can also implement the ```Collection<E>``` interface and override all the methods to introduce more custom
functionality.

# Use of the generic class ```T```

If you check the ```Stack``` class, I'm taking the generic class ```T``` as the type of stack elements. This is so that during
runtime, we can have a string stack or integer stack, or a stack of a custom class as well. ```T``` is a generic class in Java,
the type of which can be decided in runtime.

You can see this in action in the ```App.java``` class, where I have used the same ```Stack``` to create a stack of strings
and a class of integers. This comes in pretty handy.

# Running the project

Once you clone this repo, ```cd``` into the project root directory and run the following command to compile and build this maven project:

```shell script
mvn clean install
```

Once you run this command, Maven will build the project and keep it in the ```/target``` directory in the project root directory.
You can run the program using the command below:

```shell script
java -jar target/StackImplementationWithLinkedList-1.0-SNAPSHOT.jar
```