package com.lzumetal.business.comment.entity.emuns;

/**
 * @author liaosi
 * @date 2020-08-19
 */
public enum EReplyType {

    COMMENT("COMMENT", "对评论的回复"),

    REPLY("REPLY", "对回复的回复"),

    ;

    private final String type;
    private final String desc;

    EReplyType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String desc() {
        return desc;
    }

    public String type() {
        return type;
    }

}
