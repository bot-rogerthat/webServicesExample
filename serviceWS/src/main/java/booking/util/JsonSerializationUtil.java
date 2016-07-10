package booking.util;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public final class JsonSerializationUtil {

    public static String serialize(Object obj) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(obj);
    }

    public static Object deserialize(String string, Class<?> classType) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(string, classType);
    }
}
