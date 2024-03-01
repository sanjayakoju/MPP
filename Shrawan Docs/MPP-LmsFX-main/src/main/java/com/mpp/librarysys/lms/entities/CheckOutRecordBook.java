package com.mpp.librarysys.lms.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class CheckOutRecordBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "book_copy_id")
    private BookCopy bookCopy;

    @ManyToOne
    @JoinColumn(name = "library_member_id")
    private LibraryMember libraryMember;

    @ManyToOne
    @JoinColumn(name = "librarian_user_id")
    private User librarianUser;

    private LocalDate checkOutDate;
    private LocalDate dueDate;

    public User getLibrarianUser() {
        return librarianUser;
    }

    public void setLibrarianUser(User librarianUser) {
        this.librarianUser = librarianUser;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public void setBookCopy(BookCopy bookCopy) {
        this.bookCopy = bookCopy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LibraryMember getLibraryMember() {
        return libraryMember;
    }

    public void setLibraryMember(LibraryMember libraryMember) {
        this.libraryMember = libraryMember;
    }


    @Override
    public String toString() {
        return "CheckOutRecordBook{" +
                "id=" + id +
                ", bookCopy=" + bookCopy +
                ", libraryMember=" + libraryMember +
                ", librarianUser=" + librarianUser +
                ", checkOutDate=" + checkOutDate +
                ", dueDate=" + dueDate +
                '}';
    }
}
