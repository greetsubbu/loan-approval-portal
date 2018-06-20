package com.westbank.ws.process.loanapproval._2009._11;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-20T07:00:45.487+10:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "urn:westbank:ws:process:LoanApproval:2009:11", name = "LoanApproval")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface LoanApproval {

    @WebMethod
    @Oneway
    public void start(
        @WebParam(partName = "request", name = "LoanApprovalRequest", targetNamespace = "urn:westbank:ws:process:LoanApproval:2009:11")
        LoanApprovalRequest request
    );

    @WebMethod
    @Oneway
    public void decidedByManager(
        @WebParam(partName = "request", name = "ManagerDecision", targetNamespace = "urn:westbank:ws:process:LoanApproval:2009:11")
        ManagerDecision request
    );

    @WebMethod
    @Oneway
    public void signedByManager(
        @WebParam(partName = "request", name = "ManagerSignature", targetNamespace = "urn:westbank:ws:process:LoanApproval:2009:11")
        ManagerSignature request
    );

    @WebMethod
    @Oneway
    public void processedByStaff(
        @WebParam(partName = "request", name = "StaffIdentity", targetNamespace = "urn:westbank:ws:process:LoanApproval:2009:11")
        StaffIdentity request
    );

    @WebMethod
    @Oneway
    public void informedByCustomer(
        @WebParam(partName = "request", name = "CustomerDecision", targetNamespace = "urn:westbank:ws:process:LoanApproval:2009:11")
        CustomerDecision request
    );
}