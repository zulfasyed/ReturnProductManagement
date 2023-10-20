package com.Lulu.Project_.ReturnProductsManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lulu.Project_.ReturnProductsManagement.entity.DamagedProducts;
import com.Lulu.Project_.ReturnProductsManagement.repo.RepoRPM;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/DP")
public class ControllerRPM {
	@Autowired

	RepoRPM reporpm;

	@GetMapping("/getproduct")

	public List<DamagedProducts> getPurchase() {

	return reporpm.findAll();

	}

	@PostMapping("/addproduct")

	public DamagedProducts createPurchase(@RequestBody DamagedProducts dp) {

	return reporpm.save(dp);

	}

	@DeleteMapping("/delproduct/{id}")

	public void deletePurchase(@PathVariable int id) {

		reporpm.deleteById(id);

	}
	
	@PutMapping("/updateproduct/{id}")
	public DamagedProducts updatePurchase(@PathVariable int id, @RequestBody DamagedProducts updatedProduct) {
	    Optional<DamagedProducts> existingProduct = reporpm.findById(id);

	    if (existingProduct.isPresent()) {
	    	DamagedProducts productToUpdate = existingProduct.get();
	        
	        // Update the fields of the existing product with the new data
	        if (updatedProduct.getProductname() != null) {
	            productToUpdate.setProductname(updatedProduct.getProductname());
	        }
	        if (updatedProduct.getCustomername() != null) {
	            productToUpdate.setCustomername(updatedProduct.getCustomername());
	        }
	        if (updatedProduct.getReasontoreturn() != null) {
	            productToUpdate.setReasontoreturn(updatedProduct.getReasontoreturn());
	        }

	        
	        return reporpm.save(productToUpdate);
	    } else {
	        
	        throw new EntityNotFoundException("Product with ID " + id + " not found");
	    }
	}

}
