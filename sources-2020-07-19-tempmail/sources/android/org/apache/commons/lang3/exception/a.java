package android.org.apache.commons.lang3.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DefaultExceptionContext */
public class a implements b, Serializable {
    private static final long serialVersionUID = 20110706;

    /* renamed from: b  reason: collision with root package name */
    private final List<android.org.apache.commons.lang3.f.a<String, Object>> f656b = new ArrayList();

    public String a(String str) {
        String str2;
        StringBuilder sb = new StringBuilder(256);
        if (str != null) {
            sb.append(str);
        }
        if (this.f656b.size() > 0) {
            if (sb.length() > 0) {
                sb.append(10);
            }
            sb.append("Exception Context:\n");
            int i = 0;
            for (android.org.apache.commons.lang3.f.a next : this.f656b) {
                sb.append("\t[");
                i++;
                sb.append(i);
                sb.append(':');
                sb.append((String) next.getKey());
                sb.append("=");
                Object value = next.getValue();
                if (value == null) {
                    sb.append("null");
                } else {
                    try {
                        str2 = value.toString();
                    } catch (Exception e2) {
                        str2 = "Exception thrown on toString(): " + c.a(e2);
                    }
                    sb.append(str2);
                }
                sb.append("]\n");
            }
            sb.append("---------------------------------");
        }
        return sb.toString();
    }
}
