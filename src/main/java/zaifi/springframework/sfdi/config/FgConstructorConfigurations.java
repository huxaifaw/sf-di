package zaifi.springframework.sfdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("zaifi")
public class FgConstructorConfigurations {
    private final String username;
    private final String passwd;
    private final String jdbcUrl;

    public FgConstructorConfigurations(String username, String passwd, String jdbcUrl) {
        this.username = username;
        this.passwd = passwd;
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
