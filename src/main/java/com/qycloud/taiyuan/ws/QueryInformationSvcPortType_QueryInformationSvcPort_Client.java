
package com.qycloud.taiyuan.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-07-14T10:30:06.338+08:00
 * Generated source version: 3.0.0
 * 
 */
public final class QueryInformationSvcPortType_QueryInformationSvcPort_Client {

    private static final QName SERVICE_NAME = new QName("http://rockontrol.com/oup/service/QueryInformationSvc", "queryInformationSvc");

    private QueryInformationSvcPortType_QueryInformationSvcPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = QueryInformationSvc.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        QueryInformationSvc ss = new QueryInformationSvc(wsdlURL, SERVICE_NAME);
        QueryInformationSvcPortType port = ss.getQueryInformationSvcPort();  
        
        {
        System.out.println("Invoking queryOrgsBySysname...");
        java.lang.String _queryOrgsBySysname_sysName = "";
        java.lang.String _queryOrgsBySysname__return = port.queryOrgsBySysname(_queryOrgsBySysname_sysName);
        System.out.println("queryOrgsBySysname.result=" + _queryOrgsBySysname__return);


        }
        {
        System.out.println("Invoking queryJobUserBySysname...");
        java.lang.String _queryJobUserBySysname_sysName = "";
        java.lang.String _queryJobUserBySysname__return = port.queryJobUserBySysname(_queryJobUserBySysname_sysName);
        System.out.println("queryJobUserBySysname.result=" + _queryJobUserBySysname__return);


        }
        {
        System.out.println("Invoking queryTheOrg...");
        java.lang.String _queryTheOrg_sysName = "";
        java.lang.String _queryTheOrg_oid = "";
        java.lang.String _queryTheOrg__return = port.queryTheOrg(_queryTheOrg_sysName, _queryTheOrg_oid);
        System.out.println("queryTheOrg.result=" + _queryTheOrg__return);


        }
        {
        System.out.println("Invoking updateUserPwd...");
        java.lang.String _updateUserPwd_jsonStr = "";
        java.lang.Boolean _updateUserPwd__return = port.updateUserPwd(_updateUserPwd_jsonStr);
        System.out.println("updateUserPwd.result=" + _updateUserPwd__return);


        }
        
        /****
         * 接口 
         * 2.1.2.1	查询组织机构信息
         * json 成功
         * null 失败
         */
        
        {
        System.out.println("Invoking queryOrgs...");
        java.lang.String _queryOrgs_oid = "";
        java.lang.String _queryOrgs__return = port.queryOrgs(_queryOrgs_oid);
        System.out.println("queryOrgs.result=" + _queryOrgs__return);


        }
        /**
         * 接口
         * 2.1.2.2	查询用户信息
         */
        
        {
        System.out.println("Invoking queryUsers...");
        java.lang.String _queryUsers_oid = "";
        java.lang.String _queryUsers__return = port.queryUsers(_queryUsers_oid);
        System.out.println("queryUsers.result=" + _queryUsers__return);


        }
        {
        System.out.println("Invoking queryTheUser...");
        java.lang.String _queryTheUser_sysName = "";
        java.lang.String _queryTheUser_loginName = "";
        java.lang.String _queryTheUser__return = port.queryTheUser(_queryTheUser_sysName, _queryTheUser_loginName);
        System.out.println("queryTheUser.result=" + _queryTheUser__return);


        }
        {
        System.out.println("Invoking queryUsersBySysname...");
        java.lang.String _queryUsersBySysname_sysName = "";
        java.lang.String _queryUsersBySysname__return = port.queryUsersBySysname(_queryUsersBySysname_sysName);
        System.out.println("queryUsersBySysname.result=" + _queryUsersBySysname__return);


        }

        System.exit(0);
    }

}
