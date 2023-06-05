package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class MedunnaBaseUrl {

    public static RequestSpecification spec;

    public static void setUp(){

        spec= new RequestSpecBuilder().addHeader("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtYXJrX3R3YWluIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2ODYwNDU4MDl9.JPYtaoFHUOHR5IorxeakBf0q2m1olF8KRKKjNXxD2JXv4EeqoQMwQyiAu68t76f9JulvQ3SK8kN96WtvF5GGng")
                .setBaseUri("https://medunna.com").build();

    }

}
