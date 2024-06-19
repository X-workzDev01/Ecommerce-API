package com.netzwerk.ecommerce.serv;

import com.netzwerk.ecommerce.util.TallyXmlPayloadBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@Service
public class TallyService {

    private final String TALLY_URL = "http://localhost:9999";

    public String sendRequestToTally(String xmlRequest) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_XML);
        HttpEntity<String> request = new HttpEntity<>(xmlRequest, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(TALLY_URL, request, String.class);
        return response.getBody();
    }

    public String getLedgers() {
        String xmlRequest = TallyXmlPayloadBuilder.createLedgerRequest();
        return sendRequestToTally(xmlRequest);
    }
}
