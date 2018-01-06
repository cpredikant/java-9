package de.cpredikant.java9.collectionfactories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class CollectionFactories {

    private static final Logger LOGGER = LoggerFactory.getLogger(CollectionFactories.class);


    public void useCollectionfactories() {

        // Used a factory
        Set<String> aSet = Set.of("A", "B", "C");

        //But its immutable.
        try {
            aSet.add("D");
        } catch (UnsupportedOperationException e) {
            LOGGER.error("Adding to a collection build with a Collectionfactory ist not allowed");
        }


    }
}
