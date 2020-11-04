package com.google.firebase.remoteconfig.l;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.e;
import com.google.protobuf.g;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.p;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public final class b extends i<b, a> implements Object {
    /* access modifiers changed from: private */
    public static final b h;
    private static volatile p<b> i;

    /* renamed from: d  reason: collision with root package name */
    private int f11536d;

    /* renamed from: e  reason: collision with root package name */
    private j.b<e> f11537e = i.j();

    /* renamed from: f  reason: collision with root package name */
    private long f11538f;
    private j.b<d> g = i.j();

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class a extends i.b<b, a> implements Object {
        /* synthetic */ a(a aVar) {
            this();
        }

        private a() {
            super(b.h);
        }
    }

    static {
        b bVar = new b();
        h = bVar;
        bVar.q();
    }

    private b() {
    }

    public static b C() {
        return h;
    }

    public static p<b> I() {
        return h.d();
    }

    public List<d> D() {
        return this.g;
    }

    public List<e> E() {
        return this.f11537e;
    }

    public long F() {
        return this.f11538f;
    }

    public boolean H() {
        return (this.f11536d & 1) == 1;
    }

    /* access modifiers changed from: protected */
    public final Object i(i.C0109i iVar, Object obj, Object obj2) {
        switch (a.f11535a[iVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return h;
            case 3:
                this.f11537e.o();
                this.g.o();
                return null;
            case 4:
                return new a((a) null);
            case 5:
                i.j jVar = (i.j) obj;
                b bVar = (b) obj2;
                this.f11537e = jVar.f(this.f11537e, bVar.f11537e);
                this.f11538f = jVar.i(H(), this.f11538f, bVar.H(), bVar.f11538f);
                this.g = jVar.f(this.g, bVar.g);
                if (jVar == i.h.f11589a) {
                    this.f11536d |= bVar.f11536d;
                }
                return this;
            case 6:
                e eVar = (e) obj;
                g gVar = (g) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int z2 = eVar.z();
                        if (z2 != 0) {
                            if (z2 == 10) {
                                if (!this.f11537e.R()) {
                                    this.f11537e = i.s(this.f11537e);
                                }
                                this.f11537e.add((e) eVar.p(e.F(), gVar));
                            } else if (z2 == 17) {
                                this.f11536d |= 1;
                                this.f11538f = eVar.m();
                            } else if (z2 == 26) {
                                if (!this.g.R()) {
                                    this.g = i.s(this.g);
                                }
                                this.g.add(eVar.j());
                            } else if (!y(z2, eVar)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.h(this);
                        throw new RuntimeException(e2);
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.h(this);
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (i == null) {
                    synchronized (b.class) {
                        if (i == null) {
                            i = new i.c(h);
                        }
                    }
                }
                return i;
            default:
                throw new UnsupportedOperationException();
        }
        return h;
    }
}
