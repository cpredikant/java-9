package de.cpredikant.java9.streams;


import java.util.stream.IntStream;

public class StreamFeatures {

    public void betterIteration(){
        IntStream.iterate(1, i -> i < 10, i -> i + 1).forEach(System.out::println);
    }
}
