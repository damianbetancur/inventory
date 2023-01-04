package com.betancur.inventory.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public interface ScopeUtils {
    String SCOPE_SUFFIX = "SCOPE_SUFFIX";
    String SCOPE = "SCOPE";
    String SCOPE_VALUE = System.getenv(SCOPE);

    static void calculateScopeSuffix() {
        String suffix = Optional
                        .ofNullable(SCOPE_VALUE) // permite valor nullo
                        .filter(StringUtils::isNoneBlank) // No permite espacios en blanco
                        .map(scope -> {String[] tokens = scope.split("-"); // divide scope en varios fragmentos separados por "-"
                        return tokens[ tokens.length - 1 ]; //toma el ultimo fragmento de tokens y lo asigna a suffix
                        })
                        .orElseThrow(() -> new IllegalArgumentException("[Assertion Fail] SCOPE must be set to startup the application.")); // exception si el valor es null
        System.setProperty(SCOPE_SUFFIX, suffix); // setea la propiedad del sistema SCOPE_SUFIX al valor que posee
    }
}
