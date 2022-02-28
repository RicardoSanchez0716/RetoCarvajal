package com.retocarvajal.rest;

import com.retocarvajal.model.WishList;
import com.retocarvajal.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URL;
import java.util.List;

@RestController
@RequestMapping("/wishlist/")
public class WishListRest{

    @Autowired
    private WishListService wishListService;

    @GetMapping
    private ResponseEntity<List<WishList>> getAllWishList (){
        return ResponseEntity.ok(wishListService.findAll());
    }



}
