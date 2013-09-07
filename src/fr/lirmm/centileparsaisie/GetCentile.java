
package fr.lirmm.centileparsaisie;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getCentile complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getCentile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valeursSaisies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCentile", propOrder = {
    "valeursSaisies",
    "percentile"
})
public class GetCentile {

    protected String valeursSaisies;
    protected String percentile;

    /**
     * Obtiene el valor de la propiedad valeursSaisies.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValeursSaisies() {
        return valeursSaisies;
    }

    /**
     * Define el valor de la propiedad valeursSaisies.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValeursSaisies(String value) {
        this.valeursSaisies = value;
    }

    /**
     * Obtiene el valor de la propiedad percentile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentile() {
        return percentile;
    }

    /**
     * Define el valor de la propiedad percentile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentile(String value) {
        this.percentile = value;
    }

}
