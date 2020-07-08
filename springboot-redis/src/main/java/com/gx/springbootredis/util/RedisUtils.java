package com.gx.springbootredis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtils {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    /**
     * 写入缓存
     * @param k
     * @param v
     * @return set成功返回true，否则false
     */
    public boolean set(final String k, String v){
        boolean result = false;
        try {
            redisTemplate.opsForValue().set(k,v);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 读取缓存
     * @param k
     * @return
     */
    public String get(final String k){
        return redisTemplate.opsForValue().get(k);
    }

    /**
     * 更新缓存
     * @param k
     * @param v
     * @return
     */
    public boolean getAndSet(final String k, String v){
        boolean result = false;
        try {
            redisTemplate.opsForValue().getAndSet(k,v);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 删除数据
     * @param k
     * @return
     */
    public boolean delete(final String k){
        boolean result = false;
        try {
            redisTemplate.delete(k);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
