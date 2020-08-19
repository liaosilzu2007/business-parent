package com.lzumetal.business.comment.entity.vo;

import com.lzumetal.business.comment.entity.po.Comment;
import com.lzumetal.business.comment.entity.po.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author liaosi
 * @date 2020-08-19
 */
@Getter
@Setter
@ToString
public class CommentVO extends Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /* 当前用户是否点赞过此评论 */
    private boolean isLike;

    /* 评论人信息 */
    private User fromUser;

    /* 被回复数 */
    private Integer replyCount;


}
