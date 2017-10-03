package useful.controller;

import java.util.List;// imports List
import java.util.ArrayList;// imports ArrayList
import useful.model.Donut;

public class ListStringController
{
	private List<Donut> donutList; //This declares the list
	
	public ListStringController()
	{
		donutList = new ArrayList<Donut>();// This initializes the list
	}
	
		public void start() // allows you to start the program
		{
			Donut temp = new Donut();//makes temp instanse of donut / makes donut object
//			System.out.println(donutList);
			donutList.add(temp); // you can put temp here instead of new donut because of ^
		}
}
