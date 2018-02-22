package com.nhnent.simple.springjaxb.controller;

import com.nhnent.simple.springjaxb.protocol.LoginRequest;
import com.nhnent.simple.springjaxb.protocol.LoginResponse;
import com.nhnent.simple.springjaxb.protocol.UserDataType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by danielkim
 */
@RestController
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody LoginResponse login(@Valid LoginRequest request) {
		LoginResponse response = new LoginResponse();

		response.setEmail("danielkim@nhnent.com");
		response.setId("test");
		response.setName("테스터");

		UserDataType.Phone phone = new UserDataType.Phone();
		phone.setNumber("031-8038-3171");
		phone.setType(1);

		response.getPhone().add(phone);

		return response;
	}
}
