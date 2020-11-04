package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* compiled from: FragmentFactory */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final a.e.g<String, Class<?>> f1528a = new a.e.g<>();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Class<?> cls = f1528a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f1528a.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        } catch (ClassCastException e3) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e3);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
