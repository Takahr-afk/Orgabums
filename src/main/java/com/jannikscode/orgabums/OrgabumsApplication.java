package com.jannikscode.orgabums;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
@Log
public class OrgabumsApplication implements CommandLineRunner {


    private final DataSource dataSource;

    public OrgabumsApplication(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrgabumsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("DataSource: "+ dataSource.toString());
        final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
        restTemplate.execute("SELECT 1");
    }
}
