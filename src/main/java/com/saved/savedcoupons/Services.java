package com.saved.savedcoupons;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Services {
	@Autowired
	private Savedinterface s;
	public List<Saved> getSavedcoupons(){
		return s.findAll();
	}
	public Saved getSavedcoupons(int id){
        return s.findById(id).orElseThrow(()->new ResourceNotFoundException("The record with "+id+"is not found"));
    }

}
