package com.howie.wen.async;

import java.util.List;

/**
 * @Author:HowieLee
 * @Date:1/10/2019
 * @Description:com.howie.wen.async
 * @version:1.0
 */
public interface EventHandler {

    void doHandle(EventModel model);
    //用来注册自己，宣布自己关注什么event
    List<EventType> getSupportEventTypes();
}
