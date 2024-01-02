package com.springEdu.techcareer;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEducationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEducationApplication.class, args);
	}

	String empty = StringUtils.EMPTY;
	String space = StringUtils.SPACE;

}
