package org.maven.book.dao;

import org.maven.book.model.Book;
import org.springframework.stereotype.Component;

@Component  
public class BookDao {  
  
    //模拟数据库操作  
    public void add(Book book){  
        System.out.print("Add");  
    }  
    public void update(Book book){  
        System.out.print("Update");  
    }  
}  
