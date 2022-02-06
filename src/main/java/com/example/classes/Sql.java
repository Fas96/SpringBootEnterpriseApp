package com.example.classes;

import org.hibernate.mapping.Column;

abstract public class Sql {
    public Sql(String table, Column[] columns)  {} ;

    abstract public String generate();
}
