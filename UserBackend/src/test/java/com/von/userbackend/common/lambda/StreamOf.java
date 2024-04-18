package com.von.userbackend.common.lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOf {

    @Test
    public void testSame(){
        int arr[] = { 1, 2, 3, 4, 5 };
        // --------- Using Arrays.stream() ---------
        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(str -> System.out.print(str + " "));
        // --------- Using Stream.of() ---------
        Stream<int[]> stream = Stream.of(arr);
        stream.forEach(str -> System.out.print(str + " "));
        //결과 : 1 2 3 4 5 [I@6dbb137d

    }

    @Test
    public void testDifferent(){
        // Creating an integer array
        int arr[] = { 1, 2, 3, 4, 5 };
        // --------- Using Arrays.stream() ---------
        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(str -> System.out.print(str + " "));
        // --------- Using Stream.of() ---------
        Stream<int[]> stream = Stream.of(arr);
        IntStream intStreamNew = stream.flatMapToInt(Arrays::stream);
        // Displaying elements in IntStream
        intStreamNew.forEach(str -> System.out.print(str + " "));
        //결과 : 1 2 3 4 5 1 2 3 4 5
    }
}
