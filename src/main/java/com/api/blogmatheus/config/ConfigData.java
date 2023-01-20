package com.api.blogmatheus.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.format.DateTimeFormatter;

@Configuration
public class ConfigData {
    public static final String formato = "dd-MM-yyyy'T'HH:mm:ss'Z'";
    public static LocalDateTimeSerializer serializer = new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(formato));

    @Bean
    @Primary
    public ObjectMapper objectMapper(){
        JavaTimeModule modulo = new JavaTimeModule();
        modulo.addSerializer(serializer);
        return new ObjectMapper().registerModule(modulo);
    }
}