package org.greenrobot.eventbus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.q.b;

/* compiled from: SubscriberMethodFinder */
class o {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Class<?>, List<n>> f14485d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final a[] f14486e = new a[4];

    /* renamed from: a  reason: collision with root package name */
    private List<b> f14487a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14488b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14489c;

    /* compiled from: SubscriberMethodFinder */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final List<n> f14490a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        final Map<Class, Object> f14491b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        final Map<String, Class> f14492c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        final StringBuilder f14493d = new StringBuilder(128);

        /* renamed from: e  reason: collision with root package name */
        Class<?> f14494e;

        /* renamed from: f  reason: collision with root package name */
        boolean f14495f;
        org.greenrobot.eventbus.q.a g;

        a() {
        }

        private boolean b(Method method, Class<?> cls) {
            this.f14493d.setLength(0);
            this.f14493d.append(method.getName());
            StringBuilder sb = this.f14493d;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.f14493d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f14492c.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f14492c.put(sb2, put);
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Method method, Class<?> cls) {
            Object put = this.f14491b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (b((Method) put, cls)) {
                    this.f14491b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return b(method, cls);
        }

        /* access modifiers changed from: package-private */
        public void c(Class<?> cls) {
            this.f14494e = cls;
            this.f14495f = false;
            this.g = null;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f14495f) {
                this.f14494e = null;
                return;
            }
            Class<? super Object> superclass = this.f14494e.getSuperclass();
            this.f14494e = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f14494e = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f14490a.clear();
            this.f14491b.clear();
            this.f14492c.clear();
            this.f14493d.setLength(0);
            this.f14494e = null;
            this.f14495f = false;
            this.g = null;
        }
    }

    o(List<b> list, boolean z, boolean z2) {
        this.f14487a = list;
        this.f14488b = z;
        this.f14489c = z2;
    }

    private List<n> b(Class<?> cls) {
        a g = g();
        g.c(cls);
        while (g.f14494e != null) {
            org.greenrobot.eventbus.q.a f2 = f(g);
            g.g = f2;
            if (f2 != null) {
                for (n nVar : f2.a()) {
                    if (g.a(nVar.f14479a, nVar.f14481c)) {
                        g.f14490a.add(nVar);
                    }
                }
            } else {
                d(g);
            }
            g.d();
        }
        return e(g);
    }

    private List<n> c(Class<?> cls) {
        a g = g();
        g.c(cls);
        while (g.f14494e != null) {
            d(g);
            g.d();
        }
        return e(g);
    }

    private void d(a aVar) {
        Method[] methodArr;
        try {
            methodArr = aVar.f14494e.getDeclaredMethods();
        } catch (Throwable unused) {
            methodArr = aVar.f14494e.getMethods();
            aVar.f14495f = true;
        }
        for (Method method : methodArr) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    l lVar = (l) method.getAnnotation(l.class);
                    if (lVar != null) {
                        Class cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f14490a.add(new n(method, cls, lVar.threadMode(), lVar.priority(), lVar.sticky()));
                        }
                    }
                } else if (this.f14488b && method.isAnnotationPresent(l.class)) {
                    throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f14488b && method.isAnnotationPresent(l.class)) {
                throw new EventBusException((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    private List<n> e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f14490a);
        aVar.e();
        synchronized (f14486e) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                } else if (f14486e[i] == null) {
                    f14486e[i] = aVar;
                    break;
                } else {
                    i++;
                }
            }
        }
        return arrayList;
    }

    private org.greenrobot.eventbus.q.a f(a aVar) {
        org.greenrobot.eventbus.q.a aVar2 = aVar.g;
        if (!(aVar2 == null || aVar2.b() == null)) {
            org.greenrobot.eventbus.q.a b2 = aVar.g.b();
            if (aVar.f14494e == b2.c()) {
                return b2;
            }
        }
        List<b> list = this.f14487a;
        if (list == null) {
            return null;
        }
        for (b a2 : list) {
            org.greenrobot.eventbus.q.a a3 = a2.a(aVar.f14494e);
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    private a g() {
        synchronized (f14486e) {
            for (int i = 0; i < 4; i++) {
                a aVar = f14486e[i];
                if (aVar != null) {
                    f14486e[i] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }

    /* access modifiers changed from: package-private */
    public List<n> a(Class<?> cls) {
        List<n> list;
        List<n> list2 = f14485d.get(cls);
        if (list2 != null) {
            return list2;
        }
        if (this.f14489c) {
            list = c(cls);
        } else {
            list = b(cls);
        }
        if (!list.isEmpty()) {
            f14485d.put(cls, list);
            return list;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
