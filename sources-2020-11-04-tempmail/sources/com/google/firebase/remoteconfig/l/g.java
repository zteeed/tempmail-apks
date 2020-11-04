package com.google.firebase.remoteconfig.l;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e;
import com.google.protobuf.i;
import com.google.protobuf.p;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public final class g extends i<g, a> implements Object {
    /* access modifiers changed from: private */
    public static final g h;
    private static volatile p<g> i;

    /* renamed from: d  reason: collision with root package name */
    private int f12100d;

    /* renamed from: e  reason: collision with root package name */
    private int f12101e;

    /* renamed from: f  reason: collision with root package name */
    private long f12102f;
    private String g = "";

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class a extends i.b<g, a> implements Object {
        /* synthetic */ a(a aVar) {
            this();
        }

        private a() {
            super(g.h);
        }
    }

    static {
        g gVar = new g();
        h = gVar;
        gVar.q();
    }

    private g() {
    }

    public static p<g> F() {
        return h.d();
    }

    public boolean C() {
        return (this.f12100d & 2) == 2;
    }

    public boolean D() {
        return (this.f12100d & 4) == 4;
    }

    public boolean E() {
        return (this.f12100d & 1) == 1;
    }

    /* access modifiers changed from: protected */
    public final Object i(i.C0109i iVar, Object obj, Object obj2) {
        switch (a.f12084a[iVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return h;
            case 3:
                return null;
            case 4:
                return new a((a) null);
            case 5:
                i.j jVar = (i.j) obj;
                g gVar = (g) obj2;
                this.f12101e = jVar.c(E(), this.f12101e, gVar.E(), gVar.f12101e);
                this.f12102f = jVar.i(C(), this.f12102f, gVar.C(), gVar.f12102f);
                this.g = jVar.e(D(), this.g, gVar.D(), gVar.g);
                if (jVar == i.h.f12138a) {
                    this.f12100d |= gVar.f12100d;
                }
                return this;
            case 6:
                e eVar = (e) obj;
                com.google.protobuf.g gVar2 = (com.google.protobuf.g) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int z2 = eVar.z();
                        if (z2 != 0) {
                            if (z2 == 8) {
                                this.f12100d |= 1;
                                this.f12101e = eVar.n();
                            } else if (z2 == 17) {
                                this.f12100d |= 2;
                                this.f12102f = eVar.m();
                            } else if (z2 == 26) {
                                String x = eVar.x();
                                this.f12100d |= 4;
                                this.g = x;
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
                    synchronized (g.class) {
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
