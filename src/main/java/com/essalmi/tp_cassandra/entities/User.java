package com.essalmi.tp_cassandra.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table("utilisateurs")
public class User {
    @PrimaryKey
    private UUID id;
    private String name;
    private int age;
    private String email;
}
