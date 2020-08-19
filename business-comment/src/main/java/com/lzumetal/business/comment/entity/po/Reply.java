package com.lzumetal.business.comment.entity.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 回复
 *
 * @author liaosi
 * @date 2020-08-19
 */
@Getter
@Setter
@ToString
public class Reply implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /* 评论的id。即根评论的id，如果是对评论的回复，则replyId=commentId */
    private Long commentId;

    /* 被回复记录的id，可能是评论id，也可能是回复记录的id */
    private Long replyId;

    /* 回复的类型。参考：EReplyType.java */
    private String replyType;

    /* 回复时间 */
    private Date createTime;

    /* 回复内容 */
    private String content;

    /* 回复人的用户id */
    private Long fromUserid;

    /* 被回复人的用户id */
    private Long toUserid;

    /* 点赞数 */
    private Integer likeCount;
}
