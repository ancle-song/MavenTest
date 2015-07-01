package org.maven.book.service;

import javax.annotation.Resource;

import org.maven.book.dao.BookDao;
import org.maven.book.model.Book;
import org.springframework.stereotype.Component;

@Component  
public class BookService {  
  
    private BookDao bookDao;  
  
    public BookDao getBookDao() {  
        return bookDao;  
    }  
  
    @Resource  
    public void setBookDao(BookDao bookDao) {  
        this.bookDao = bookDao;  
    }  
      
    public void add(Book book){  
        bookDao.add(book);  
    }  
    public void update(Book book){  
        bookDao.update(book);  
    }  
      
}  