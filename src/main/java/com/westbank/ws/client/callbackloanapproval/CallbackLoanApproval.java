package com.westbank.ws.client.callbackloanapproval;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-12-09T13:02:33.906+11:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "urn:com:westbank:ws:client:CallbackLoanApproval", name = "CallbackLoanApproval")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CallbackLoanApproval {

    @WebMethod
    @Oneway
    public void notify(
        @WebParam(partName = "request", name = "CallbackLoanApprovalRequest", targetNamespace = "urn:com:westbank:ws:client:CallbackLoanApproval")
        CallbackLoanApprovalRequest request
    );
}
