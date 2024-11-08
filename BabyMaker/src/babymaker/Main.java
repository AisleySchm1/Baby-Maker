package babymaker;

import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)
	  {
	   ArrayList<Baby>nursery = new ArrayList<Baby>();
	    nursery.add(new Baby("Fred", 8.2));
	    nursery.add(new Baby("George", 7.3));
	    nursery.add(new Baby("Harry", 9.0));

	    nursery.get(0).setName("Frederica");
	    System.out.println(nursery.get(0).getName());

	    for(int i = 0; i < nursery.size(); i ++)
	      {
	        System.out.println(nursery.get(i).getName());
	      }
	  }
}
