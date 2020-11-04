package a.h.i;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: ICUCompat */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f326a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f327b;

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                if (cls2 != null) {
                    f326a = cls2.getMethod("getScript", new Class[]{cls});
                    f327b = cls2.getMethod("addLikelySubtags", new Class[]{cls});
                }
            } catch (Exception e2) {
                f326a = null;
                f327b = null;
                Log.w("ICUCompat", e2);
            }
        } else if (i < 24) {
            try {
                f327b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    private static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f327b != null) {
                return (String) f327b.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
        }
        return locale2;
    }

    private static String b(String str) {
        try {
            if (f326a != null) {
                return (String) f326a.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
        } catch (InvocationTargetException e3) {
            Log.w("ICUCompat", e3);
        }
        return null;
    }

    public static String c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f327b.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            } catch (IllegalAccessException e3) {
                Log.w("ICUCompat", e3);
                return locale.getScript();
            }
        } else {
            String a2 = a(locale);
            if (a2 != null) {
                return b(a2);
            }
            return null;
        }
    }
}
