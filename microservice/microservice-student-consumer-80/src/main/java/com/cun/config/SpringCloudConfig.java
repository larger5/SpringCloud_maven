package com.cun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringCloudConfig {

	/**
	 * 调用服务模版
	 * 主要是定义一个bean RestTemplate对象； springcloud消费者，服务提供者之间的交互是http rest方式，比dubbo rpc方式更加灵活方便点；
	 * @return
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
