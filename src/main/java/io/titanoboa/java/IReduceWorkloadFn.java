package io.titanoboa.java;

import java.util.Map;

/**
 * Created by miro on 11/28/18.
 */
public interface IReduceWorkloadFn {
    public Object invoke (Object partialResult, Map nextProperties);
}
