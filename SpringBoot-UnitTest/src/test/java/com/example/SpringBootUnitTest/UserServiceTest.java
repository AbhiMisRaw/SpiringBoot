package com.example.SpringBootUnitTest;


import com.example.SpringBootUnitTest.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class) //@RunWith: intigrate spring with Junit
@SpringBootTest(classes = {SpringBootUnitTestApplication.class}) //@SpirngBootTest: this class is SpringBoot Test.
public class UserServiceTest {
    @Resource
    private UserService userService;
    @Test
    public void testGetUser(){
        Assert.assertEquals(userService.getUser() , "Tom");
    }
}
