package com.example.model;

import com.example.annotation.Column;
import com.example.annotation.Table;

import java.sql.Timestamp;

@Table("model")
public record Model(
        @Column("name")
        String name,
        @Column("price")
        Double price,
        @Column("created_at")
        Timestamp timestamp,
        @Column("created_by")
        String createdBy,
        @Column("age")
        Integer age,
        @Column("x1")
        Double x1,
        @Column("x2")
        Double x2,
        @Column("x3")
        Double x3

) {

}
