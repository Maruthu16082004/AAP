package com.admission.university.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admission.university.entity.entity;
    public interface repo extends JpaRepository<entity,String>{

    }