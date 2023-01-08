package edu.kh.library.run;

import edu.kh.library.model.service.BookService;
import edu.kh.library.model.service.BookService2;

public class Run {
	
	public static void main (String[] args) {
	

		BookService2 service = new BookService2();
	
		service.displayMenu();
	
	}

}
