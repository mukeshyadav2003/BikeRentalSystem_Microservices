package com.Bike.BikeRentalSystem.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("BIKESECTION")
public interface BikeSectionInterface {

}
