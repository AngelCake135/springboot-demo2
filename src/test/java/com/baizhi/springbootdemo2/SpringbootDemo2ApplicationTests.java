package com.baizhi.springbootdemo2;

import com.baizhi.entity.Ems;
import com.baizhi.mapper.EmsMapper;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemo2ApplicationTests {

    @Autowired
    private EmsMapper emsMapper;

    @Test
    public void contextLoads() {

        System.out.println("----------------");

        Ems ems1 = new Ems();
        ems1.setCity("北京");
        List<Ems> list = emsMapper.select(ems1);


        List<Ems> ems2 = emsMapper.selectByRowBounds(ems1, new RowBounds(0, 4));

        for (Ems ems : ems2) {

            System.out.println(ems);
        }

        System.out.println("---------------");
        for (Ems ems : list) {

            System.out.println(ems);
        }

    }

}
