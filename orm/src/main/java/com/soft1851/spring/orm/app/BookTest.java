package com.soft1851.spring.orm.app;

import com.soft1851.spring.orm.config.AppConfig;
import com.soft1851.spring.orm.entity.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jh_wu
 * @ClassName BookTest
 * @Description TODO
 * @Date 2020/3/17:12:34
 * @Version 1.0
 **/

public class BookTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new
                AnnotationConfigApplicationContext(AppConfig.class);
        ctx.scan("com.soft1851.spring.ioc.config");

        Book book = (Book) ctx.getBean("book");
        book.setName("java");
        book.setPrice(88.8);
        System.out.println(book);
    }
}
