package com.example.database;

import com.apple.eawt.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class CarBaseDatavaseTests {

    @Autowired
    private JdbcTemplate template=new JdbcTemplate();

    @Test
    public void getCars(){
        List<Map<String,Object>> queryForlist=template.queryForList("select * from Car");
    }
}
