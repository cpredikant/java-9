package de.cpredikant.java9;

import de.cpredikant.java9.collectionfactories.CollectionFactories;
import de.cpredikant.java9.streams.StreamFeatures;

public class Java9 {

    public static void main (String[] args){
        CollectionFactories cf = new CollectionFactories();
        cf.useCollectionfactories();

        StreamFeatures sf = new StreamFeatures();
        sf.betterIteration();
    }
}