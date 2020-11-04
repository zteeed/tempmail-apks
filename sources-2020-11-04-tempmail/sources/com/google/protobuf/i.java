package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.h;
import com.google.protobuf.i;
import com.google.protobuf.i.b;
import com.google.protobuf.j;
import com.google.protobuf.m;
import com.google.protobuf.w;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: GeneratedMessageLite */
public abstract class i<MessageType extends i<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends a<MessageType, BuilderType> {

    /* renamed from: c  reason: collision with root package name */
    protected t f12126c = t.c();

    /* compiled from: GeneratedMessageLite */
    public static abstract class b<MessageType extends i<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends a.C0107a<MessageType, BuilderType> {

        /* renamed from: b  reason: collision with root package name */
        private final MessageType f12127b;

        /* renamed from: c  reason: collision with root package name */
        protected MessageType f12128c;

        /* renamed from: d  reason: collision with root package name */
        protected boolean f12129d = false;

        protected b(MessageType messagetype) {
            this.f12127b = messagetype;
            this.f12128c = (i) messagetype.f(C0109i.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: i */
        public final MessageType h() {
            MessageType j = j();
            if (j.isInitialized()) {
                return j;
            }
            throw a.C0107a.g(j);
        }

        public final boolean isInitialized() {
            return i.p(this.f12128c, false);
        }

        public MessageType j() {
            if (this.f12129d) {
                return this.f12128c;
            }
            this.f12128c.q();
            this.f12129d = true;
            return this.f12128c;
        }

        /* renamed from: k */
        public BuilderType clone() {
            BuilderType t = b().t();
            t.p(j());
            return t;
        }

        /* access modifiers changed from: protected */
        public void l() {
            if (this.f12129d) {
                MessageType messagetype = (i) this.f12128c.f(C0109i.NEW_MUTABLE_INSTANCE);
                messagetype.A(h.f12138a, this.f12128c);
                this.f12128c = messagetype;
                this.f12129d = false;
            }
        }

        /* renamed from: n */
        public MessageType b() {
            return this.f12127b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public BuilderType e(MessageType messagetype) {
            return p(messagetype);
        }

        public BuilderType p(MessageType messagetype) {
            l();
            this.f12128c.A(h.f12138a, messagetype);
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite */
    protected static class c<T extends i<T, ?>> extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        private T f12130a;

        public c(T t) {
            this.f12130a = t;
        }

        /* renamed from: g */
        public T b(e eVar, g gVar) throws InvalidProtocolBufferException {
            return i.w(this.f12130a, eVar, gVar);
        }
    }

    /* compiled from: GeneratedMessageLite */
    static class d implements j {

        /* renamed from: a  reason: collision with root package name */
        static final d f12131a = new d();

        /* renamed from: b  reason: collision with root package name */
        static final a f12132b = new a();

        /* compiled from: GeneratedMessageLite */
        static final class a extends RuntimeException {
            a() {
            }
        }

        private d() {
        }

        public <T extends m> T a(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw f12132b;
            }
            ((i) t).l(this, t2);
            return t;
        }

        public h<f> b(h<f> hVar, h<f> hVar2) {
            if (hVar.equals(hVar2)) {
                return hVar;
            }
            throw f12132b;
        }

        public int c(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw f12132b;
        }

        public t d(t tVar, t tVar2) {
            if (tVar.equals(tVar2)) {
                return tVar;
            }
            throw f12132b;
        }

        public String e(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw f12132b;
        }

        public <T> j.b<T> f(j.b<T> bVar, j.b<T> bVar2) {
            if (bVar.equals(bVar2)) {
                return bVar;
            }
            throw f12132b;
        }

        public boolean g(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw f12132b;
        }

        public d h(boolean z, d dVar, boolean z2, d dVar2) {
            if (z == z2 && dVar.equals(dVar2)) {
                return dVar;
            }
            throw f12132b;
        }

        public long i(boolean z, long j, boolean z2, long j2) {
            if (z == z2 && j == j2) {
                return j;
            }
            throw f12132b;
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static abstract class e<MessageType extends e<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends i<MessageType, BuilderType> implements Object<MessageType, BuilderType> {

        /* renamed from: d  reason: collision with root package name */
        protected h<f> f12133d = h.i();

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public final void A(j jVar, MessageType messagetype) {
            i.super.A(jVar, messagetype);
            this.f12133d = jVar.b(this.f12133d, messagetype.f12133d);
        }

        public /* bridge */ /* synthetic */ m b() {
            return i.super.b();
        }

        public /* bridge */ /* synthetic */ m.a c() {
            return i.super.c();
        }

        /* access modifiers changed from: protected */
        public final void q() {
            i.super.q();
            this.f12133d.f();
        }
    }

    /* compiled from: GeneratedMessageLite */
    static final class f implements h.b<f> {

        /* renamed from: b  reason: collision with root package name */
        final int f12134b;

        /* renamed from: c  reason: collision with root package name */
        final w.b f12135c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f12136d;

        public w.c P() {
            return this.f12135c.f();
        }

        /* renamed from: f */
        public int compareTo(f fVar) {
            return this.f12134b - fVar.f12134b;
        }

        public int g() {
            return this.f12134b;
        }

        public boolean l() {
            return this.f12136d;
        }

        public w.b s() {
            return this.f12135c;
        }

        public m.a y(m.a aVar, m mVar) {
            return ((b) aVar).p((i) mVar);
        }
    }

    /* compiled from: GeneratedMessageLite */
    private static class g implements j {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f12137a;

        private g() {
            this.f12137a = 0;
        }

        public <T extends m> T a(T t, T t2) {
            int i;
            if (t != null) {
                i = t instanceof i ? ((i) t).n(this) : t.hashCode();
            } else {
                i = 37;
            }
            this.f12137a = (this.f12137a * 53) + i;
            return t;
        }

        public h<f> b(h<f> hVar, h<f> hVar2) {
            this.f12137a = (this.f12137a * 53) + hVar.hashCode();
            return hVar;
        }

        public int c(boolean z, int i, boolean z2, int i2) {
            this.f12137a = (this.f12137a * 53) + i;
            return i;
        }

        public t d(t tVar, t tVar2) {
            this.f12137a = (this.f12137a * 53) + tVar.hashCode();
            return tVar;
        }

        public String e(boolean z, String str, boolean z2, String str2) {
            this.f12137a = (this.f12137a * 53) + str.hashCode();
            return str;
        }

        public <T> j.b<T> f(j.b<T> bVar, j.b<T> bVar2) {
            this.f12137a = (this.f12137a * 53) + bVar.hashCode();
            return bVar;
        }

        public boolean g(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f12137a = (this.f12137a * 53) + j.a(z2);
            return z2;
        }

        public d h(boolean z, d dVar, boolean z2, d dVar2) {
            this.f12137a = (this.f12137a * 53) + dVar.hashCode();
            return dVar;
        }

        public long i(boolean z, long j, boolean z2, long j2) {
            this.f12137a = (this.f12137a * 53) + j.b(j);
            return j;
        }
    }

    /* compiled from: GeneratedMessageLite */
    protected static class h implements j {

        /* renamed from: a  reason: collision with root package name */
        public static final h f12138a = new h();

        private h() {
        }

        public <T extends m> T a(T t, T t2) {
            if (t == null || t2 == null) {
                return t != null ? t : t2;
            }
            return t.c().G(t2).h();
        }

        public h<f> b(h<f> hVar, h<f> hVar2) {
            if (hVar.d()) {
                hVar = hVar.clone();
            }
            hVar.g(hVar2);
            return hVar;
        }

        public int c(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        public t d(t tVar, t tVar2) {
            return tVar2 == t.c() ? tVar : t.h(tVar, tVar2);
        }

        public String e(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        public <T> j.b<T> f(j.b<T> bVar, j.b<T> bVar2) {
            int size = bVar.size();
            int size2 = bVar2.size();
            if (size > 0 && size2 > 0) {
                if (!bVar.R()) {
                    bVar = bVar.t(size2 + size);
                }
                bVar.addAll(bVar2);
            }
            return size > 0 ? bVar : bVar2;
        }

        public boolean g(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }

        public d h(boolean z, d dVar, boolean z2, d dVar2) {
            return z2 ? dVar2 : dVar;
        }

        public long i(boolean z, long j, boolean z2, long j2) {
            return z2 ? j2 : j;
        }
    }

    /* renamed from: com.google.protobuf.i$i  reason: collision with other inner class name */
    /* compiled from: GeneratedMessageLite */
    public enum C0109i {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* compiled from: GeneratedMessageLite */
    protected interface j {
        <T extends m> T a(T t, T t2);

        h<f> b(h<f> hVar, h<f> hVar2);

        int c(boolean z, int i, boolean z2, int i2);

        t d(t tVar, t tVar2);

        String e(boolean z, String str, boolean z2, String str2);

        <T> j.b<T> f(j.b<T> bVar, j.b<T> bVar2);

        boolean g(boolean z, boolean z2, boolean z3, boolean z4);

        d h(boolean z, d dVar, boolean z2, d dVar2);

        long i(boolean z, long j, boolean z2, long j2);
    }

    private static <T extends i<T, ?>> T e(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        InvalidProtocolBufferException a2 = t.a().a();
        a2.h(t);
        throw a2;
    }

    protected static <E> j.b<E> j() {
        return q.h();
    }

    private final void k() {
        if (this.f12126c == t.c()) {
            this.f12126c = t.i();
        }
    }

    static Object o(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends i<T, ?>> boolean p(T t, boolean z) {
        return t.g(C0109i.IS_INITIALIZED, Boolean.valueOf(z)) != null;
    }

    protected static <E> j.b<E> s(j.b<E> bVar) {
        int size = bVar.size();
        return bVar.t(size == 0 ? 10 : size * 2);
    }

    protected static <T extends i<T, ?>> T u(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T w = w(t, e.c(inputStream), g.a());
        e(w);
        return w;
    }

    protected static <T extends i<T, ?>> T v(T t, byte[] bArr) throws InvalidProtocolBufferException {
        T x = x(t, bArr, g.a());
        e(x);
        return x;
    }

    static <T extends i<T, ?>> T w(T t, e eVar, g gVar) throws InvalidProtocolBufferException {
        T t2 = (i) t.f(C0109i.NEW_MUTABLE_INSTANCE);
        try {
            t2.i(C0109i.MERGE_FROM_STREAM, eVar, gVar);
            t2.q();
            return t2;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends i<T, ?>> T x(T t, byte[] bArr, g gVar) throws InvalidProtocolBufferException {
        T w;
        try {
            e d2 = e.d(bArr);
            w = w(t, d2, gVar);
            d2.a(0);
            return w;
        } catch (InvalidProtocolBufferException e2) {
            e2.h(w);
            throw e2;
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        }
    }

    /* access modifiers changed from: package-private */
    public void A(j jVar, MessageType messagetype) {
        i(C0109i.VISIT, jVar, messagetype);
        this.f12126c = jVar.d(this.f12126c, messagetype.f12126c);
    }

    public final p<MessageType> d() {
        return (p) f(C0109i.GET_PARSER);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b().getClass().isInstance(obj)) {
            return false;
        }
        try {
            A(d.f12131a, (i) obj);
            return true;
        } catch (d.a unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public Object f(C0109i iVar) {
        return i(iVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object g(C0109i iVar, Object obj) {
        return i(iVar, obj, (Object) null);
    }

    public int hashCode() {
        if (this.f12103b == 0) {
            g gVar = new g();
            A(gVar, this);
            this.f12103b = gVar.f12137a;
        }
        return this.f12103b;
    }

    /* access modifiers changed from: protected */
    public abstract Object i(C0109i iVar, Object obj, Object obj2);

    public final boolean isInitialized() {
        return g(C0109i.IS_INITIALIZED, Boolean.TRUE) != null;
    }

    /* access modifiers changed from: package-private */
    public boolean l(d dVar, m mVar) {
        if (this == mVar) {
            return true;
        }
        if (!b().getClass().isInstance(mVar)) {
            return false;
        }
        A(dVar, (i) mVar);
        return true;
    }

    /* renamed from: m */
    public final MessageType b() {
        return (i) f(C0109i.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public int n(g gVar) {
        if (this.f12103b == 0) {
            int j2 = gVar.f12137a;
            int unused = gVar.f12137a = 0;
            A(gVar, this);
            this.f12103b = gVar.f12137a;
            int unused2 = gVar.f12137a = j2;
        }
        return this.f12103b;
    }

    /* access modifiers changed from: protected */
    public void q() {
        f(C0109i.MAKE_IMMUTABLE);
        this.f12126c.d();
    }

    /* access modifiers changed from: protected */
    public void r(int i, int i2) {
        k();
        this.f12126c.g(i, i2);
    }

    public final BuilderType t() {
        return (b) f(C0109i.NEW_BUILDER);
    }

    public String toString() {
        return o.e(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public boolean y(int i, e eVar) throws IOException {
        if (w.b(i) == 4) {
            return false;
        }
        k();
        return this.f12126c.e(i, eVar);
    }

    /* renamed from: z */
    public final BuilderType c() {
        BuilderType buildertype = (b) f(C0109i.NEW_BUILDER);
        buildertype.p(this);
        return buildertype;
    }
}
