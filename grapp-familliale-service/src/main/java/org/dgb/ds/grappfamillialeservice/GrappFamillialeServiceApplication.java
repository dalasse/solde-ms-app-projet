package org.dgb.ds.grappfamillialeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GrappFamillialeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrappFamillialeServiceApplication.class, args);
    }

}
