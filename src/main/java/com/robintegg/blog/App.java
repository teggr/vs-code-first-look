package com.robintegg.blog;

/**
 * Hello world!
 *
 */
public class App 
{

    private final String name;

    App(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println( "Hello " + name +  " !" );
    }

    public static void main( String[] args )
    {
        App app = new App("Robin");
        app.sayHello();
    }
    
}
