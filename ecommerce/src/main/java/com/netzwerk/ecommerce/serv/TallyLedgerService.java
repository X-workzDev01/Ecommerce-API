package com.netzwerk.ecommerce.serv;

//import org.apache.commons.lang.StringUtils;
//import org.apache.log4j.Logger;
//import org.jss.http.client.HttpClient;
import com.netzwerk.ecommerce.builder.RequestBuilder;
import com.netzwerk.ecommerce.dto.Ledger;
import com.netzwerk.ecommerce.dto.TallyResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.net.http.HttpClient;
import java.util.Properties;
import java.util.logging.Logger;

@Service
public class TallyLedgerService {

    private RequestBuilder requestBuilder;
    private HttpClient httpClient;
    Logger logger = Logger.getLogger("TallyLedgerService.class");


    private Properties tallyServiceProperties;

    @Autowired
    public TallyLedgerService(RequestBuilder requestBuilder, HttpClient httpClient, @Qualifier("tallyServiceProperties") Properties tallyServiceProperties) {
        this.requestBuilder = requestBuilder;
        this.httpClient = httpClient;
        this.tallyServiceProperties = tallyServiceProperties;
    }

    public void createLedger(Ledger ledger) {
        if(StringUtils.isBlank(ledger.getCompany())) {
            ledger = addDefaultCompanyInformation(ledger);
        }
        String requestXml = requestBuilder.buildNewLedgerRequest(ledger);
        String url = tallyServiceProperties.getProperty("tallyUrl");
        TallyResponse response = new TallyResponse(httpClient.send(url, requestXml));
        if (!response.isSuccess()) throw new RuntimeException("Error creating patient" + response.getError());
    }

    private Ledger addDefaultCompanyInformation(Ledger ledger) {
        String defaultCompany = tallyServiceProperties.getProperty("defaultTallyCompany");
        logger.info("Setting company name to " + defaultCompany);
        return new Ledger(ledger.getPatientName(), ledger.getPatientId(), defaultCompany);
    }
}