package com.app.stylehub.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import lombok.*;


public class CartItemDTO {

	@JsonProperty(access = Access.READ_ONLY)
	private Long cartItemId;
    private int quantity;
    private ProductDTO product;
    
    public CartItemDTO() {
    	
    }

	public CartItemDTO(Long cartItemId, int quantity, ProductDTO product) {
		super();
		this.cartItemId = cartItemId;
		this.quantity = quantity;
		this.product = product;
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

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}
    
    
}
