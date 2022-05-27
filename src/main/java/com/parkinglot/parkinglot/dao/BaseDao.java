package com.parkinglot.parkinglot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
public interface BaseDao<T> extends JpaRepository<T, Long> {
}
