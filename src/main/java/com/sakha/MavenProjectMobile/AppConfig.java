package com.sakha.MavenProjectMobile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.sakha.MavenProjectMobile")
@PropertySource("app.properties")
public class AppConfig {

}
