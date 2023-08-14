package com.example.model;

import com.example.annotation.Column;
import com.example.annotation.Table;

import java.sql.Timestamp;

@Table("model2")
public record Model2(
        @Column("name")
        String name,
        @Column("price")
        Double price,
        @Column("created_at")
        Timestamp timestamp,
        @Column("created_by")
        String createdBy,
        @Column("age")
        int age) {
}
