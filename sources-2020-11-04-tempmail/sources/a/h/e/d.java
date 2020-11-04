package a.h.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.c.c;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl */
class d extends h {

    /* renamed from: b  reason: collision with root package name */
    private static Class f258b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Constructor f259c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f260d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Method f261e = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f262f = false;

    d() {
    }

    private static boolean j(Object obj, String str, int i, boolean z) {
        m();
        try {
            return ((Boolean) f260d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface k(Object obj) {
        m();
        try {
            Object newInstance = Array.newInstance(f258b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f261e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File l(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void m() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f262f) {
            f262f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            f259c = constructor;
            f258b = cls;
            f260d = method;
            f261e = method2;
        }
    }

    private static Object n() {
        m();
        try {
            return f259c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Typeface b(Context context, c.b bVar, Resources resources, int i) {
        Object n = n();
        c.C0040c[] a2 = bVar.a();
        int length = a2.length;
        int i2 = 0;
        while (i2 < length) {
            c.C0040c cVar = a2[i2];
            File e2 = i.e(context);
            if (e2 == null) {
                return null;
            }
            try {
                if (!i.c(e2, resources, cVar.b())) {
                    e2.delete();
                    return null;
                } else if (!j(n, e2.getPath(), cVar.e(), cVar.f())) {
                    return null;
                } else {
                    e2.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e2.delete();
            }
        }
        return k(n);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0058, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005c, code lost:
        if (r5 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0066, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface c(android.content.Context r4, android.os.CancellationSignal r5, a.h.h.b.f[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            a.h.h.b$f r6 = r3.h(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.c()     // Catch:{ IOException -> 0x0067 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x0067 }
            if (r5 != 0) goto L_0x0020
            if (r5 == 0) goto L_0x001f
            r5.close()     // Catch:{ IOException -> 0x0067 }
        L_0x001f:
            return r1
        L_0x0020:
            java.io.File r6 = r3.l(r5)     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0037
            boolean r7 = r6.canRead()     // Catch:{ all -> 0x0059 }
            if (r7 != 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch:{ all -> 0x0059 }
            if (r5 == 0) goto L_0x0036
            r5.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0036:
            return r4
        L_0x0037:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0059 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x0059 }
            r6.<init>(r7)     // Catch:{ all -> 0x0059 }
            android.graphics.Typeface r4 = super.d(r4, r6)     // Catch:{ all -> 0x004d }
            r6.close()     // Catch:{ all -> 0x0059 }
            if (r5 == 0) goto L_0x004c
            r5.close()     // Catch:{ IOException -> 0x0067 }
        L_0x004c:
            return r4
        L_0x004d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x004f }
        L_0x004f:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0059 }
        L_0x0058:
            throw r7     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005b }
        L_0x005b:
            r6 = move-exception
            if (r5 == 0) goto L_0x0066
            r5.close()     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0067 }
        L_0x0066:
            throw r6     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.e.d.c(android.content.Context, android.os.CancellationSignal, a.h.h.b$f[], int):android.graphics.Typeface");
    }
}
