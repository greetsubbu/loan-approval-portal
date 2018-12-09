package com.westbank.ws.business.loanfile._2018._06;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-12-09T13:02:34.864+11:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "LoanFile",
                  targetNamespace = "urn:com:westbank:ws:business:LoanFile:2018:06")
public class LoanFile_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:com:westbank:ws:business:LoanFile:2018:06", "LoanFile");
    public final static QName LoanFilePort = new QName("urn:com:westbank:ws:business:LoanFile:2018:06", "LoanFilePort");
    static {
        WSDL_LOCATION = null;
    }

    public LoanFile_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LoanFile_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoanFile_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public LoanFile_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LoanFile_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LoanFile_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns LoanFile
     */
    @WebEndpoint(name = "LoanFilePort")
    public LoanFile getLoanFilePort() {
        return super.getPort(LoanFilePort, LoanFile.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoanFile
     */
    @WebEndpoint(name = "LoanFilePort")
    public LoanFile getLoanFilePort(WebServiceFeature... features) {
        return super.getPort(LoanFilePort, LoanFile.class, features);
    }

}
