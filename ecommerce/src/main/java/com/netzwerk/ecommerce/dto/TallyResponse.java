package com.netzwerk.ecommerce.dto;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.netzwerk.ecommerce.converter.TallyResponseConverter;

public class TallyResponse {
    private boolean created;
    private boolean altered;
    private String error;

    public TallyResponse(String tallyResponse) {
        XStream xStream = new XStream();
        xStream.alias("RESPONSE", TallyResponse.class);
        Annotations.configureAliases(xStream, TallyResponse.class);
        xStream.registerConverter(new TallyResponseConverter());
        xStream.fromXML(tallyResponse, this);
    }

    public void setCreated(boolean created) {
        this.created = created;
    }

    public void setAltered(boolean altered) {
        this.altered = altered;
    }

    public void setError(String error) {
        this.error = error;
    }

    public boolean isSuccess() {
        return created || altered;
    }

    public boolean isAltered() {
        return altered;
    }

    public String getError() {
        return error;
    }

    public boolean isCreated() {
        return created;
    }
}
