/**
 * 2023.10.04 Blank Url Path Controller, http://localhost:8099 여기까지만 주어진 Blank Url을 돌려주는 .html 파일 지정.
 */

package shop.onekorea.springbootsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        WebMvcConfigurer.super.addViewControllers(registry);

        /** 2023.09.27 Conclusion. 만약 application.yml에서, thymeleaf.prefix 설정을 아래와 같이,
         * 맨 끝에, "/"가 없다면, 여기서 "/home" 처럼, 처음에 "/"를 넣어 주어야 한다.
         * spring:
         *   thymeleaf:
         *     cache: false # source reload, front-end reload nothing...
         *     prefix: file:src/main/resources/templates # classpath:/templates
         */

//        registry.addViewController("/home/home").setViewName("/create/form");
//        registry.addViewController("/home/home").setViewName("/crawling/weather");
//        registry.addViewController("/home/home").setViewName("/home/index");
//        registry.addViewController("/member/list").setViewName("/member/member_list");
//        registry.addViewController("/").setViewName("/home/index");
        registry.addViewController("/").setViewName("/index");

    }
}
