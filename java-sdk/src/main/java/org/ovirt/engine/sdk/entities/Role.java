//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.11 at 03:29:58 PM IST 
//


package org.ovirt.engine.sdk.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Role complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Role">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseResource">
 *       &lt;sequence>
 *         &lt;element name="mutable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="administrative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="user" type="{}User" minOccurs="0"/>
 *         &lt;element name="permits" type="{}Permits" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Role", propOrder = {
    "mutable",
    "administrative",
    "user",
    "permits"
})
public class Role
    extends BaseResource
{

    protected Boolean mutable;
    protected Boolean administrative;
    protected User user;
    protected Permits permits;

    /**
     * Gets the value of the mutable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMutable() {
        return mutable;
    }

    /**
     * Sets the value of the mutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMutable(Boolean value) {
        this.mutable = value;
    }

    public boolean isSetMutable() {
        return (this.mutable!= null);
    }

    /**
     * Gets the value of the administrative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdministrative() {
        return administrative;
    }

    /**
     * Sets the value of the administrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdministrative(Boolean value) {
        this.administrative = value;
    }

    public boolean isSetAdministrative() {
        return (this.administrative!= null);
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    public boolean isSetUser() {
        return (this.user!= null);
    }

    /**
     * Gets the value of the permits property.
     * 
     * @return
     *     possible object is
     *     {@link Permits }
     *     
     */
    public Permits getPermits() {
        return permits;
    }

    /**
     * Sets the value of the permits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Permits }
     *     
     */
    public void setPermits(Permits value) {
        this.permits = value;
    }

    public boolean isSetPermits() {
        return (this.permits!= null);
    }

}
