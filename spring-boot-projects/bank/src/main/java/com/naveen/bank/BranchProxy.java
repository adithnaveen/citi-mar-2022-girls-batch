package com.naveen.bank;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "BRANCH-SERVICE")
public interface BranchProxy {
    @GetMapping("/branch/{branchName}")
    public String getBranch(@PathVariable String branchName);
}
