package com.banking;

import java.util.function.LongConsumer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LongConsumer lt = (long l) -> System.out.print(l);
    }
}
