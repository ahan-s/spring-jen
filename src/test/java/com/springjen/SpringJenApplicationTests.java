package com.springjen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenApplicationTests.class);

	@Test
	public  contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
