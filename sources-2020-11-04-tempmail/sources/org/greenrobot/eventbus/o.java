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
    private static final Map<Class<?>, List<n>> f15043d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final a[] f15044e = new a[4];

    /* renamed from: a  reason: collision with root package name */
    private List<b> f15045a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15046b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15047c;

    /* compiled from: SubscriberMethodFinder */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final List<n> f15048a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        final Map<Class, Object> f15049b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        final Map<String, Class> f15050c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        final StringBuilder f15051d = new StringBuilder(128);

        /* renamed from: e  reason: collision with root package name */
        Class<?> f15052e;

        /* renamed from: f  reason: collision with root package name */
        boolean f15053f;
        org.greenrobot.eventbus.q.a g;

        a() {
        }

        private boolean b(Method method, Class<?> cls) {
            this.f15051d.setLength(0);
            this.f15051d.append(method.getName());
            StringBuilder sb = this.f15051d;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.f15051d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f15050c.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f15050c.put(sb2, put);
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Method method, Class<?> cls) {
            Object put = this.f15049b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (b((Method) put, cls)) {
                    this.f15049b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return b(method, cls);
        }

        /* access modifiers changed from: package-private */
        public void c(Class<?> cls) {
            this.f15052e = cls;
            this.f15053f = false;
            this.g = null;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f15053f) {
                this.f15052e = null;
                return;
            }
            Class<? super Object> superclass = this.f15052e.getSuperclass();
            this.f15052e = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f15052e = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f15048a.clear();
            this.f15049b.clear();
            this.f15050c.clear();
            this.f15051d.setLength(0);
            this.f15052e = null;
            this.f15053f = false;
            this.g = null;
        }
    }

    o(List<b> list, boolean z, boolean z2) {
        this.f15045a = list;
        this.f15046b = z;
        this.f15047c = z2;
    }

    private List<n> b(Class<?> cls) {
        a g = g();
        g.c(cls);
        while (g.f15052e != null) {
            org.greenrobot.eventbus.q.a f2 = f(g);
            g.g = f2;
            if (f2 != null) {
                for (n nVar : f2.a()) {
                    if (g.a(nVar.f15037a, nVar.f15039c)) {
                        g.f15048a.add(nVar);
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
        while (g.f15052e != null) {
            d(g);
            g.d();
        }
        return e(g);
    }

    private void d(a aVar) {
        Method[] methodArr;
        try {
            methodArr = aVar.f15052e.getDeclaredMethods();
        } catch (Throwable unused) {
            methodArr = aVar.f15052e.getMethods();
            aVar.f15053f = true;
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
                            aVar.f15048a.add(new n(method, cls, lVar.threadMode(), lVar.priority(), lVar.sticky()));
                        }
                    }
                } else if (this.f15046b && method.isAnnotationPresent(l.class)) {
                    throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f15046b && method.isAnnotationPresent(l.class)) {
                throw new EventBusException((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    private List<n> e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f15048a);
        aVar.e();
        synchronized (f15044e) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                } else if (f15044e[i] == null) {
                    f15044e[i] = aVar;
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
            if (aVar.f15052e == b2.c()) {
                return b2;
            }
        }
        List<b> list = this.f15045a;
        if (list == null) {
            return null;
        }
        for (b a2 : list) {
            org.greenrobot.eventbus.q.a a3 = a2.a(aVar.f15052e);
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    private a g() {
        synchronized (f15044e) {
            for (int i = 0; i < 4; i++) {
                a aVar = f15044e[i];
                if (aVar != null) {
                    f15044e[i] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }

    /* access modifiers changed from: package-private */
    public List<n> a(Class<?> cls) {
        List<n> list;
        List<n> list2 = f15043d.get(cls);
        if (list2 != null) {
            return list2;
        }
        if (this.f15047c) {
            list = c(cls);
        } else {
            list = b(cls);
        }
        if (!list.isEmpty()) {
            f15043d.put(cls, list);
            return list;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
