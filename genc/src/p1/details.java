package p1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class details {

	public static String updatePrices(LinkedHashMap<String,String> productDetails,LinkedHashMap<String,Integer> salesDetails,int rate,String category)
	{
//   Product Details
		for(Entry<String,String> e:productDetails.entrySet())
		   {
			   if(e.getValue().contentEquals(category))
			   {
//	 Sales Details 				   
				   for(Entry<String,Integer> x:salesDetails.entrySet())
				  
				   {
					   if(x.getKey().contentEquals(e.getKey()))
					   {
						   int value=x.getValue()*rate/100+x.getValue();
						   salesDetails.replace(x.getKey(), value);						   
					   }
				   }
			   }
		   }
		   String s=new String();
 //	  Output Formatting
		   for(Entry<String,Integer> x:salesDetails.entrySet())
		   {
			   s+="'"+x.getKey()+"'"+":"+x.getValue()+",";
		   }
		return s;
	}
	
//	  Main Function	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//	  Getting input 	
		System.out.println("Enter product name and category in format 'ProductName:Category'");
		String productDetails=input.nextLine();
		String arrayOfDetails [] =productDetails.split("[:,]");
		int len=arrayOfDetails.length;
//	 HASHMAP DECLARATION		
		LinkedHashMap<String,String> map1 = new LinkedHashMap<String,String>();
		LinkedHashMap<String,Integer> map2 = new LinkedHashMap<String,Integer>();
	
// 	 PASSING VALUES TO MAP		
		for(int i=0;i<len;i=i+2)
			{
		
				map1.put(arrayOfDetails[i],arrayOfDetails[i+1]);
			
			}
		
		System.out.println("Enter product name and price in format 'ProductName:Price'");
		String priceDetails=input.nextLine();
		String arrayOfPrice[]=priceDetails.split("[:,]");
		int len1=arrayOfPrice.length;

		
	
		for(int i=0;i<len1;i=i+2)
			{
		
				map2.put(arrayOfPrice[i],Integer.parseInt(arrayOfPrice[i+1]));
			
			
			}
		System.out.println("Enter the hike rate");
		int rate =input.nextInt();
		input.nextLine();
		System.out.println("Enter the Category");
		String category=input.nextLine();
		
		String output=updatePrices(map1,map2,rate,category);
		System.out.println(output);
		//{"lux":"soap","colage":"paste","pears":"soap","sony":"electronics","samsung":"electronics"}
		//{"lux":1000,"colage":500,"pears":2000,"sony":100,"samsung",600
	
		
	}
}