//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.13 at 11:17:12 PM CEST 
//


package com.tibco.exchange.tibreview.model.rules;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tibco.exchange.tibreview package. 
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

    private final static QName _Tibrules_QNAME = new QName("exchange.tibco.com/tibreview", "tibrules");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tibco.exchange.tibreview
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tibrules }
     * 
     */
    public Tibrules createTibrules() {
        return new Tibrules();
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link Rule }
     * 
     */
    public Rule createRule() {
        return new Rule();
    }

    /**
     * Create an instance of {@link Cond }
     * 
     */
    public Cond createCond() {
        return new Cond();
    }

    /**
     * Create an instance of {@link Xpathfunctions }
     * 
     */
    public Xpathfunctions createXpathfunctions() {
        return new Xpathfunctions();
    }

    /**
     * Create an instance of {@link Impl }
     * 
     */
    public Impl createImpl() {
        return new Impl();
    }

    /**
     * Create an instance of {@link Not }
     * 
     */
    public Not createNot() {
        return new Not();
    }

    /**
     * Create an instance of {@link Xpath }
     * 
     */
    public Xpath createXpath() {
        return new Xpath();
    }

    /**
     * Create an instance of {@link Java }
     * 
     */
    public Java createJava() {
        return new Java();
    }

    /**
     * Create an instance of {@link Else }
     * 
     */
    public Else createElse() {
        return new Else();
    }

    /**
     * Create an instance of {@link Elseif }
     * 
     */
    public Elseif createElseif() {
        return new Elseif();
    }

    /**
     * Create an instance of {@link Xpathfunction }
     * 
     */
    public Xpathfunction createXpathfunction() {
        return new Xpathfunction();
    }

    /**
     * Create an instance of {@link If }
     * 
     */
    public If createIf() {
        return new If();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tibrules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "exchange.tibco.com/tibreview", name = "tibrules")
    public JAXBElement<Tibrules> createTibrules(Tibrules value) {
        return new JAXBElement<Tibrules>(_Tibrules_QNAME, Tibrules.class, null, value);
    }

}
