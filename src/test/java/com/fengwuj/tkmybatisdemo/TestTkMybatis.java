package com.fengwuj.tkmybatisdemo;

import com.fengwuj.tkmybatisdemo.dao.TeacherDao;
import com.fengwuj.tkmybatisdemo.service.TKService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestTkMybatis {
    @Resource(name = "tkService")
    private TKService service;

    @Autowired
    private TeacherDao teacherDao;

    @Test
    public void test(){
        PageHelper.startPage(1,1);
        PageInfo page = PageInfo.of(teacherDao.selectAll());
        System.out.println("..");
    }
}
