package com.virtualpairprogrammers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.beans.factory.annotation.Value;

import com.netflix.appinfo.AmazonInfo;

@SpringBootApplication
@EnableEurekaServer
public class FleetmanRegistryApplication {

      public static void main(String[] args) {
		SpringApplication.run(FleetmanRegistryApplication.class, args);
	}
}
