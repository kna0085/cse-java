//
//  WPCSEInvalidPublicKey.java
//  WorldpayCSE
//
//  Created by Alexandru Catariov on 23/07/2015.
//  Copyright (c) 2015 WorldPay. All rights reserved.
//
//  License information can be found in the LICENSE file

package com.worldpay.clientencryption.exception;

/**
 * Invalid RSA public key exception
 */
public class WPCSEInvalidPublicKey extends WPCSEException {

    public static final String INVALID_PUBLIC_KEY = "Invalid public key";

    public WPCSEInvalidPublicKey() {
        super(INVALID_PUBLIC_KEY);
    }

    public WPCSEInvalidPublicKey(Throwable cause) {
        super(INVALID_PUBLIC_KEY, cause);
    }
}
