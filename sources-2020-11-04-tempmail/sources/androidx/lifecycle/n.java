package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Lifecycling */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class<?>, Integer> f1686a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<Class<?>, List<Constructor<? extends e>>> f1687b = new HashMap();

    private static e a(Constructor<? extends e> constructor, Object obj) {
        try {
            return (e) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static Constructor<? extends e> b(Class<?> cls) {
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

    private static int d(Class<?> cls) {
        Integer num = f1686a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = g(cls);
        f1686a.put(cls, Integer.valueOf(g));
        return g;
    }

    private static boolean e(Class<?> cls) {
        return cls != null && j.class.isAssignableFrom(cls);
    }

    static i f(Object obj) {
        boolean z = obj instanceof i;
        boolean z2 = obj instanceof d;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((d) obj, (i) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((d) obj, (i) null);
        }
        if (z) {
            return (i) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f1687b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a((Constructor) list.get(0), obj));
        }
        e[] eVarArr = new e[list.size()];
        for (int i = 0; i < list.size(); i++) {
            eVarArr[i] = a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(eVarArr);
    }

    private static int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends e> b2 = b(cls);
        if (b2 != null) {
            f1687b.put(cls, Collections.singletonList(b2));
            return 2;
        } else if (b.f1663c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                if (d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f1687b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (e(cls2)) {
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f1687b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f1687b.put(cls, arrayList);
            return 2;
        }
    }
}
