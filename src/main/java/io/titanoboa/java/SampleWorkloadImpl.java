package io.titanoboa.java;

import clojure.lang.PersistentArrayMap;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by miro on 11/26/18.
 */
public class SampleWorkloadImpl implements IWorkloadFn {
    public Object invoke(Map properties) {
        String name = (String) properties.get("name");
        String greeting = "Hello " + name  + "!";
        HashMap propertiesToReturn = new HashMap ();
        propertiesToReturn.put ("greeting" , greeting);
        return PersistentArrayMap.create(propertiesToReturn);
    }
}
