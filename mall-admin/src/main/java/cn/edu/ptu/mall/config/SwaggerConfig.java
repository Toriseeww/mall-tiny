package cn.edu.ptu.mall.config;

import cn.edu.ptu.mall.common.config.BaseSwaggerConfig;
import cn.edu.ptu.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("cn.edu.ptu.mall.modules")
                .title("商城基础版项目后台管理系统")
                .description("Tiny Mall项目后台管理接口文档")
                .contactName("PTU")
                .version("1.0")
                .enableSecurity(false)
                .build();
    }
}
