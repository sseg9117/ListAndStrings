package useful.controller;

import java.util.List;// imports List
import java.util.ArrayList;// imports ArrayList
import useful.model.Donut;
import useful.view.PopupDisplay;


public class ListController
{
	private List<Donut> donutList; //This declares the list
	private PopupDisplay display;
	
	public ListController()
	{
		donutList = new ArrayList<Donut>();// This initializes the list
		display = new PopupDisplay();
	}
	
		public void start() // allows you to start the program
		{
			Donut temp = new Donut();//makes temp instanse of donut / makes donut object
//			System.out.println(donutList);
			donutList.add(temp); // you can put temp here instead of new donut because of ^
			fillTheList();
//			showTheList();
			changeTheList();
			practiceWithList();
			
		}
		
		private void showTheList()
		{
			String favorite = "Mapel with coffee";
			
			for (int index = 0; index < donutList.size(); index += 1)
			{
				String currentFlavor = donutList.get(index).getFlavor();//same as
				
				Donut currentDonut = donutList.get(index);// this and 
				String flavor = currentDonut.getFlavor();//this
				
				if (currentFlavor.equals(favorite))
				{
					for (int woop = 0; woop < 5; woop += 1)
					{
						display.displayText("The best flavor ever!!!!!");
								
					}
				}
				for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
				{
					display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex + 1));
				}
				display.displayText(donutList.get(index).toString());
				
			}
		}
		

		
		private void fillTheList()
		{
			Donut jellyFilled = new Donut("Jelly Filled");
			Donut glaze = new Donut("glazed donut");
		    Donut  baconFilled = new Donut("Bacon Filled");
		    Donut trashDonut = new Donut("Out Of The Trash");
		    Donut clusterFilled = new Donut("Cluster Filled");
		    
			donutList.add(trashDonut);
			donutList.add(glaze);
			donutList.add(baconFilled);
			donutList.add(trashDonut);
			donutList.add(clusterFilled);
		}
		
		private void changeTheList()
		{
			display.displayText("The list is this big: " + donutList.size());
			Donut removed = donutList.remove(0);
			display.displayText(removed.getFlavor() + "was removed from the list");
			display.displayText("Now it is this big: " + donutList.size());
			donutList.add(removed);
				
			display.displayText("The list is still contains: " + donutList.size() + " items.");
			removed = donutList.set(3, new Donut());
			display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed");
			
		}
			//practice
		private void practiceWithList()
		{

			display.displayText("The list is now this big: " + donutList.size());
			Donut removed = donutList.remove(0);
			display.displayText(removed.getShape() + "was removed form list");
			display.displayText("The list is now " + donutList.size());
			donutList.add(2, removed);

			Donut creamFilled = new Donut("Cream Donut");
			donutList.add(creamFilled);
			
			for (Donut number : donutList) 
			{
				System.out.println("Number = " + number);
			}
			
			for (int index = donutList.size() - 1; index >=0; index -=1)	
			{
				display.displayText(donutList.get(index).getFlavor());
			}
			
		}
		
		public ArrayList<Donut> getDonutList()
		{
			return (ArrayList<Donut>) donutList;
		}
		
		public PopupDisplay getDisplay()
		{
			return display;
		}
		
		
		
		
		
		
//		public String toString()
//		{
//			String description = "this donut is a" + flavor + " Donut";
//			
//			return description;
//		}
}
