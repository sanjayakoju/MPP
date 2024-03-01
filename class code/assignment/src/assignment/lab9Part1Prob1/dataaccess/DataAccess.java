package assignment.lab9Part1Prob1.dataaccess;


import java.util.HashMap;

import assignment.lab9Part1Prob1.business.Book;
import assignment.lab9Part1Prob1.business.LibraryMember;


public interface DataAccess { 
	public HashMap<String,Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
}
