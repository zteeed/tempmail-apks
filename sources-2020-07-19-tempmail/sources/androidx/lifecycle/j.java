package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Lifecycling */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class, Integer> f1624a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<Class, List<Constructor<? extends c>>> f1625b = new HashMap();

    private static c a(Constructor<? extends c> constructor, Object obj) {
        try {
            return (c) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static Constructor<? extends c> b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c2 = c(canonicalName);
            if (!name.isEmpty()) {
                c2 = name + "." + c2;
            }
            Constructor<?> declaredConstructor = Class.forName(c2).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    static d d(Object obj) {
        if (obj instanceof b) {
            return new FullLifecycleObserverAdapter((b) obj);
        }
        if (obj instanceof d) {
            return (d) obj;
        }
        Class<?> cls = obj.getClass();
        if (e(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f1625b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a((Constructor) list.get(0), obj));
        }
        c[] cVarArr = new c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    private static int e(Class<?> cls) {
        if (f1624a.containsKey(cls)) {
            return f1624a.get(cls).intValue();
        }
        int g = g(cls);
        f1624a.put(cls, Integer.valueOf(g));
        return g;
    }

    private static boolean f(Class<?> cls) {
        return cls != null && f.class.isAssignableFrom(cls);
    }

    private static int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends c> b2 = b(cls);
        if (b2 != null) {
            f1625b.put(cls, Collections.singletonList(b2));
            return 2;
        } else if (a.f1602c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (f(superclass)) {
                if (e(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f1625b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (f(cls2)) {
                    if (e(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f1625b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f1625b.put(cls, arrayList);
            return 2;
        }
    }
}
