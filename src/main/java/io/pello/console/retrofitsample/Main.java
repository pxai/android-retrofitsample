package io.pello.console.retrofitsample;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public void start () {
		ItemManager itemManager = new ItemManager();
    	Scanner reader = new Scanner(System.in);
    	String option = "";
    	Long id = 0l;
    	
    	do {
	    
    		this.showMenu();
    		option = reader.nextLine();
    		
    		switch (option) {
    			case "1":	
    						List<Item> items = itemManager.getItems();
    						System.out.println(items);
    						
    						break;
    						
    			case "2":	
    						System.out.println("Please, enter an Id");
    						id = reader.nextLong();
    						Item item = itemManager.getItem(id);
    						System.out.println(item);
							break;
    			default:	
    						break;
    		}
    	} while (!option.equals("6"));	
	}
	
	/**
	 * generates a menu from a String array
	 * @return
	 */
	public void showMenu () {
		String result = "";
		String[] options = {
	    	"Choose an option",
	    	"1. Select all items.",
	    	"2. Select one item.",
	    	"3. Insert new item.",
	    	"4. Update one item.",
	    	"5. Delete one item.",
	    	"6. Exit."
		};
		
		for (String option: options) {
			result = result + option + "\n";
		}
		
		 System.out.println(result);
	}
}
