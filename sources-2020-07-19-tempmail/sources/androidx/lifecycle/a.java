package androidx.lifecycle;

import androidx.lifecycle.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassesInfoCache */
class a {

    /* renamed from: c  reason: collision with root package name */
    static a f1602c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class, C0046a> f1603a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class, Boolean> f1604b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    /* compiled from: ClassesInfoCache */
    static class C0046a {

        /* renamed from: a  reason: collision with root package name */
        final Map<e.a, List<b>> f1605a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, e.a> f1606b;

        C0046a(Map<b, e.a> map) {
            this.f1606b = map;
            for (Map.Entry next : map.entrySet()) {
                e.a aVar = (e.a) next.getValue();
                List list = this.f1605a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f1605a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        private static void b(List<b> list, g gVar, e.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(gVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar, e.a aVar, Object obj) {
            b(this.f1605a.get(aVar), gVar, aVar, obj);
            b(this.f1605a.get(e.a.ON_ANY), gVar, aVar, obj);
        }
    }

    /* compiled from: ClassesInfoCache */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f1607a;

        /* renamed from: b  reason: collision with root package name */
        final Method f1608b;

        b(int i, Method method) {
            this.f1607a = i;
            this.f1608b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(g gVar, e.a aVar, Object obj) {
            try {
                int i = this.f1607a;
                if (i == 0) {
                    this.f1608b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f1608b.invoke(obj, new Object[]{gVar});
                } else if (i == 2) {
                    this.f1608b.invoke(obj, new Object[]{gVar, aVar});
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
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f1607a != bVar.f1607a || !this.f1608b.getName().equals(bVar.f1608b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f1607a * 31) + this.f1608b.getName().hashCode();
        }
    }

    a() {
    }

    private C0046a a(Class cls, Method[] methodArr) {
        int i;
        C0046a c2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c2 = c(superclass)) == null)) {
            hashMap.putAll(c2.f1606b);
        }
        for (Class c3 : cls.getInterfaces()) {
            for (Map.Entry next : c(c3).f1606b.entrySet()) {
                e(hashMap, (b) next.getKey(), (e.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(g.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                e.a value = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(e.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == e.a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0046a aVar = new C0046a(hashMap);
        this.f1603a.put(cls, aVar);
        this.f1604b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    private void e(Map<b, e.a> map, b bVar, e.a aVar, Class cls) {
        e.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f1608b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous" + " value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public C0046a c(Class cls) {
        C0046a aVar = this.f1603a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class cls) {
        if (this.f1604b.containsKey(cls)) {
            return this.f1604b.get(cls).booleanValue();
        }
        Method[] b2 = b(cls);
        for (Method annotation : b2) {
            if (((n) annotation.getAnnotation(n.class)) != null) {
                a(cls, b2);
                return true;
            }
        }
        this.f1604b.put(cls, Boolean.FALSE);
        return false;
    }
}
