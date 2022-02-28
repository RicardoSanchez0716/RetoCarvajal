import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CamisetaService } from './services/camisetas/camiseta.service';
import { WishlistService } from './services/wishlists/wishlist.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  camisetaForm!: FormGroup;


  constructor(
    public fb: FormBuilder,
    public camisetaService: CamisetaService,
    public wishlistService: WishlistService

  ) {

  }
  ngOnInit(): void {

    this.camisetaForm = this.fb.group({
      nombre: ['', Validators.required],
      precio: ['', Validators.required],
      stock: ['', Validators.required],
      informacion: ['', Validators.required],
    })
  }

  guardar(): void {

  }

}
