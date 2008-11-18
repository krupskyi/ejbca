
package org.ejbca.core.protocol.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.ejbca.core.ErrorCode;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b59-fcs
 * Generated source version: 2.0_01
 * 
 */
@XmlRootElement(name = "CADoesntExistsException", namespace = "http://ws.protocol.core.ejbca.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CADoesntExistsException", namespace = "http://ws.protocol.core.ejbca.org/", propOrder = {
    "errorCode",
    "message"
})
public class CADoesntExistsExceptionBean {

    private ErrorCode errorCode;
    private String message;

    /**
     * 
     * @return
     *     returns ErrorCode
     */
    public ErrorCode getErrorCode() {
        return this.errorCode;
    }

    /**
     * 
     * @param errorCode
     *     the value for the errorCode property
     */
    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * 
     * @param message
     *     the value for the message property
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
