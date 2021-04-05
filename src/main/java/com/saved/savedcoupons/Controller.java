package com.saved.savedcoupons;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class Controller {
    @Autowired
    private Services service;
    @CrossOrigin
    @GetMapping("/getsavedcoupons")
    public List<Saved> getSavedcoupons(){
        return service.getSavedcoupons();
    }
    @GetMapping("/getsavedcoupons/{id}")
    public Saved getCouponById(@PathVariable(value = "id") int id){
        RestTemplate rest= new RestTemplate();
        List<Coupon> coupons= Arrays.asList(
            return service.getCoupons()
        );
        coupons.stream().map(kk->{
            User user=rest.getForObject(url:"",User.class);
            Coupon coupon=rest.getForObject(url:"", Coupon.class);
            return new Saved(coupon.getId(),user.getName(),coupon.getCode(),coupon.getDate())
            
        })
        return service.getSavedcoupons(id);
    }
    
}
