package com.soft1851.spring.ioc.config;

import com.soft1851.spring.ioc.dao.PostDao;
import com.soft1851.spring.ioc.entity.Forum;
import com.soft1851.spring.ioc.entity.Post;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.print.Book;

/**
 * @author jh_wu
 * @ClassName AppConfig
 * @Description TODO
 * @Date 2020/3/17:12:19
 * @Version 1.0
 **/
@Configuration
public class AppConfig {
    @Bean
    public Book book(){
        return new  Book();
    }

    @Bean
    public Forum forum() {
        return new Forum();
    }
    @Bean
    public Post post(){
        return new Post();
    }

}
