package com.garage.garage.Client;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}


