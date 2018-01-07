package de.cpredikant.java9.privateinterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WithPrivateMethodImpl implements WithPrivateMethodInterface {

    private static final Logger LOGGER = LoggerFactory.getLogger(WithPrivateMethodImpl.class);

    @Override
    public void normalInterfaceMethod() {
        LOGGER.info("Has to be implemented by hand.");
    }

    @Override
    public void interfaceMethodWithDefault() {
        LOGGER.info("Implementing by hand not necessary but i have done it. It calls not init form Interface");
    }


}
