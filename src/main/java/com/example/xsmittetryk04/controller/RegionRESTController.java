package com.example.xsmittetryk04.controller;

import com.example.xsmittetryk04.model.Region;
import com.example.xsmittetryk04.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class RegionRESTController {

    @Autowired
    RegionRepository regionRepository;

    @GetMapping("/regions")
    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }

    @PostMapping("/region")
    @ResponseStatus(HttpStatus.CREATED)
    public Region postRegion(@RequestBody Region region) {
        System.out.println(region);
        return regionRepository.save(region);
    }

}
