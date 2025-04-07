package com.onlineplatform.lctr;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@MapperScan(basePackages = "com.onlineplatform.*")
@SpringBootApplication
public class LctrApplication {

	public static void main(String[] args) {
		SpringApplication.run(LctrApplication.class, args);
	}
	@Bean // 스프링 빈으로 등록
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		
		// 1. SqlSessionFactoryBean 객체 생성
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		// 2. DataSource 설정, 매퍼 파일 위치 설정
		sessionFactory.setDataSource(dataSource);
		Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*Mapper.xml");
		sessionFactory.setMapperLocations(res);
		
		sessionFactory.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml"));
		
		// 3. 생성된 SqlSessionFactory 객체 반환
		return sessionFactory.getObject();
	}

}
