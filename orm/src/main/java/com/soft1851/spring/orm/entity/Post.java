package com.soft1851.spring.orm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author jh_wu
 * @ClassName Post
 * @Description TODO
 * @Date 2020/3/17:15:54
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
    private Integer postId;
    private Integer forumId;
    private String title;
    private String content;
    private byte[] thumbnail;
    private Timestamp createTime;
}
