package com.hyscaler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

@SpringBootApplication
public class EventManagementSystemApplication {
	
	
	@Value("${paypal.client.id}")
	private String clientId;
	@Value("${paypal.client.secret}")
	private String clientSecret;
	@Value("${paypal.mode}")
	private String mode;
	
	@Bean
	public Map<String, String> paypalSdkConfig(){
		Map<String, String> configMap =  new HashMap<>();
		
		configMap.put("mode", mode);
		
		return configMap;
		
	}
	
	@Bean
	public OAuthTokenCredential authTokenCredential() {
		return new OAuthTokenCredential(clientId, clientSecret , paypalSdkConfig());
	}
	
	
	@Bean
	public APIContext apiContext() throws PayPalRESTException {
		
		APIContext context = new APIContext(authTokenCredential().getAccessToken());
		context.setConfigurationMap(paypalSdkConfig());
		
		return context;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(EventManagementSystemApplication.class, args);
	}

}
