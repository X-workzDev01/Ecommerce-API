package com.netzwerk.ecommerce.util;

public class TallyXmlPayloadBuilder {

    public static String createLedgerRequest() {
        return "<ENVELOPE>" +
                " <HEADER>" +
                "  <TALLYREQUEST>Export Data</TALLYREQUEST>" +
                " </HEADER>" +
                " <BODY>" +
                "  <EXPORTDATA>" +
                "   <REQUESTDESC>" +
                "    <REPORTNAME>SAMPLE GROUP REPORT</REPORTNAME>" +
                "   </REQUESTDESC>" +
                "  </EXPORTDATA>" +
                " </BODY>" +
                "</ENVELOPE>";
    }

    // Add more methods for different XML requests as needed
}
