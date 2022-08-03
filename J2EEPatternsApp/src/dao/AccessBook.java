package dao;

import dao.dao.BookDao;
import dao.daoimpl.BookDaoImpl;
import dao.model.Books;

public class AccessBook {

    public static void main(String[] args) {

        BookDao bookDao = new BookDaoImpl();

        for (Books book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn());
        }

        //update student
        Books book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);
        for (Books book1 : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book1.getIsbn());
        }
      //  bookDao.deleteBook(book);
    }
}
