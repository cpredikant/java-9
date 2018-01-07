package de.cpredikant.java9;

import de.cpredikant.java9.collectionfactories.CollectionFactories;
import de.cpredikant.java9.privateinterface.WithPrivateMethodImpl;
import de.cpredikant.java9.privateinterface.WithPrivateMethodInterface;
import de.cpredikant.java9.streams.StreamFeatures;

public class Java9 {

    public static void main (String[] args){
        CollectionFactories cf = new CollectionFactories();
        cf.useCollectionfactories();

        StreamFeatures sf = new StreamFeatures();
        sf.betterIteration();
        sf.optionalStreams();

        WithPrivateMethodInterface wpm = new WithPrivateMethodImpl();
        wpm.normalInterfaceMethod();
        wpm.interfaceMethodWithDefault();
        wpm.anotherDefaultMethod();

    }
}