package com.example;

import com.example.model.Model;
import com.example.model.Model2;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import static com.example.convert.Converter.createColumns;
import static com.example.convert.Converter.createRows;

public class Main {

    public static void main(String[] args) {
        List<Model> models = List.of(
                new Model("APPLE", 102.0, new Timestamp(System.currentTimeMillis()), "user1", 1, 1.0, 2.0, 3.0),
                new Model("APPLE", 102.0, new Timestamp(System.currentTimeMillis()), "user1", 1, 1.0, 2.0, 3.0),
                new Model("APPLE", 102.0, new Timestamp(System.currentTimeMillis()), "user1", 1, 1.0, 2.0, 3.0),
                new Model("APPLE", 102.0, new Timestamp(System.currentTimeMillis()), "user1", 1, 1.0, 2.0, 3.0),
                new Model("APPLE", 102.0, new Timestamp(System.currentTimeMillis()), "user1", 1, 1.0, 2.0, 3.0),
                new Model("APPLE", 102.0, new Timestamp(System.currentTimeMillis()), "user1", 1, 1.0, 2.0, 3.0)
                );

        long startTime = System.currentTimeMillis();
        String[] columns = createColumns(Model.class);
        System.out.println(Arrays.toString(columns));
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
        System.out.println();

        startTime = System.currentTimeMillis();
        String[] columns2 = createColumns(Model2.class);
        System.out.println(Arrays.toString(columns2));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
        System.out.println();

        startTime = System.currentTimeMillis();
        String[] columns3 = createColumns(Model2.class);
        System.out.println(Arrays.toString(columns3));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
        System.out.println();

        startTime = System.currentTimeMillis();
        String[] columns4 = createColumns(Model.class);
        System.out.println(Arrays.toString(columns4));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
        System.out.println();

        startTime = System.currentTimeMillis();
        Object[] objects = createRows(models, Model.class);
        System.out.println(Arrays.deepToString(objects));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
        System.out.println();

        startTime = System.currentTimeMillis();
        Object[] objects1 = createRows(models, Model.class);
        System.out.println(Arrays.deepToString(objects1));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
        System.out.println();

        startTime = System.currentTimeMillis();
        Object[] objects2 = createRows(models, Model.class);
        System.out.println(Arrays.deepToString(objects2));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
        System.out.println();
    }
}
