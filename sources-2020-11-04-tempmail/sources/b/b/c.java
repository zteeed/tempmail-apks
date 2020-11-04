package b.b;

import android.os.Build;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    public static JSONObject a(Map<String, ?> map) {
        if (Build.VERSION.SDK_INT >= 19) {
            return new JSONObject(map);
        }
        return b(map);
    }

    public static JSONObject b(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            try {
                jSONObject.put((String) next.getKey(), c(next.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static Object c(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object c2 : (Collection) obj) {
                    jSONArray.put(c(c2));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < length; i++) {
                    jSONArray2.put(c(Array.get(obj, i)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                return b((Map) obj);
            } else {
                return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }
}
