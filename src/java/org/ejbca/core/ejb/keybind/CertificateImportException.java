/*************************************************************************
 *                                                                       *
 *  EJBCA: The OpenSource Certificate Authority                          *
 *                                                                       *
 *  This software is free software; you can redistribute it and/or       *
 *  modify it under the terms of the GNU Lesser General Public           *
 *  License as published by the Free Software Foundation; either         *
 *  version 2.1 of the License, or any later version.                    *
 *                                                                       *
 *  See terms of license at gnu.org.                                     *
 *                                                                       *
 *************************************************************************/
package org.ejbca.core.ejb.keybind;

import org.cesecore.ErrorCode;
import org.ejbca.core.EjbcaException;

/**
 * An exception thrown when someone tries to import a Certificate that is not compatible with an InternalKeyBinding implementation.
 *
 * @version $Id$
 */
public class CertificateImportException extends EjbcaException {

    private static final long serialVersionUID = 1L;
    private static final String _CERTIFICATE_IMPORT = "CERTIFICATE_IMPORT";
    public static final ErrorCode CERTIFICATE_IMPORT = ErrorCode.NOT_SPECIFIED;
    {
        // Work-around for a not so convenient API
        CERTIFICATE_IMPORT.setInternalErrorCode(_CERTIFICATE_IMPORT);
    }

    /** Creates a new instance of <code>CertificateImportException</code> without detail message. */
    public CertificateImportException() {
        super(CERTIFICATE_IMPORT);
    }

    /**
     * Constructs an instance of <code>CertificateImportException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public CertificateImportException(String msg) {
        super(CERTIFICATE_IMPORT, msg);
    }

    /**
     * Constructs an instance of <code>CertificateImportException</code> with the specified detail message.
     * @param exception the exception that caused this
     */
    public CertificateImportException(Exception exception) {
        super(CERTIFICATE_IMPORT, exception);
    }

    /**
     * Constructs an instance of <code>CertificateImportException</code> with the specified detail message.
     * @param msg the detail message.
     * @param exception the exception that caused this
     */
    public CertificateImportException(String msg, Exception e) {
        super(CERTIFICATE_IMPORT, msg, e);
    }
}