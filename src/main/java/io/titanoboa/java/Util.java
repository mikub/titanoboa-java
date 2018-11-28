package io.titanoboa.java;

import clojure.java.api.Clojure;
import clojure.lang.Atom;
import clojure.lang.IFn;
import clojure.lang.PersistentVector;

import java.util.List;

/**
 * Created by miro on 11/26/18.
 */
public class Util {

    public static Object getSystemResource(PersistentVector keySequence) {
        //(get-in @titanoboa.system/systems-state data-source-ks)
        IFn deref = Clojure.var("clojure.core", "deref");
        IFn sysStateAtom = Clojure.var("titanoboa.system","systems-state");
        Object sysStateMap = deref.invoke(sysStateAtom);
        IFn getIn = Clojure.var("clojure.core", "get-in");
        return getIn.invoke(sysStateMap, keySequence);
    }

    public static Object getSystemResource(Object[] keySequence) {
     return getSystemResource(PersistentVector.adopt(keySequence));
    }

    public static Object getSystemResource(List keySequence) {
        return getSystemResource(PersistentVector.create(keySequence));
    }
}
