package com.essalmi.tp_cassandra.repositories;

import com.essalmi.tp_cassandra.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface UserRepository extends CassandraRepository<User, UUID> {

}
