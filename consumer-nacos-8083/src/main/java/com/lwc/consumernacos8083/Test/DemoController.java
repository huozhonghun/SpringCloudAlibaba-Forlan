package com.lwc.consumernacos8083.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author weichenglin
 * @since 2022-05-23-下午 05:52:31
 */
@RestController
public class DemoController {

	@Value("${service-url.nacos-user-service}")
	private String serviceUrl;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/testRibbon")
	public String testRibbon() {
		return restTemplate.getForObject(serviceUrl + "/getServerPort", String.class);
	}
}
