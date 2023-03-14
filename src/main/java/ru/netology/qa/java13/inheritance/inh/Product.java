package ru.netology.qa.java13.inheritance.inh;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Product {

    protected int id;
    protected String name;
    protected int price;
}
