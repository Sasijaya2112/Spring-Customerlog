package com.customerlogs.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.customerlogs.entity.Customerlogs;

//Remove @RepositoryRestResource below to disable auto REST api:
// @RepositoryRestResource
public interface repository extends JpaRepository<Customerlogs, String>{

    @Query(value = "SELECT * FROM customerlogs", nativeQuery = true)
    List<Customerlogs> display(String name);

    @Query(value = "SELECT * FROM customerlogs WHERE date=?1", nativeQuery = true)
    List<Customerlogs> getByDate(String name);

    @Query(value = "SELECT * FROM customerlogs", nativeQuery = true)
    List<Customerlogs> getAllLog();
}