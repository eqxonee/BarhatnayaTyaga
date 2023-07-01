package com.example.barhatnayatyaga.repository;

import com.example.barhatnayatyaga.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Client, Integer> {
    Optional<Client> findClientByName(String name);

}