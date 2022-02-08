package com.example.classes;

import org.hibernate.mapping.Column;

public class Sequal {
}


public class CreateSql extends Sql {
    public CreateSql(String table, Column[] columns) {
    }

    @Override
    public String generate() {
                

    }
}
public class SelectSql extends Sql {
    public SelectSql(String table, Column[] columns)
    @Override public String generate()
}
public class InsertSql extends Sql {
    public InsertSql(String table, Column[] columns, Object[] fields) {
        
    }

    @Override
    public String generate() {
        return null;
    }

    private String valuesList(Object[] fields, final Column[] columns) {
        return null;
    }
}
public class SelectWithCriteriaSql extends Sql {
    public SelectWithCriteriaSql(
            String table, Column[] columns, Criteria criteria) {
        
    }

    @Override
    public String generate() {
        return null;
    }
}
public class SelectWithMatchSql extends Sql {
    public SelectWithMatchSql(String table, Column[] columns, Column column, String pattern) {
        super();

    }

    @Override
    public String generate() {
        return null;
    }
}

public class PreparedInsertSql extends Sql {
    public PreparedInsertSql(String table, Column[] columns) {
        
    }

    @Override public String generate() {
        private String placeholderList(Column[]Object columns;
        Object columns1 = columns;)
    }
    public class Where {
        public Where(String criteria)
        public String generate()
    }

    public class ColumnList {
        public ColumnList(Column[] columns)
        public String generate()
    }