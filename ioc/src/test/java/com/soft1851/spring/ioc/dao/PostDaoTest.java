package com.soft1851.spring.ioc.dao;

import com.soft1851.spring.ioc.entity.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class PostDaoTest {
@Autowired
private PostDao postDao;
    @Test
    public void insert() throws IOException {
        byte soundbyte[]=null;
        File file = new File("C:\\Users\\admin\\Pictures\\Camera Roll\\2.png");
        FileInputStream inputStream = new FileInputStream(file);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int len = 0;
        byte[] tem= new byte[1024];
        while ((len=inputStream.read(tem))!=-1){
            outputStream.write(tem,0,len);
        }
        inputStream.close();
        outputStream.flush();
        outputStream.close();
        soundbyte= outputStream.toByteArray();
        Post post = Post.builder().forumId(1).title("123").content("123").thumbnail(soundbyte).createTime(Timestamp.valueOf(LocalDateTime.now())).build();
        int n = postDao.insert(post);
        assertEquals(1,n);
    }

    @Test
    public void batchInsert() throws IOException {
        byte soundbyte[]=null;
        File file = new File("C:\\Users\\admin\\Pictures\\Camera Roll\\3.png");
        FileInputStream inputStream = new FileInputStream(file);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int len = 0;
        byte[] tem= new byte[1024];
        while ((len=inputStream.read(tem))!=-1){
            outputStream.write(tem,0,len);
        }
        inputStream.close();
        outputStream.flush();
        outputStream.close();
        soundbyte= outputStream.toByteArray();
        String time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        Post[] posts = {
                Post.builder().forumId(3).content("测试1").thumbnail(soundbyte).createTime(Timestamp.valueOf(time)).title("test1").build(),
                Post.builder().forumId(3).content("测试2").thumbnail(soundbyte).createTime(Timestamp.valueOf(time)).title("test2").build(),
                Post.builder().forumId(3).content("测试3").thumbnail(soundbyte).createTime(Timestamp.valueOf(time)).title("test3").build(),
                Post.builder().forumId(3).content("测试4").thumbnail(soundbyte).createTime(Timestamp.valueOf(time)).title("test4").build(),
        };
        List<Post> postList = Arrays.asList(posts);
        int[] rows = postDao.batchInsert(postList);
        assertEquals(4,rows.length);
    }

    @Test
    public void delete() {
        int n = postDao.delete(8);
        assertEquals(1,n);
    }


    @Test
    public void batchDelete() {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        int[] a= postDao.batchDelete(list);
        assertEquals(2,a.length);

    }

    @Test
    public void selectByKeyword() {
        List<Post> postList= postDao.selectByKeyword("1");
        assertNotNull(postList);
        System.out.println(postList);
    }

    @Test
    public void count() {
        int post = postDao.count();
        System.out.println(post);
    }

    @Test
    public void get() {
        Post post = postDao.get(6);
        System.out.println(post);
    }
}