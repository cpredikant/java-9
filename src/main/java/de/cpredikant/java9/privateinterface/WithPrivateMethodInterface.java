package de.cpredikant.java9.privateinterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface WithPrivateMethodInterface {

    final Logger LOGGER = LoggerFactory.getLogger(WithPrivateMethodInterface.class);

    void normalInterfaceMethod();

    default void interfaceMethodWithDefault() {  init(); }

    default void anotherDefaultMethod() {
        LOGGER.info("Default implementation in interface calling a private method.");
        init();
    }

    // This method is not part of the public API exposed by MyInterface
    private void init() { LOGGER.info("Private method in Interface."); }
}
