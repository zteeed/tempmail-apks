package androidx.lifecycle;

import androidx.lifecycle.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache */
class b {

    /* renamed from: c  reason: collision with root package name */
    static b f1663c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, a> f1664a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f1665b = new HashMap();

    /* compiled from: ClassesInfoCache */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Map<g.a, List<C0046b>> f1666a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<C0046b, g.a> f1667b;

        a(Map<C0046b, g.a> map) {
            this.f1667b = map;
            for (Map.Entry next : map.entrySet()) {
                g.a aVar = (g.a) next.getValue();
                List list = this.f1666a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f1666a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        private static void b(List<C0046b> list, k kVar, g.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(kVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(k kVar, g.a aVar, Object obj) {
            b(this.f1666a.get(aVar), kVar, aVar, obj);
            b(this.f1666a.get(g.a.ON_ANY), kVar, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    /* compiled from: ClassesInfoCache */
    static class C0046b {

        /* renamed from: a  reason: collision with root package name */
        final int f1668a;

        /* renamed from: b  reason: collision with root package name */
        final Method f1669b;

        C0046b(int i, Method method) {
            this.f1668a = i;
            this.f1669b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(k kVar, g.a aVar, Object obj) {
            try {
                int i = this.f1668a;
                if (i == 0) {
                    this.f1669b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f1669b.invoke(obj, new Object[]{kVar});
                } else if (i == 2) {
                    this.f1669b.invoke(obj, new Object[]{kVar, aVar});
                }
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0046b.class != obj.getClass()) {
                return false;
            }
            C0046b bVar = (C0046b) obj;
            if (this.f1668a != bVar.f1668a || !this.f1669b.getName().equals(bVar.f1669b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f1668a * 31) + this.f1669b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i;
        a c2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c2 = c(superclass)) == null)) {
            hashMap.putAll(c2.f1667b);
        }
        for (Class c3 : cls.getInterfaces()) {
            for (Map.Entry next : c(c3).f1667b.entrySet()) {
                e(hashMap, (C0046b) next.getKey(), (g.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            r rVar = (r) method.getAnnotation(r.class);
            if (rVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(k.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                g.a value = rVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(g.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == g.a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new C0046b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f1664a.put(cls, aVar);
        this.f1665b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    private void e(Map<C0046b, g.a> map, C0046b bVar, g.a aVar, Class<?> cls) {
        g.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f1669b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.f1664a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f1665b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b2 = b(cls);
        for (Method annotation : b2) {
            if (((r) annotation.getAnnotation(r.class)) != null) {
                a(cls, b2);
                return true;
            }
        }
        this.f1665b.put(cls, Boolean.FALSE);
        return false;
    }
}
