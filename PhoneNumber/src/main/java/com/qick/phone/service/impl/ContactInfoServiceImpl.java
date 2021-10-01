package com.qick.phone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qick.phone.model.ContactInfo;
import com.qick.phone.service.ContactInfoService;
import com.qick.phone.database.ContactDB;

@Service
public class ContactInfoServiceImpl implements ContactInfoService {
	@Autowired
	private ContactDB contactDB;
	
	@Override
	public List<ContactInfo> getALLContactInfo() {
		return contactDB.getALLContactInfo();
	}
	
	@Override
	public ContactInfo getContactInfo (String cName) {
		return contactDB.getContactInfo(cName);
	}
	
	@Override
	public boolean insertContact(ContactInfo cInsert) {
		return contactDB.insertContact(cInsert);
	}

	@Override
	public boolean updateContact(ContactInfo cUpdate) {
		return contactDB.updateContact(cUpdate);		
	}
	
	@Override
	public boolean deleteContact(String cDelete) {
		return contactDB.deleteContact(cDelete);
	}
	
	
}
