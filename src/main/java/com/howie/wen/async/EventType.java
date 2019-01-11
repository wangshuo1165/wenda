package com.howie.wen.async;

/**
 * @Author:HowieLee
 * @Date:1/10/2019
 * @Description:com.howie.wen.async
 * @version:1.0
 */
public enum EventType {
    LIKE(0),
    COMMENT(1),
    LOGIN(2),
    MAIL(3),
    FOLLOW(4),
    UNFOLLOW(5);

    private int value;
    EventType(int value) { this.value = value; }
    public int getValue() { return value; }
}
