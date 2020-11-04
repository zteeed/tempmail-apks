package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzdsk {
    @NullableDecl

    /* renamed from: a  reason: collision with root package name */
    private static final Object f8365a;

    static {
        Object c2 = c();
        f8365a = c2;
        if (c2 != null) {
            b("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (f8365a != null) {
            d();
        }
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        zzeea.a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @NullableDecl
    private static Method b(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    private static Object c() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    private static Method d() {
        try {
            Method b2 = b("getStackTraceDepth", Throwable.class);
            if (b2 == null) {
                return null;
            }
            b2.invoke(c(), new Object[]{new Throwable()});
            return b2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static void e(Throwable th) {
        zzdsh.b(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @Deprecated
    public static RuntimeException f(Throwable th) {
        e(th);
        throw new RuntimeException(th);
    }
}
