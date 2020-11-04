package android.org.apache.commons.lang3.f;

import java.io.Serializable;
import java.util.Map;

/* compiled from: Pair */
public abstract class a<L, R> implements Map.Entry<L, R>, Comparable<a<L, R>>, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!android.org.apache.commons.lang3.a.a(getKey(), entry.getKey()) || !android.org.apache.commons.lang3.a.a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int compareTo(a<L, R> aVar) {
        android.org.apache.commons.lang3.e.a aVar2 = new android.org.apache.commons.lang3.e.a();
        aVar2.g(g(), aVar.g());
        aVar2.g(h(), aVar.h());
        return aVar2.u();
    }

    public abstract L g();

    public final L getKey() {
        return g();
    }

    public R getValue() {
        return h();
    }

    public abstract R h();

    public int hashCode() {
        int i = 0;
        int hashCode = getKey() == null ? 0 : getKey().hashCode();
        if (getValue() != null) {
            i = getValue().hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(g());
        sb.append(',');
        sb.append(h());
        sb.append(')');
        return sb.toString();
    }
}
