package edu.apigateway.domain;

import com.datastax.driver.mapping.annotations.Table;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Table(keyspace = "complete", name = "user", caseSensitiveKeyspace = false, caseSensitiveTable = false)
public class User {
    private long id;
    private String username;
    private String password;
}
