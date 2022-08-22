package com.concretepage;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.concretepage.service.Animal;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@ActiveProfiles({"prod","animal_prod"})
public class ActiveProfileTest {
    @Autowired
    private Animal animal;	
	@Autowired
	private TestRestTemplate restTemplate;
	@Test
	public void serviceTest() {
		String message = animal.getMessage();
		assertThat(message).isEqualTo("Hello Lion!");
	}
	@Test
	public void webAppTest() {
		String url = "http://localhost:8585/spring-boot-prod/";
		String body = this.restTemplate.getForObject(url, String.class);
		assertThat(body).isEqualTo("Hello Lion!");
	}
}