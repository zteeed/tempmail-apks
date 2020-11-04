package a.h.e;

import a.e.g;
import a.h.h.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.c.c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl */
class e extends h {

    /* renamed from: b  reason: collision with root package name */
    private static final Class f262b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor f263c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f264d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f265e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method2 = null;
            method = null;
        }
        f263c = constructor;
        f262b = cls;
        f264d = method;
        f265e = method2;
    }

    e() {
    }

    private static boolean j(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f264d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface k(Object obj) {
        try {
            Object newInstance = Array.newInstance(f262b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f265e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean l() {
        if (f264d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f264d != null;
    }

    private static Object m() {
        try {
            return f263c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Typeface b(Context context, c.b bVar, Resources resources, int i) {
        Object m = m();
        if (m == null) {
            return null;
        }
        for (c.C0040c cVar : bVar.a()) {
            ByteBuffer b2 = i.b(context, resources, cVar.b());
            if (b2 == null || !j(m, b2, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        return k(m);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        Object m = m();
        if (m == null) {
            return null;
        }
        g gVar = new g();
        for (b.f fVar : fVarArr) {
            Uri c2 = fVar.c();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(c2);
            if (byteBuffer == null) {
                byteBuffer = i.f(context, cancellationSignal, c2);
                gVar.put(c2, byteBuffer);
            }
            if (byteBuffer == null || !j(m, byteBuffer, fVar.b(), fVar.d(), fVar.e())) {
                return null;
            }
        }
        Typeface k = k(m);
        if (k == null) {
            return null;
        }
        return Typeface.create(k, i);
    }
}
