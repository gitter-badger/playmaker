package org.cloudira.playmaker.actuator.client;

import org.springframework.http.HttpMethod;

public class ResumeEndpointClient extends ActuatorEndpointClient<Boolean>{

	public ResumeEndpointClient(String managementUrl) {
		super(managementUrl);
	}
	
	@Override
	public String getEndpointPath() {
		return "resume";
	}
	
	@Override
	public HttpMethod getHttpMethod() {
		return HttpMethod.POST;
	}

}