package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DataConfig.class)
@ComponentScan(basePackageClasses={"spittr"},
		excludeFilters={@Filter(type=FilterType.CUSTOM, value=WebPackage.class)})
public class RootConfig {

}
