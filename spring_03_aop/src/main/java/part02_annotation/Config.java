package part02_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//Configuration : 환경설정을 자바소스로 만들기 위한 어노테이션
@Configuration
@EnableAspectJAutoProxy
// @EnableAspectJAutoProxy = <aop:aspectj-autoproxy></aop:aspectj-autoproxy> 공통 로직을 불러오는 어노테이션
public class Config {
	public Config() {

	}

	@Bean
	public ServiceImp svc() {
		return new ServiceImp();
	}

	@Bean
	public AdviceCommon common() {
		return new AdviceCommon();
	}
}
