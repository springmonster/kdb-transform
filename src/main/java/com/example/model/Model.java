package com.example.model;

import java.sql.Timestamp;

public record Model(String name,
                    Double price,
                    Timestamp timestamp,
                    String createdBy) {
}
