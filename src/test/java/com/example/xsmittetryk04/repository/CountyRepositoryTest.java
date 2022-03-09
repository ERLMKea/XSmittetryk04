package com.example.xsmittetryk04.repository;

import com.example.xsmittetryk04.model.County;
import com.example.xsmittetryk04.model.Region;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CountyRepositoryTest {

    @Autowired
    RegionRepository regionRepository;

    @Test
    void testFunc() {
        List<Region> regions = regionRepository.findAll();
        //Assertions.assertEquals(3, counties.size());
        Assertions.assertEquals(true, regions.size() > 4);
    }

}
