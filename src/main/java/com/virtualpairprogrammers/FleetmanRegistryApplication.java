package com.virtualpairprogrammers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FleetmanRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetmanRegistryApplication.class, args);
	}
	
	@Bean
	public EurekaInstanceConfigBean eurekaInstanceConfigBean(InetUtils utils)  {
		final EurekaInstanceConfigBean instance = new EurekaInstanceConfigBean(utils);
//		{
//			@Scheduled(initialDelay = 30000L, fixedRate = 30000L)
//			public void refreshInfo() {
//				AmazonInfo newInfo = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
//				if (!this.getDataCenterInfo().equals(newInfo)) {
//					((AmazonInfo) this.getDataCenterInfo()).setMetadata(newInfo.getMetadata());
//					this.setHostname(newInfo.get(AmazonInfo.MetaDataKey.publicHostname));
//					this.setIpAddress(newInfo.get(AmazonInfo.MetaDataKey.publicIpv4));
//					this.setDataCenterInfo(newInfo);
//					this.setNonSecurePort(8010);
//				}
//			}         
//		};
		AmazonInfo info = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
		instance.setHostname(info.get(AmazonInfo.MetaDataKey.publicHostname));
		instance.setIpAddress(info.get(AmazonInfo.MetaDataKey.publicIpv4));
		instance.setDataCenterInfo(info);
		instance.setNonSecurePort(8010);

		return instance;
	}	
	
}
