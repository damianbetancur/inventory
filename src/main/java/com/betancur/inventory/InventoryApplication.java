package com.betancur.inventory;


import com.betancur.inventory.config.SpringConfig;
import com.betancur.inventory.utils.ScopeUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class InventoryApplication {

    public static void main(String[] args) {
        ScopeUtils.calculateScopeSuffix();
        new SpringApplicationBuilder(SpringConfig.class)
                .registerShutdownHook(true)
                .run(args);
    }
}
