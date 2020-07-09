package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class Ability extends StudentMapping {
private String name;
private String catagory;
}
