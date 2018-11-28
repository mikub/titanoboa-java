package io.titanoboa.java;

import clojure.lang.APersistentMap;

import java.util.Map;

/**
 * Created by miro on 11/25/18.
 */
public interface IWorkloadFn {
    public Object invoke (Map properties);
}
