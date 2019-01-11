package com.howie.wen.async;

import com.alibaba.fastjson.JSONObject;
import com.howie.wen.util.JedisAdapter;
import com.howie.wen.util.RedisKeyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author:HowieLee
 * @Date:1/10/2019
 * @Description:com.howie.wen.async
 * @version:1.0
 */
@Service
public class EventProducer {
    @Autowired(required=false)
    @Qualifier("jedisAdapter")
    JedisAdapter jedisAdapter;

    public boolean fireEvent(EventModel eventModel) {
        try {
            String json = JSONObject.toJSONString(eventModel);
            String key = RedisKeyUtil.getEventQueueKey();
            jedisAdapter.lpush(key, json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}