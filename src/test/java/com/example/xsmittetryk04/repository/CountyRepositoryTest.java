package com.example.xsmittetryk04.repository;

import com.example.xsmittetryk04.XSmittetryk04Application;
import com.example.xsmittetryk04.model.County;
import com.example.xsmittetryk04.model.Region;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = XSmittetryk04Application.class)
class CountyRepositoryTest {

    @Test
    void testFunc() {
        //List<Region> regions = regionRepository.findAll();
        //Assertions.assertEquals(3, counties.size());
        Integer i1 = 5;
        Assertions.assertEquals(true, i1 > 2);
    }

}
