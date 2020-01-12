/* Aparna*/
package com.cts.javaS;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class Application extends Products {

		private static final int ProductStock = 0;
		private static final String ProductDescription = null;

		public static  void main(String[] args) {
			
			Products p = new Products();
			
			Scanner sc = new Scanner(System.in);
			while(true)
			{
				
				System.out.println("1)AddProduct");
				System.out.println("2) FindProductById");
				System.out.println("3) GetAllProductData");
				System.out.println("\nEnter your choice:");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					
					System.out.println("\nEnter Product Name:");
					
					String ProductName= sc.nextLine();
				
					System.out.println("Enter ProductDescription:");
					String Pid= sc.nextLine();
					
					System.out.println("Enter Price:");
					  float Price =sc.nextFloat();
					 
					  System.out.println("Enter ProductStock"); 
					  int NoOfProducts =sc.nextInt();
					  
					  System.out.println(" --------Categories-------------");
					  System.out.println("1)Electronics");
						System.out.println("Cloths");
						System.out.println("Grosseries");
						List<String> al=new ArrayList<String>(); 
						al.add("1.Electronics");
						al.add("2.Cloths");
						al.add("3.Grosseries");
						 System.out.println("Select Category:");
						int choice1 = sc.nextInt();
						
						String CategoryName=al.get(choice1);
						/* switch(choice1)
							 {
							 case 1:
								String CategoryName13=al.get(choice1);
								 break;
							 case 2:
								 String CategoryName12=al.get(choice1);
								 break;
							 case 3:
								 String CategoryNaming=al.get(choice1);
								 break;
							 default:
								 System.out.print("not in category");
							 }
						 */
								 int productId=0;
					 Products p2= (Products) new Products(productId,ProductName,ProductDescription,Price,ProductStock,CategoryName);
					    p.AddProduct(p1,p2,p3);
					break;
				case 2:
					p.FindProductById();
					break;
				case 3:
					
					p.GetAllProductData();
					break;
				default:
				     System.out.println("not valid");
					
				}
				//sc.close();
			}
		}

	}



