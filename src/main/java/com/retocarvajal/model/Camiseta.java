package com.retocarvajal.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "camisetas")
public class Camiseta implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;


	private String nombre;
	private int precio;
	private int stock;
	private String informacion;

	@ManyToOne
	@JoinColumn(name = "id_wishlist")
	private WishList wishList;

	public Camiseta(String nombre, int precio, int stock, String informacion) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.informacion = informacion;

	}
}
