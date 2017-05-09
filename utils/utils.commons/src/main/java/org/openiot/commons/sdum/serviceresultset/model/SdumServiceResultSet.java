//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.13 at 04:10:11 
//


package org.openiot.commons.sdum.serviceresultset.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.openiot.commons.sparql.protocoltypes.model.QueryResult;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:openiot:sdum:serviceresultset:xsd:1}requestPresentation"/>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.w3.org/2007/SPARQL/protocol-types#}query-result" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestPresentation",
    "queryResult"
})
@XmlRootElement(name = "SdumServiceResultSet")
public class SdumServiceResultSet {

    @XmlElement(required = true)
    protected RequestPresentation requestPresentation;
    @XmlElement(name = "query-result", namespace = "http://www.w3.org/2007/SPARQL/protocol-types#", required = true)
    protected List<QueryResult> queryResult;

    /**
     * Gets the value of the requestPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link RequestPresentation }
     *     
     */
    public RequestPresentation getRequestPresentation() {
        return requestPresentation;
    }

    /**
     * Sets the value of the requestPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestPresentation }
     *     
     */
    public void setRequestPresentation(RequestPresentation value) {
        this.requestPresentation = value;
    }

    /**
     * Gets the value of the queryResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryResult }
     * 
     * 
     */
    public List<QueryResult> getQueryResult() {
        if (queryResult == null) {
            queryResult = new ArrayList<QueryResult>();
        }
        return this.queryResult;
    }

}
