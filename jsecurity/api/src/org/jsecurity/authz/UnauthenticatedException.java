/*
 * Copyright (C) 2005 Les Hazlewood
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the
 *
 * Free Software Foundation, Inc.
 * 59 Temple Place, Suite 330
 * Boston, MA 02111-1307
 * USA
 *
 * Or, you may view it online at
 * http://www.opensource.org/licenses/lgpl-license.php
 */
package org.jsecurity.authz;

/**
 * Exception thrown when attempting to execute an authorization action when a successful
 * authentication hasn't yet occurred.
 *
 * <p>Authorizations can only be performed after a successful
 * authentication because authorization data (roles, permissions, etc) must always be associated
 * with a known identity.  Such a known identity can only be obtained upon a successful log-in.
 *
 * @since 1.0
 * @author Les Hazlewood
 */
public class UnauthenticatedException extends AuthorizationException {

    /**
     * Creates a new UnauthenticatedException.
     */
    public UnauthenticatedException() {
        super();
    }

    /**
     * Constructs a new UnauthenticatedException.
     * @param message the reason for the exception
     */
    public UnauthenticatedException( String message ) {
        super( message );
    }

    /**
     * Constructs a new UnauthenticatedException.
     * @param cause the underlying Throwable that caused this exception to be thrown.
     */
    public UnauthenticatedException( Throwable cause ) {
        super( cause );
    }

    /**
     * Constructs a new UnauthenticatedException.
     * @param message the reason for the exception
     * @param cause the underlying Throwable that caused this exception to be thrown.
     */
    public UnauthenticatedException( String message, Throwable cause ) {
        super( message, cause );
    }

}
