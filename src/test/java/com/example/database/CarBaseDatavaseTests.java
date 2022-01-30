package com.example.database;

import com.apple.eawt.Application;
import com.example.enterprisespringbootapp.CarwasherConfiguration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = Application.class)
public class CarBaseDatavaseTests {
    @Autowired
    private CarwasherConfiguration  carwash=new CarwasherConfiguration();

    @Test
    public void getProperties(){
        carwash.init();
    }
}
