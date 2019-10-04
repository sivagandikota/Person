/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sap.xi.edi.supplier;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.wss4j.common.ext.WSPasswordCallback;
/**
 *
 * @author Sivag
 */
public class ClientPasswordCallback  implements CallbackHandler {
     public void handle(Callback[] callbacks) throws IOException, 
        UnsupportedCallbackException {
 System.out.println("----callback name:"+callbacks[0].getClass().getName());
        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
 
        // set the password for our message.
        pc.setPassword("nBhLsiwWXmfwqmX)FDLRUA6SwdCitAXUswwZwLqX");
    }
}
