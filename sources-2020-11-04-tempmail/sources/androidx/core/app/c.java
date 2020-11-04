package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BundleCompat */
public final class c {

    /* compiled from: BundleCompat */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Method f1293a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f1294b;

        /* renamed from: c  reason: collision with root package name */
        private static Method f1295c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f1296d;

        public static IBinder a(Bundle bundle, String str) {
            if (!f1294b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f1293a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e2);
                }
                f1294b = true;
            }
            Method method2 = f1293a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e3);
                    f1293a = null;
                }
            }
            return null;
        }

        public static void b(Bundle bundle, String str, IBinder iBinder) {
            if (!f1296d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f1295c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e2);
                }
                f1296d = true;
            }
            Method method2 = f1295c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e3);
                    f1295c = null;
                }
            }
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return a.a(bundle, str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.b(bundle, str, iBinder);
        }
    }
}
