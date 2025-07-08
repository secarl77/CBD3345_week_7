
package c0917329.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelper {
    public static String toJson(Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            return "{}";
        }
    }
}
