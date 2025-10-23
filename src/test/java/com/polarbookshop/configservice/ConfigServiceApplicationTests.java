package com.polarbookshop.configservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigServiceApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    @Disabled("You can enable this test if your config-repo is publicly available")
    void defaultConfigurationAvailable() {
        ResponseEntity<Environment> entity = restTemplate
                .getForEntity("/application/default", Environment.class);
        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
