package com.demo1.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.demo1")
@PropertySource("jdbc.properties")
@EnableAspectJAutoProxy
@Import({MyBatisConfig.class, JDBCConfig.class})
public class SpringConfig {
}
