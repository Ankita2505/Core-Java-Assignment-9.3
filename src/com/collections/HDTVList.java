package com.collections; 
/*
 * Display HDTV objects in sorted order of size (Use Comparator)
 */
//Importing Java Utility packages for Collection, Comparator and array list
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
class HDTV 
{   
	// Declaring 2 Private Variable
	private int size;
	private String brand_name;
 
	public HDTV(int size, String brand_name) //Parameterized Constructor for HDTV
	{
		this.size = size;
		this.brand_name = brand_name;
	}
	//Getter and setter methods for Size private variable
	public int getSize() 
	{
		return size;
	}
 
	public void setSize(int size) 
	{
		this.size = size;
	}
 //Getter and setter methods  for Brand_name private variable
	public String getBrand_name()
	{
		return brand_name;
	}
 
	public void setBrand_name(String brand_name)
	{
		this.brand_name = brand_name;
	}
}
 //SizeComparator Class looks for Comparing HDTV objects on basis on Size
class SizeComparator implements Comparator<HDTV> 
{
	@Override
	//defining compare method to compare HDTV objects on basis of Size
	public int compare(HDTV tv1, HDTV tv2) 
	{
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();
 
		if (tv1Size > tv2Size) 
		{
			return 1;
		} 
		else if (tv1Size < tv2Size) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
}
 
public class HDTVList 
{
	public static void main(String[] args) //Start of main Class
	{
		//Creating 3 objects of HDTV
		HDTV tv1 = new HDTV(45, "Samsung");
		HDTV tv2 = new HDTV(34, "Sony");
		HDTV tv3 = new HDTV(42, "Panasonic");
 
		ArrayList<HDTV> al = new ArrayList<HDTV>();//Creating ArrayList for collection
		//Adding objects of HDTV to objects of ArrayList
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
		//Using collections sort method to sort HDTV objects according to their size
		Collections.sort(al, new SizeComparator());
		System.out.println("BRAND NAME"+ "     " + "SIZE" );
		for (HDTV a : al) 
		{
			System.out.println(a.getBrand_name()+ "        " + a.getSize());//Displaying HDTV objects in sorted order of size
		}
	}//Close of Main Class
}

