package com.chengjs.cjsssmsweb.components.cxf.WS2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * HelloService: TODO 未完成还有些没弄懂,这个类应当是cxf根据wsdl生成的
 *
 * @author: <a href="mailto:chengjs_minipa@outlook.com">chengjs_minipa</a>, version:1.0.0, 2017/9/2
 */
@WebService(name = "HelloService", targetNamespace = "http://ws.itcast.cn/")
@XmlSeeAlso({

})
public interface HelloService {

  /**
   * This class was generated by the JAX-WS RI.
   * JAX-WS RI 2.1.6 in JDK 6
   * Generated source version: 2.1
   *
   * @param arg0
   * @return
   *     returns java.lang.String
   */
  @WebMethod
  @WebResult(targetNamespace = "")
  @RequestWrapper(localName = "sayHello", targetNamespace = "http://ws.itcast.cn/", className = "cn.itcast.ws.client.SayHello")
  @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://ws.itcast.cn/", className = "cn.itcast.ws.client.SayHelloResponse")
  public String sayHello(@WebParam(name = "arg0", targetNamespace = "") String arg0);

}