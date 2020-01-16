package com.university.BTS.entity;

import javax.persistence.Entity;

@Entity

public class DeveloperEntity extends BaseEntity {

  private String name;

  public DeveloperEntity() {}
  public DeveloperEntity(String name) { this.name = name; }
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
}
