package com.training.model;

import java.util.ArrayList;
import java.util.List;

public class BookDetails {
	
	public List<String> findBookByCategory(String category){
		List<String> bookList = new ArrayList<>();
		if(category.equalsIgnoreCase("fiction")){ 
			bookList.add("Journey to the underworld");
			bookList.add("Lion in the box");
			bookList.add("Magic mania");
			bookList.add("Night in the zoo");
		}else if(category.equalsIgnoreCase("horror")){
			bookList.add("The Skull of Dead");
			bookList.add("Deadman bones");
			bookList.add("Midnight ghosts of middleeast");
			bookList.add("Zombies of the past");
		}else if(category.equalsIgnoreCase("action")){
			bookList.add("Kickstart action");
			bookList.add("Jump act and go");
			bookList.add("Rebel boys");
			bookList.add("Action in austria");
		}else if(category.equalsIgnoreCase("comedy")){
			bookList.add("Captain Candy");
			bookList.add("Trigger up Manny");
			bookList.add("Archies");
			bookList.add("Rooster in cooking");
		}else{
			bookList=null;
		}
		return bookList;
	}

}
