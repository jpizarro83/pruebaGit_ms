package com.cjava.apirest.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HealtController
{
	@GetMapping(value = "/test/healthcheck", produces = "application/json; charset=utf-8")
	public String getHealthCheck()	{
		return "{ \"todoOk employee - memoria\" : true }";
	}

	@GetMapping(value = "/test/healthcheck2", produces = "application/json; charset=utf-8")
	public String getHealthCheck2()	{
		return "{ \"todoOk employee - memoria\" : true }";
	}

}
