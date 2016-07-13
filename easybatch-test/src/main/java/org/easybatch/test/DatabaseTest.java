package org.easybatch.test;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

public class DatabaseTest {

    protected EmbeddedDatabase database;

    protected void setup() {
        database = new EmbeddedDatabaseBuilder().setName("test")
                .addScript("schema.sql")
                .addScript("data.sql")
                .build();
    }

    protected void tearDown() {
        database.shutdown();
    }

}
