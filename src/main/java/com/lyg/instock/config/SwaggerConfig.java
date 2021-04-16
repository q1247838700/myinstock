package com.lyg.instock.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean("swagger平台测试")
    public Docket userApis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("库存管理")
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class)) // 所有标了API注解的才在文档中展示
                .paths(PathSelectors.regex("/.*")) // demo下的所有请求
                .build()
                .apiInfo(apiInfo())
                .enable(true);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("swagger平台测试接口")
                .description("liufeiye提供测试的测试")
                .termsOfServiceUrl("http://www.baidu.com/")
                .version("1.0")
                .build();
    }

}
