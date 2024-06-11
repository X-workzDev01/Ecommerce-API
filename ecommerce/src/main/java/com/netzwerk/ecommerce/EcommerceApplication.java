package com.netzwerk.ecommerce;

import com.netzwerk.ecommerce.controller.EcommController;
import com.squareup.okhttp.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@SpringBootApplication

public class EcommerceApplication {

	public static void main(String[] args) throws IOException {

		System.out.println("starting app");
	//	SpringApplication.run(EcommerceApplication.class, args);

		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("text/xml ");

		RequestBody body = RequestBody.create(mediaType, "Request XML");

		Request request = new Request.Builder()

				.url("http://localhost:9000/").post(body)

				.addHeader("content-type", "text/xml")

				.addHeader("cache-control", "no-cache")

				.build();

		Response response = client.newCall(request).execute();
		System.out.println(response);
		System.out.println("Running app");
	}

}
