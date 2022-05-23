package com.lwc.nacos9001.Test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weichenglin
 * @since 2022-05-23-下午 05:13:50
 */
@RestController
public class DemoController {

	@Value("${server.port}")
	private String port;

	@GetMapping(value = "/getServerPort")
	public String getServerPort() {
		return "Welcome to nocas：" + port;
	}
}
