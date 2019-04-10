package br.com.deivid.demoTest.controller;

import br.com.deivid.demoTest.baseIntegrationTest.SpringIntegrationTest;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public class VersionControllerTest extends SpringIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private ResponseEntity<String> response;

    @Quando("^o cliente chama /versao$")
    public void o_cliente_chama_get_version() {
        response = this.restTemplate.exchange("/versao", HttpMethod.GET, null, String.class);
    }

    @Então("^o cliente recebe o status code (\\d+)$")
    public void o_cliente_recebe_o_status_code(int statusCode) {
        Assert.assertTrue(response.getStatusCode().is2xxSuccessful());
    }

    @E("^a versao (.+)$")
    public void a_versao(String versao) {

        Assert.assertTrue(response.getBody().contains(versao));
    }

    @Quando("^o cliente chama /versao/too$")
    public void o_cliente_chama_get_version_too() {
        response = this.restTemplate.exchange("/versao/too", HttpMethod.GET, null, String.class);
    }
}
