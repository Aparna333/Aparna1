/*Aparna*/
package com.cts.javaS;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;
	//import java.util.*;

public class Products {
		 
		private int ProductId;
		private String ProductName;
		private String ProductDescription;
		private float Price;
		private int ProductStock;
		private String CategoryName;
		public Products(long l, String productName, String productDescription, float Price,
				long m,String CategoryName) {
			super();
			this.ProductId = (int) l;
			this.ProductName = productName;
			this.ProductDescription = productDescription;
			this.Price = Price;
			this.ProductStock = (int) m;
			this.CategoryName = CategoryName;
		}
		
		Random r = new Random();
		List<Products> ProductList=new ArrayList();
		private Map<Long, Products> productsByID = new HashMap();
		private Map<String, Products> productsByCategory = new HashMap();
		
		static Products p1 = new Products(1L,"TV","Entertinement",10000F,250L,"This is best TV!");
	    static Products p2 = new Products(2L,"Computer","Technology",20000F,350L,"My Computer name Hp and SONY ViVo!");
	    static Products p3 = new Products(3L,"DeskTopComputer","Technology",15000F,150L,"My Desktop Computer name Accer and SONY ViVo!");

	    //Assign the objects into the map by ids
	    FindProductById.put(1L, p1);
	    FindProductById.put(2L, p2);
	    FindProductById.put(3L, p3);

	    //Assign the objects into the map by category
	    productsByCategory.put(p1.getCategory(), p1);
	    productsByCategory.put(p2.getCategory(), p2);
	    productsByCategory.put(p3.getCategory(), p3);
		//HashMap<Product, String> map = new HashMap<Product, String>(); 
		public Products()
		{
			
		}
		public int getProductId() {
			return ProductId;
		}
		public void setProductId(int productId) {
			int productId1 = r.nextInt(10000);
			ProductId = productId1;
		}
		public String getProductName() {
			return ProductName;
		}
		public void setProductName(String productName) {
			ProductName = productName;
		}
		public String getProductDescription() {
			return ProductDescription;
		}
		public void setProductDescription(String productDescription) {
			ProductDescription = productDescription;
		}
		public float getProductPrice() {
			return Price;
		}
		public void setProductPrice(float productPrice) {
			Price = productPrice;
		}
		public int getProductStock() {
			return ProductStock;
		}
		public void setProductStock(int productStock) {
			ProductStock = productStock;
		}
		public void AddProduct(Products st, Products p22, Products p32) {
			ProductList.add(st);
			
			// TODO Auto-generated method stub
			
		}
		public void FindProductById() {
			// TODO Auto-generated method stub
			
		}
		public void GetAllProductData() {
			//Stream<Product> st=ProductList.stream();
			 ListIterator<Products> itr=ProductList.listIterator();
			//st.forEach(System.out::println);
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
		}
		public String getCategoryName() {
			return CategoryName;
		}
		public void setCategoryName(String categoryName) {
			CategoryName = categoryName;
		}
		@Override
		public String toString() {
			return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductDescription="
					+ ProductDescription + ", Price=" + Price + ", ProductStock=" + ProductStock
					+ ", CategoryName=" + CategoryName + "]";
		}
		
	}



