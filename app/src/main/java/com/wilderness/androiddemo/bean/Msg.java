package com.wilderness.androiddemo.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Msg {

    public static final int TYPE_RECEIVED = 0;

    public static final int TYPE_SEND = 1;

    private String content;

    private int type;

    public Msg(String content, int type) {
        this.content = content;
        this.type = type;
    }
}
