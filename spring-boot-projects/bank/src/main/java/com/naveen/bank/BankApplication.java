package com.naveen.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients
@EnableEurekaClient
@RestController
@SpringBootApplication
public class BankApplication {

	@Autowired
	private BranchProxy branchProxy;

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

	@GetMapping("/bank")
	public String sayHi() {
		return "Hi from Bank";
	}

	@GetMapping("/bank/branch/{branchName}")
	public String getBranchDataFromBank(@PathVariable String branchName) {
		return "I'm from Bank -> " + branchProxy.getBranch(branchName);
	}

}
