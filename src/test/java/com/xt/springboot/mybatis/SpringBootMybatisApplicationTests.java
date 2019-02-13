package com.xt.springboot.mybatis;

import com.xt.springboot.mybatis.entity.Items;
import com.xt.springboot.mybatis.mapper.ItemsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMybatisApplication.class)
@Transactional
@Rollback
public class SpringBootMybatisApplicationTests {

    @Autowired
    private ItemsMapper itemsMapper;

    @Test
    public void testSelect(){
        List<Items> itemsList = itemsMapper.selectAll();
        for(Items items : itemsList){
            System.out.println(items.getName());
        }
    }
}

