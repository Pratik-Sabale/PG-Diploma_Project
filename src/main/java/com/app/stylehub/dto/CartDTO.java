package com.app.stylehub.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class CartDTO {

	@JsonProperty(access = Access.READ_ONLY)
	private Long cartId;
	private List<CartItemDTO> items;
	private Double totalPrice = 0.0;
	
	public CartDTO() {
		
	}
	
	public CartDTO(Long cartId, List<CartItemDTO> items, Double totalPrice) {
		super();
		this.cartId = cartId;
		this.items = items;
		this.totalPrice = totalPrice;
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public List<CartItemDTO> getItems() {
		return items;
	}

	public void setItems(List<CartItemDTO> items) {
		this.items = items;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
}
