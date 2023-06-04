package com.example.capi.hobbies;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="hobbies-feign-client")
public interface HobbiesFeignClient {
}
