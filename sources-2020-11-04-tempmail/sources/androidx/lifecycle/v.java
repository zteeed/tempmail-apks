package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: SavedStateViewModelFactory */
public final class v extends x.c {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?>[] f1699f;
    private static final Class<?>[] g;

    /* renamed from: a  reason: collision with root package name */
    private final Application f1700a;

    /* renamed from: b  reason: collision with root package name */
    private final x.a f1701b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f1702c;

    /* renamed from: d  reason: collision with root package name */
    private final g f1703d;

    /* renamed from: e  reason: collision with root package name */
    private final SavedStateRegistry f1704e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.lifecycle.u> r0 = androidx.lifecycle.u.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            f1699f = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r3] = r0
            g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.v.<clinit>():void");
    }

    @SuppressLint({"LambdaLast"})
    public v(Application application, b bVar, Bundle bundle) {
        this.f1704e = bVar.I();
        this.f1703d = bVar.c();
        this.f1702c = bundle;
        this.f1700a = application;
        this.f1701b = x.a.c(application);
    }

    private static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<T> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    public <T extends w> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* access modifiers changed from: package-private */
    public void b(w wVar) {
        SavedStateHandleController.e(wVar, this.f1704e, this.f1703d);
    }

    public <T extends w> T c(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t;
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        if (isAssignableFrom) {
            constructor = d(cls, f1699f);
        } else {
            constructor = d(cls, g);
        }
        if (constructor == null) {
            return this.f1701b.a(cls);
        }
        SavedStateHandleController j = SavedStateHandleController.j(this.f1704e, this.f1703d, str, this.f1702c);
        if (isAssignableFrom) {
            try {
                t = (w) constructor.newInstance(new Object[]{this.f1700a, j.k()});
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to access " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
            }
        } else {
            t = (w) constructor.newInstance(new Object[]{j.k()});
        }
        t.e("androidx.lifecycle.savedstate.vm.tag", j);
        return t;
    }
}
