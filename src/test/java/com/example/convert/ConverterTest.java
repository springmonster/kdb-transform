package com.example.convert;


import com.example.model.Model;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ConverterTest {

    @Test
    void createColumns() {
        // 生成100个Model
        for (int i = 0; i < 100; i++) {
            long startTime = System.currentTimeMillis();
            Converter.createColumns(Model.class);
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken: " + (endTime - startTime) + "ms\n");
        }
    }

    @Test
    void createRows() {
        List<Model> models = new ArrayList<>();
        Random random = new Random();
        // 生成100个Model的List
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                Model model = new Model(
                        "APPLE",
                        random.nextDouble() * 100,
                        new Timestamp(System.currentTimeMillis()),
                        "user1",
                        random.nextInt() * 100,
                        random.nextDouble() * 100,
                        random.nextDouble() * 100,
                        random.nextDouble() * 100);

                models.add(model);
            }
            // 生成100个Model的List
            long startTime = System.currentTimeMillis();
            Converter.createRows(models, Model.class);
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken: " + (endTime - startTime) + "ms\n");

            models.clear();
        }
    }
}
