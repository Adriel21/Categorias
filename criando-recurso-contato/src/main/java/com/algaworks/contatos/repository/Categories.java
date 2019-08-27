package com.algaworks.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.contatos.model.Category;

public interface Categories extends JpaRepository<Category, Long> {

}
