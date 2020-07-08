package com.gx.springbootredis;

import com.gx.springbootredis.util.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootRedisApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    RedisUtils redisUtils;

    @Test
    public void setTest(){
        redisUtils.set("hello","gx");
    }
}
