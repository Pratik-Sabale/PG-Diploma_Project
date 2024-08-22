package com.app.stylehub.entities;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "cart_items")
public class CartItem {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long cartItemId;

    private int quantity;
    
    @Column(name = "product_price")
	private double productPrice;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
    
    public CartItem() {
		
	}

	public CartItem(Long cartItemId, int quantity, double productPrice, Product product, Cart cart) {
		super();
		this.cartItemId = cartItemId;
		this.quantity = quantity;
		this.productPrice = productPrice;
		this.product = product;
		this.cart = cart;
	}

	public Long getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(Long cartItemId) {
		this.cartItemId = cartItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
    
    
}

