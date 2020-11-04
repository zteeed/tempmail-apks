package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private final b f1707a;

    /* renamed from: b  reason: collision with root package name */
    private final y f1708b;

    /* compiled from: ViewModelProvider */
    public static class a extends d {

        /* renamed from: c  reason: collision with root package name */
        private static a f1709c;

        /* renamed from: b  reason: collision with root package name */
        private Application f1710b;

        public a(Application application) {
            this.f1710b = application;
        }

        public static a c(Application application) {
            if (f1709c == null) {
                f1709c = new a(application);
            }
            return f1709c;
        }

        public <T extends w> T a(Class<T> cls) {
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                return (w) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f1710b});
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }
    }

    /* compiled from: ViewModelProvider */
    public interface b {
        <T extends w> T a(Class<T> cls);
    }

    /* compiled from: ViewModelProvider */
    static abstract class c extends e implements b {
        c() {
        }

        public <T extends w> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends w> T c(String str, Class<T> cls);
    }

    /* compiled from: ViewModelProvider */
    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        private static d f1711a;

        static d b() {
            if (f1711a == null) {
                f1711a = new d();
            }
            return f1711a;
        }

        public <T extends w> T a(Class<T> cls) {
            try {
                return (w) cls.newInstance();
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    /* compiled from: ViewModelProvider */
    static class e {
        e() {
        }

        /* access modifiers changed from: package-private */
        public void b(w wVar) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x(androidx.lifecycle.z r3) {
        /*
            r2 = this;
            androidx.lifecycle.y r0 = r3.B()
            boolean r1 = r3 instanceof androidx.lifecycle.f
            if (r1 == 0) goto L_0x000f
            androidx.lifecycle.f r3 = (androidx.lifecycle.f) r3
            androidx.lifecycle.x$b r3 = r3.u()
            goto L_0x0013
        L_0x000f:
            androidx.lifecycle.x$d r3 = androidx.lifecycle.x.d.b()
        L_0x0013:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.x.<init>(androidx.lifecycle.z):void");
    }

    public <T extends w> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends w> T b(String str, Class<T> cls) {
        T t;
        T b2 = this.f1708b.b(str);
        if (cls.isInstance(b2)) {
            b bVar = this.f1707a;
            if (bVar instanceof e) {
                ((e) bVar).b(b2);
            }
            return b2;
        }
        b bVar2 = this.f1707a;
        if (bVar2 instanceof c) {
            t = ((c) bVar2).c(str, cls);
        } else {
            t = bVar2.a(cls);
        }
        this.f1708b.d(str, t);
        return t;
    }

    public x(y yVar, b bVar) {
        this.f1707a = bVar;
        this.f1708b = yVar;
    }
}
