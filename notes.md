# Hello, Java

The simplest program one writes when starting to learn a programming language is called Hello World. Most modern programming languages are designed to be super simple, intuitive, like reading english. For those coming from languages like Python or JavaScript the Java syntax will likely appear ceremonial, verbose, confusing

Look, this code snippet is the "Hello, World!" program in Java:

```java
// Hello.java
class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

I guess there's a good reason for it, so let's try to break it down. 

To start, it's worth mentioning the Java language is designed to support Object Oriented Programming; as a consequence, the primary entry point for our Java Programs, this class with a classname that often matches our file name. 

