package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewModel */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f1705a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f1706b = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f1706b = true;
        Map<String, Object> map = this.f1705a;
        if (map != null) {
            synchronized (map) {
                for (Object b2 : this.f1705a.values()) {
                    b(b2);
                }
            }
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public <T> T c(String str) {
        T t;
        Map<String, Object> map = this.f1705a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f1705a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    /* access modifiers changed from: package-private */
    public <T> T e(String str, T t) {
        T t2;
        synchronized (this.f1705a) {
            t2 = this.f1705a.get(str);
            if (t2 == null) {
                this.f1705a.put(str, t);
            }
        }
        if (t2 != null) {
            t = t2;
        }
        if (this.f1706b) {
            b(t);
        }
        return t;
    }
}
