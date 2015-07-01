package org.maven.book.controller;

import javax.annotation.Resource;

import org.maven.book.model.Book;
import org.maven.book.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  
@RequestMapping("/book.do")  
public class BookController {  
  
    private BookService bookService;  
    @RequestMapping(params = "method=add")  
    public String add(Book book){ //here,where book comes from  ?
        System.out.println("bookname:"+book.getName());  
        System.out.println("author:"+book.getAuthor());  
        bookService.add(book); 
        return "add_success";  
    }  
    @RequestMapping(params = "method=update")  
    public ModelAndView update(Book book) {  
        bookService.update(book);  
        String text ="modelAndview" ;
       return new ModelAndView("update_success","result",text);
        //return "update_success";  
    }  
    public BookService getBookService() {  
        return bookService;  
    }  
    @Resource  
    public void setBookService(BookService bookService) {  
        this.bookService = bookService;  
    }  
      
}  