package com.alten.ecommerce.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor*/
@Entity
@Table(name = "Produit")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Variables
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String code;
    private String name;
    private String description;
    private String image;
    private String category;
    private double price;
    private int quantity;
    private String internalReference;
    private int shellId;
    @Enumerated(EnumType.STRING)
    private InventoryStatus inventoryStatus;
    private int rating;
    private int createdAt;
    private int updatedAt;
    /**
     * 
     */
    public enum InventoryStatus {
        INSTOCK,
        LOWSTOCK,
        OUTOFSTOCK
    }
    /**
     * Getters & Setters
     * @return
     */
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getInternalReference() {
		return internalReference;
	}
	public void setInternalReference(String internalReference) {
		this.internalReference = internalReference;
	}
	public int getShellId() {
		return shellId;
	}
	public void setShellId(int shellId) {
		this.shellId = shellId;
	}
	public InventoryStatus getInventoryStatus() {
		return inventoryStatus;
	}
	public void setInventoryStatus(InventoryStatus inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(int createdAt) {
		this.createdAt = createdAt;
	}
	public int getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(int updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Long getId() {
		return id;
	}
	/**
	 * Constructor
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
