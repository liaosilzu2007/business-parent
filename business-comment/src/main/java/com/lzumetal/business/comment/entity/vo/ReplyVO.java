package com.lzumetal.business.comment.entity.vo;

import com.lzumetal.business.comment.entity.po.Reply;
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
public class ReplyVO extends Reply implements Serializable {

    private static final long serialVersionUID = 1L;

    /* 当前用户是否点赞过此回复 */
    private boolean isLike;

    private User toUser;

    private User fromUser;


}
