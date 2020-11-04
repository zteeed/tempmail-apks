package org.greenrobot.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;

/* compiled from: EventBus */
public class c {
    static volatile c s;
    private static final d t = new d();
    private static final Map<Class<?>, List<Class<?>>> u = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<p>> f15001a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f15002b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, Object> f15003c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<C0163c> f15004d;

    /* renamed from: e  reason: collision with root package name */
    private final g f15005e;

    /* renamed from: f  reason: collision with root package name */
    private final k f15006f;
    private final b g;
    private final a h;
    private final o i;
    private final ExecutorService j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final int q;
    private final f r;

    /* compiled from: EventBus */
    class a extends ThreadLocal<C0163c> {
        a(c cVar) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C0163c initialValue() {
            return new C0163c();
        }
    }

    /* compiled from: EventBus */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15007a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.greenrobot.eventbus.ThreadMode[] r0 = org.greenrobot.eventbus.ThreadMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15007a = r0
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.POSTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15007a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.MAIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15007a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.MAIN_ORDERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15007a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15007a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.ASYNC     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.c.b.<clinit>():void");
        }
    }

    /* renamed from: org.greenrobot.eventbus.c$c  reason: collision with other inner class name */
    /* compiled from: EventBus */
    static final class C0163c {

        /* renamed from: a  reason: collision with root package name */
        final List<Object> f15008a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        boolean f15009b;

        /* renamed from: c  reason: collision with root package name */
        boolean f15010c;

        /* renamed from: d  reason: collision with root package name */
        p f15011d;

        /* renamed from: e  reason: collision with root package name */
        Object f15012e;

        /* renamed from: f  reason: collision with root package name */
        boolean f15013f;

        C0163c() {
        }
    }

    public c() {
        this(t);
    }

    static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    private void b(p pVar, Object obj) {
        if (obj != null) {
            n(pVar, obj, i());
        }
    }

    public static c c() {
        if (s == null) {
            synchronized (c.class) {
                if (s == null) {
                    s = new c();
                }
            }
        }
        return s;
    }

    private void f(p pVar, Object obj, Throwable th) {
        if (obj instanceof m) {
            if (this.l) {
                f fVar = this.r;
                Level level = Level.SEVERE;
                fVar.b(level, "SubscriberExceptionEvent subscriber " + pVar.f15054a.getClass() + " threw an exception", th);
                m mVar = (m) obj;
                f fVar2 = this.r;
                Level level2 = Level.SEVERE;
                fVar2.b(level2, "Initial event " + mVar.f15035b + " caused exception in " + mVar.f15036c, mVar.f15034a);
            }
        } else if (!this.k) {
            if (this.l) {
                f fVar3 = this.r;
                Level level3 = Level.SEVERE;
                fVar3.b(level3, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + pVar.f15054a.getClass(), th);
            }
            if (this.n) {
                k(new m(this, th, obj, pVar.f15054a));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th);
        }
    }

    private boolean i() {
        g gVar = this.f15005e;
        if (gVar != null) {
            return gVar.b();
        }
        return true;
    }

    private static List<Class<?>> j(Class<?> cls) {
        List<Class<?>> list;
        synchronized (u) {
            list = u.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    a(list, cls2.getInterfaces());
                }
                u.put(cls, list);
            }
        }
        return list;
    }

    private void l(Object obj, C0163c cVar) throws Error {
        boolean z;
        Class<?> cls = obj.getClass();
        if (this.p) {
            List<Class<?>> j2 = j(cls);
            int size = j2.size();
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                z |= m(obj, cVar, j2.get(i2));
            }
        } else {
            z = m(obj, cVar, cls);
        }
        if (!z) {
            if (this.m) {
                f fVar = this.r;
                Level level = Level.FINE;
                fVar.a(level, "No subscribers registered for event " + cls);
            }
            if (this.o && cls != h.class && cls != m.class) {
                k(new h(this, obj));
            }
        }
    }

    private boolean m(Object obj, C0163c cVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f15001a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            cVar.f15012e = obj;
            cVar.f15011d = pVar;
            try {
                n(pVar, obj, cVar.f15010c);
                if (cVar.f15013f) {
                    return true;
                }
            } finally {
                cVar.f15012e = null;
                cVar.f15011d = null;
                cVar.f15013f = false;
            }
        }
        return true;
    }

    private void n(p pVar, Object obj, boolean z) {
        int i2 = b.f15007a[pVar.f15055b.f15038b.ordinal()];
        if (i2 == 1) {
            h(pVar, obj);
        } else if (i2 != 2) {
            if (i2 == 3) {
                k kVar = this.f15006f;
                if (kVar != null) {
                    kVar.a(pVar, obj);
                } else {
                    h(pVar, obj);
                }
            } else if (i2 != 4) {
                if (i2 == 5) {
                    this.h.a(pVar, obj);
                    return;
                }
                throw new IllegalStateException("Unknown thread mode: " + pVar.f15055b.f15038b);
            } else if (z) {
                this.g.a(pVar, obj);
            } else {
                h(pVar, obj);
            }
        } else if (z) {
            h(pVar, obj);
        } else {
            this.f15006f.a(pVar, obj);
        }
    }

    private void p(Object obj, n nVar) {
        Class<?> cls = nVar.f15039c;
        p pVar = new p(obj, nVar);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15001a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f15001a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 > size) {
                break;
            } else if (i2 == size || nVar.f15040d > ((p) copyOnWriteArrayList.get(i2)).f15055b.f15040d) {
                copyOnWriteArrayList.add(i2, pVar);
            } else {
                i2++;
            }
        }
        copyOnWriteArrayList.add(i2, pVar);
        List list = this.f15002b.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f15002b.put(obj, list);
        }
        list.add(cls);
        if (!nVar.f15041e) {
            return;
        }
        if (this.p) {
            for (Map.Entry next : this.f15003c.entrySet()) {
                if (cls.isAssignableFrom((Class) next.getKey())) {
                    b(pVar, next.getValue());
                }
            }
            return;
        }
        b(pVar, this.f15003c.get(cls));
    }

    private void r(Object obj, Class<?> cls) {
        List list = this.f15001a.get(cls);
        if (list != null) {
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                p pVar = (p) list.get(i2);
                if (pVar.f15054a == obj) {
                    pVar.f15056c = false;
                    list.remove(i2);
                    i2--;
                    size--;
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ExecutorService d() {
        return this.j;
    }

    public f e() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public void g(i iVar) {
        Object obj = iVar.f15029a;
        p pVar = iVar.f15030b;
        i.b(iVar);
        if (pVar.f15056c) {
            h(pVar, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public void h(p pVar, Object obj) {
        try {
            pVar.f15055b.f15037a.invoke(pVar.f15054a, new Object[]{obj});
        } catch (InvocationTargetException e2) {
            f(pVar, obj, e2.getCause());
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Unexpected exception", e3);
        }
    }

    public void k(Object obj) {
        C0163c cVar = this.f15004d.get();
        List<Object> list = cVar.f15008a;
        list.add(obj);
        if (!cVar.f15009b) {
            cVar.f15010c = i();
            cVar.f15009b = true;
            if (!cVar.f15013f) {
                while (!list.isEmpty()) {
                    try {
                        l(list.remove(0), cVar);
                    } finally {
                        cVar.f15009b = false;
                        cVar.f15010c = false;
                    }
                }
                return;
            }
            throw new EventBusException("Internal error. Abort state was not reset");
        }
    }

    public void o(Object obj) {
        List<n> a2 = this.i.a(obj.getClass());
        synchronized (this) {
            for (n p2 : a2) {
                p(obj, p2);
            }
        }
    }

    public synchronized void q(Object obj) {
        List<Class> list = this.f15002b.get(obj);
        if (list != null) {
            for (Class r2 : list) {
                r(obj, r2);
            }
            this.f15002b.remove(obj);
        } else {
            f fVar = this.r;
            Level level = Level.WARNING;
            fVar.a(level, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.q + ", eventInheritance=" + this.p + "]";
    }

    c(d dVar) {
        this.f15004d = new a(this);
        this.r = dVar.b();
        this.f15001a = new HashMap();
        this.f15002b = new HashMap();
        this.f15003c = new ConcurrentHashMap();
        g c2 = dVar.c();
        this.f15005e = c2;
        this.f15006f = c2 != null ? c2.a(this) : null;
        this.g = new b(this);
        this.h = new a(this);
        List<org.greenrobot.eventbus.q.b> list = dVar.j;
        this.q = list != null ? list.size() : 0;
        this.i = new o(dVar.j, dVar.h, dVar.g);
        this.l = dVar.f15014a;
        this.m = dVar.f15015b;
        this.n = dVar.f15016c;
        this.o = dVar.f15017d;
        this.k = dVar.f15018e;
        this.p = dVar.f15019f;
        this.j = dVar.i;
    }
}
