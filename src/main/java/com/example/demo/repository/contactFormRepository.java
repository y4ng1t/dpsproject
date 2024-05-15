package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ContactForm;

@Repository
public interface contactFormRepository extends JpaRepository<ContactForm, Long> {
}
