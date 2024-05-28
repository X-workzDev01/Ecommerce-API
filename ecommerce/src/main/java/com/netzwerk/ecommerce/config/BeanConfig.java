//package com.netzwerk.ecommerce.config;
//
//import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Description;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
//import org.thymeleaf.spring6.SpringTemplateEngine;
//import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
//import org.thymeleaf.spring6.view.ThymeleafViewResolver;
//import org.thymeleaf.templatemode.TemplateMode;
//import org.thymeleaf.templateresolver.UrlTemplateResolver;
//import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan
//public class BeanConfig implements WebMvcConfigurer {
//
////    private ApplicationContext applicationContext;
////    private static final String VIEWS = "resources/templates/";
////    private static final String RESOURCES_LOCATION = "/resources/";
////    private static final String RESOURCES_HANDLER = RESOURCES_LOCATION + "**";
//
////    @Bean
////    public ITemplateResolver templateResolver() {
////        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
////        resolver.setPrefix("/WEB-INF/templates/");
////        resolver.setSuffix(".html");
////        resolver.setTemplateMode(TemplateMode.HTML);
////        resolver.setCharacterEncoding("UTF-8");
////        resolver.setCacheable(true);
////        return resolver;
////    }
//
//    @Bean
//    @Description("Thymeleaf Template Resolver")
//    public SpringResourceTemplateResolver templateResolver() {
//        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//        templateResolver.setPrefix("/WEB-INF/templates/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setTemplateMode(TemplateMode.HTML);
//        templateResolver.setCacheable(true);
//        return templateResolver;
//    }
//
//
//    @Bean
//    @Description("Thymeleaf Template Engine")
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.addTemplateResolver(new UrlTemplateResolver());
//        templateEngine.addTemplateResolver(templateResolver());
//        templateEngine.addDialect(new SpringSecurityDialect());
//        templateEngine.addDialect(new LayoutDialect());
//        templateEngine.addDialect(new Java8TimeDialect());
//        return templateEngine;
//    }
//
//    @Bean
//    public ThymeleafViewResolver viewResolver(){
//        ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
//        thymeleafViewResolver.setTemplateEngine(templateEngine());
//        thymeleafViewResolver.setCharacterEncoding("UTF-8");
//        return thymeleafViewResolver;
//    }
//
//
//}
