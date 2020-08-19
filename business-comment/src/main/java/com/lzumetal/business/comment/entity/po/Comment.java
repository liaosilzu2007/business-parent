package com.lzumetal.business.comment.entity.po;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论
 *
 * @author liaosi
 * @date 2020-08-19
 */
@Getter
@Setter
@ToString
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /* 被评论的对象的id */
    private Long topicId;

    /* 被评论的对象类型 */
    private String topicType;

    /* 评论时间 */
    private Date createTime;

    /* 评论内容 */
    private String content;

    /* 评论的用户的id */
    private Long fromUserid;

    /* 被点赞数 */
    private Integer likeCount;

    /* 展示状态。1展示；0不展示 */
    private Integer display;

}
