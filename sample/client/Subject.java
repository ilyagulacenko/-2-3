
package sample.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkType" type="{http://asu.dgtu.donetsk.ua/ex/passexam}checkType" minOccurs="0"/>
 *         &lt;element name="hasCourseProject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hoursLabs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hoursLec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hoursTotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subject", propOrder = {
    "checkType",
    "hasCourseProject",
    "hoursLabs",
    "hoursLec",
    "hoursTotal",
    "name"
})
public class Subject {

    @XmlSchemaType(name = "string")
    protected CheckType checkType;
    protected boolean hasCourseProject;
    protected int hoursLabs;
    protected int hoursLec;
    protected int hoursTotal;
    protected String name;

    /**
     * Gets the value of the checkType property.
     * 
     * @return
     *     possible object is
     *     {@link CheckType }
     *     
     */
    public CheckType getCheckType() {
        return checkType;
    }

    /**
     * Sets the value of the checkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckType }
     *     
     */
    public void setCheckType(CheckType value) {
        this.checkType = value;
    }

    /**
     * Gets the value of the hasCourseProject property.
     * 
     */
    public boolean isHasCourseProject() {
        return hasCourseProject;
    }

    /**
     * Sets the value of the hasCourseProject property.
     * 
     */
    public void setHasCourseProject(boolean value) {
        this.hasCourseProject = value;
    }

    /**
     * Gets the value of the hoursLabs property.
     * 
     */
    public int getHoursLabs() {
        return hoursLabs;
    }

    /**
     * Sets the value of the hoursLabs property.
     * 
     */
    public void setHoursLabs(int value) {
        this.hoursLabs = value;
    }

    /**
     * Gets the value of the hoursLec property.
     * 
     */
    public int getHoursLec() {
        return hoursLec;
    }

    /**
     * Sets the value of the hoursLec property.
     * 
     */
    public void setHoursLec(int value) {
        this.hoursLec = value;
    }

    /**
     * Gets the value of the hoursTotal property.
     * 
     */
    public int getHoursTotal() {
        return hoursTotal;
    }

    /**
     * Sets the value of the hoursTotal property.
     * 
     */
    public void setHoursTotal(int value) {
        this.hoursTotal = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
