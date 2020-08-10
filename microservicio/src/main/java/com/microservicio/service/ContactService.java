package com.microservicio.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.microservicio.dto.ContactDto;

@Service
public interface ContactService {
	public List<ContactDto> getContact();
	
	public ContactDto findById(String id);

	public void save(ContactDto contact);

	public void delete(ContactDto contact);

	
}


