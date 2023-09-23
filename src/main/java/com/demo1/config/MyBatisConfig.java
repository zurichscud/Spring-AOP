package com.demo1.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
@MapperScan("com.demo1.mapper")
public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setTypeAliasesPackage("com.demo1.pojo");
        factoryBean.setDataSource(dataSource);
        return factoryBean;
    }

}
