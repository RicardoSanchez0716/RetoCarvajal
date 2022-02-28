package com.retocarvajal.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "wishlist")
public class WishList implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

}
