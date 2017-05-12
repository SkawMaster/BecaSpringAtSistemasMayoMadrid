package com.atsistemas;

public class ContextoDeLosChinos {

	public Object getBean(String id){
		if(id.equals("Negocio")){
			Proxy proxy = new Proxy();
			proxy.setTarget(new Negocio());
			return proxy;
		} else {
			return null;
		}
	}
	
}
