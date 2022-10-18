package com.RLL.repositories;

import org.springframework.data.repository.CrudRepository;

import com.RLL.models.book;

public interface bookRepo extends CrudRepository<book, Integer>{

}