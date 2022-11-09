package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactService;

@RestController
public class ContactController {
	@Autowired
	ContactService consrv;

	@GetMapping("contact/{userId}")
	public List<Contact> getContactsofUser(@PathVariable Long userId) {
		return consrv.getContactsofUsers(userId);
	}
	
}
