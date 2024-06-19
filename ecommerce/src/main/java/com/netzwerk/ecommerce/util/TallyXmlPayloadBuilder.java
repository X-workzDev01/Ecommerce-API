package com.netzwerk.ecommerce.util;

public class TallyXmlPayloadBuilder {

    public static String createLedgerRequest() {
        return "<ENVELOPE>" +
                "<HEADER>" +
                "<VERSION>Version Number</VERSION>" +
                "<TALLYREQUEST>Request Type</TALLYREQUEST>" +
                "<TYPE>Information Type</TYPE>" +
                "<SUBTYPE>Sub Type</SUBTYPE>" +
                "<ID >Identifier</ID>" +
                "</HEADER>" +
                "<BODY>" +
                "<DESC>" +
                "<STATICVARIABLES>Static Variables Specification</STATICVARIABLES>" +
                "<REPEATVARIABLES>Repeat Variables Specification</REPEATVARIABLES>" +
                "<FETCHLIST> Fetch Specification</FETCHLIST>" +
                "<FUNCPARAMLIST> Parameter specification in case of function type </FUNCPARAMLIST>" +
                "<TDL>   TDL Information     </TDL>" +
                "</DESC>" +
                "<DATA>  Data (if applicable) </DATA>" +
                "</BODY>" +
                "</ENVELOPE>";
    }

    // Add more methods for different XML requests as needed
}
