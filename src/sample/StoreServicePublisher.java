package sample;

import javax.xml.ws.Endpoint;

public class StoreServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/StoreSvcWeb/displayassortment", new StoreService());
	}
}
