package com.jagan.simplewebapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jagan.simplewebapp.models.Products;
@Service
public class ProductServices {

    private List<Products> list = new ArrayList<Products>();

    // Constructor to initialize the list of products
    public ProductServices() {
        list.add(new Products(1, "apple", 10000));
        list.add(new Products(2, "android", 20000));
        list.add(new Products(3, "pixel", 20000));
        list.add(new Products(4, "OnePlus", 30000));
        list.add(new Products(5, "nokia", 30000));
    }

    // Method to get the list of products
    public List<Products> getProducts() {
        return list;
    }

    public Products getProductById(int prodId) {
        for (Products p : list) {
            if (p.getId() == prodId) {  // Assuming `getId()` is the method to get the product ID
                return p;
            }
        }
		return null;
      
    }
    public void addproduct(Products prod) {
    	list.add(prod);
    }

	public void updateproduct(Products prod) {
		int index =0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==prod.getId()) {
				index=i;
			 list.set(index, prod);
			}
		}
	}

	public void deleteproduct(int  prod) {
		int index =0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==prod) {
				index=i;
			 list.remove(index);
			}
		}
	}
	}


