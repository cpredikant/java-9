package de.cpredikant.java9.streams;


import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFeatures {

    public void betterIteration(){
        IntStream.iterate(1, i -> i < 10, i -> i + 1).forEach(System.out::println);
        System.out.println("----");
        IntStream.iterate(1, i -> i < 10, i -> i + 1).takeWhile(i-> i < 5).forEach(System.out::println);
        System.out.println("----");
        IntStream.iterate(1, i -> i < 10, i -> i + 1).dropWhile(i-> i < 5).forEach(System.out::println);
    }

    public void optionalStreams(){
        Stream<Integer> s = Optional.of(1).stream();
        s.forEach((i)-> System.out.println(i));
    }
}
