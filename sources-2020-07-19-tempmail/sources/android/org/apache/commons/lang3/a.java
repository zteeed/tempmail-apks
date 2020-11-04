package android.org.apache.commons.lang3;

import java.io.Serializable;

/* compiled from: ObjectUtils */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0030a f650a = new C0030a();

    /* renamed from: android.org.apache.commons.lang3.a$a  reason: collision with other inner class name */
    /* compiled from: ObjectUtils */
    public static class C0030a implements Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        C0030a() {
        }

        private Object readResolve() {
            return a.f650a;
        }
    }

    @Deprecated
    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }
}
