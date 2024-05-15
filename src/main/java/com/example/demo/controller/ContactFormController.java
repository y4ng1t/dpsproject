package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ContactForm;
import com.example.demo.repository.contactFormRepository;

@RestController
public class ContactFormController {

    @Autowired
    private contactFormRepository ContactFormRepository;

    @PostMapping("/api/contact")
    public String handleContactFormSubmission(@RequestBody ContactForm contactForm) {
        ContactFormRepository.save(contactForm);
        return "Form submitted successfully!";
    }
}