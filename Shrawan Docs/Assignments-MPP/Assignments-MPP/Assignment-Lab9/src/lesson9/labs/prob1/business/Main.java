package lesson9.labs.prob1.business;

import java.util.*;
import java.util.stream.Collectors;

import lesson9.labs.prob1.dataaccess.DataAccess;
import lesson9.labs.prob1.dataaccess.DataAccessFacade;

public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingAtLeastTwoCopies());
		System.out.println(allHavingMultipleAuthors());

	}
	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		//implement

		List<String> memberIdsList = mems.stream()
				.filter(libraryMember -> libraryMember.getAddress().getZip().contains("3"))
				.map(libraryMember -> libraryMember.getMemberId())
				.collect(Collectors.toList());

		return memberIdsList;
		
	}
	//Returns a list of all isbns of books having at least two copies
	public static List<String> allHavingAtLeastTwoCopies() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		//implement

		List<String> bookIsbnList = bs.stream()
				.filter(book -> book.getCopies().length >= 2)
				.map(book -> book.getIsbn())
				.collect(Collectors.toList());
		
		return bookIsbnList;
		
	}

	//Returns a list of all isbns of Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		//implement

		List<String> bookIsbnList = bs.stream()
				.filter(book -> book.getAuthors().size() > 1)
				.map(book -> book.getIsbn())
				.collect(Collectors.toList());
		
		return bookIsbnList;
		
		}

}
