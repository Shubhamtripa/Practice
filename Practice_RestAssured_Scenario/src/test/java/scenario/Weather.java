package scenario;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Weather {

	@Test
	public void CurrentWeatherTest() {
		given()			 
			.queryParam("q", "London")
			.queryParam("appid", "6c58945753856a52783193a93f1c8281")
		
		.when()
			.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
			.statusCode(200)
			.assertThat().body("name", Matchers.equalTo("London"))
			.log().all();
		
	}

	@Test
	public void ForecastWeatherTest() {
		given()
			.queryParam("q", "Noida")
			.queryParam("appid", "6c58945753856a52783193a93f1c8281")
		
		.when()
			.get("https://api.openweathermap.org/data/2.5/forecast")
		.then()
			.statusCode(200)
			.assertThat().body("list", Matchers.notNullValue());
			//.log().all();
		
	}
	
	@Test
	public void InValidCityWeatherTest() {
		given()
			.queryParam("q", "bkbkb")
			.queryParam("appid", "6c58945753856a52783193a93f1c8281")
		
		.when()
			.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
			.statusCode(404)
			.assertThat().body("message", Matchers.equalTo("city not found"));
			//.log().all();
		
	}

}
