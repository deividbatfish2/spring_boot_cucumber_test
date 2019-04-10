package br.com.deivid.demoTest.baseIntegrationTest;

import br.com.deivid.demoTest.DemoTestApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = DemoTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration
public class SpringIntegrationTest {
}
