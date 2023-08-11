package com.example.model;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Model> models = List.of(
                new Model("IBM", 101.0, new Timestamp(System.currentTimeMillis()), "user1"),
                new Model("APPLE", 102.0, new Timestamp(System.currentTimeMillis()), "user2")
        );

        create(models);
    }

    public static Object[] create(List<?> list) {
        int size = list.size();

        List<Object> result = new ArrayList<>();

        Field[] fields = FieldUtils.getAllFields(list.get(0).getClass());

        for (int j = 0; j < fields.length; j++) {
            Class type = fields[j].getType();
            Object array = ArrayUtils.newInstance(type, size);
            result.add(array);
        }

        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            Field[] allFields = FieldUtils.getAllFields(o.getClass());

            for (int i1 = 0; i1 < allFields.length; i1++) {
                allFields[i1].setAccessible(true);
                try {
                    Object[] o1 = (Object[]) result.get(i1);
                    o1[i] = allFields[i1].get(o);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        Object[] objects = new Object[result.size()];

        for (int i = 0; i < result.size(); i++) {
            objects[i] = result.get(i);
        }

        return objects;
    }
}
