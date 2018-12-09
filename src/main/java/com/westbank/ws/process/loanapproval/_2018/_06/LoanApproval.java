package com.westbank.ws.process.loanapproval._2018._06;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-12-09T13:02:34.448+11:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "urn:com:westbank:ws:process:LoanApproval:2018:06", name = "LoanApproval")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LoanApproval {

    @WebMethod
    @Oneway
    public void processedByStaff(
        @WebParam(partName = "request", name = "StaffIdentity", targetNamespace = "urn:com:westbank:ws:process:LoanApproval:2018:06")
        StaffIdentity request
    );

    @WebMethod
    @Oneway
    public void informedByCustomer(
        @WebParam(partName = "request", name = "CustomerDecision", targetNamespace = "urn:com:westbank:ws:process:LoanApproval:2018:06")
        CustomerDecision request
    );

    @WebMethod
    @Oneway
    public void signedByManager(
        @WebParam(partName = "request", name = "ManagerSignature", targetNamespace = "urn:com:westbank:ws:process:LoanApproval:2018:06")
        ManagerSignature request
    );

    @WebMethod
    @Oneway
    public void start(
        @WebParam(partName = "request", name = "LoanApprovalRequest", targetNamespace = "urn:com:westbank:ws:process:LoanApproval:2018:06")
        LoanApprovalRequest request
    );

    @WebMethod
    @Oneway
    public void decidedByManager(
        @WebParam(partName = "request", name = "ManagerDecision", targetNamespace = "urn:com:westbank:ws:process:LoanApproval:2018:06")
        ManagerDecision request
    );
}
