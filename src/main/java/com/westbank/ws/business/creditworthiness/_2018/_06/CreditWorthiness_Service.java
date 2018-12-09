package com.westbank.ws.business.creditworthiness._2018._06;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-12-09T13:02:35.387+11:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "CreditWorthiness",
                  targetNamespace = "urn:com:westbank:ws:business:CreditWorthiness:2018:06")
public class CreditWorthiness_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:com:westbank:ws:business:CreditWorthiness:2018:06", "CreditWorthiness");
    public final static QName CreditWorthinessPort = new QName("urn:com:westbank:ws:business:CreditWorthiness:2018:06", "CreditWorthinessPort");
    static {
        WSDL_LOCATION = null;
    }

    public CreditWorthiness_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CreditWorthiness_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CreditWorthiness_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CreditWorthiness_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CreditWorthiness_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CreditWorthiness_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CreditWorthiness
     */
    @WebEndpoint(name = "CreditWorthinessPort")
    public CreditWorthiness getCreditWorthinessPort() {
        return super.getPort(CreditWorthinessPort, CreditWorthiness.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreditWorthiness
     */
    @WebEndpoint(name = "CreditWorthinessPort")
    public CreditWorthiness getCreditWorthinessPort(WebServiceFeature... features) {
        return super.getPort(CreditWorthinessPort, CreditWorthiness.class, features);
    }

}
