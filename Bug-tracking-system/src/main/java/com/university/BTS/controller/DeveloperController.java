package com.university.BTS.controller;

import com.university.BTS.entity.DeveloperEntity;
import com.university.BTS.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/developer")
public class DeveloperController {

  @Autowired
  private DeveloperService developerService;

  @RequestMapping(value="list", method = RequestMethod.GET)
  public List<DeveloperEntity> getDeveloperList() {
    return developerService.getDevelopers();
  }

  @RequestMapping(value = "create", method = RequestMethod.POST)
  public DeveloperEntity create(@RequestBody String name) {
    return developerService.add(name);
  }

  @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
  public DeveloperEntity update(@RequestBody DeveloperEntity developer) {
    return developerService.update(developer);
  }

  @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
  public void delete(@PathVariable(value = "id") Integer developerId) {
    developerService.delete(developerId);
  }
}
