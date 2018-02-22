
package com.nhnent.simple.springjaxb.protocol;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nhnent.simple.springjaxb.protocol package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nhnent.simple.springjaxb.protocol
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserDataType }
     * 
     */
    public UserDataType createUserDataType() {
        return new UserDataType();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link UserDataType.Phone }
     * 
     */
    public UserDataType.Phone createUserDataTypePhone() {
        return new UserDataType.Phone();
    }

}
