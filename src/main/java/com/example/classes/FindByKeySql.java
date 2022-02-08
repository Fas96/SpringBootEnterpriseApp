package com.example.classes;

import org.hibernate.mapping.Column;

public class FindByKeySql extends Sql {
    public FindByKeySql(
            String table, Column[] columns, String keyColumn, String keyValue) {
        super();
    }

    @Override
    public String generate() {
        return null;
    }
}
