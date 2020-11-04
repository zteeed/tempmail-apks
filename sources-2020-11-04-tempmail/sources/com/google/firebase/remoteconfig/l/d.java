package com.google.firebase.remoteconfig.l;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e;
import com.google.protobuf.g;
import com.google.protobuf.i;
import com.google.protobuf.p;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public final class d extends i<d, a> implements Object {
    /* access modifiers changed from: private */
    public static final d h;
    private static volatile p<d> i;

    /* renamed from: d  reason: collision with root package name */
    private int f12091d;

    /* renamed from: e  reason: collision with root package name */
    private int f12092e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12093f;
    private long g;

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class a extends i.b<d, a> implements Object {
        /* synthetic */ a(a aVar) {
            this();
        }

        private a() {
            super(d.h);
        }
    }

    static {
        d dVar = new d();
        h = dVar;
        dVar.q();
    }

    private d() {
    }

    public static p<d> F() {
        return h.d();
    }

    public boolean C() {
        return (this.f12091d & 2) == 2;
    }

    public boolean D() {
        return (this.f12091d & 1) == 1;
    }

    public boolean E() {
        return (this.f12091d & 4) == 4;
    }

    /* access modifiers changed from: protected */
    public final Object i(i.C0109i iVar, Object obj, Object obj2) {
        switch (a.f12084a[iVar.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return h;
            case 3:
                return null;
            case 4:
                return new a((a) null);
            case 5:
                i.j jVar = (i.j) obj;
                d dVar = (d) obj2;
                this.f12092e = jVar.c(D(), this.f12092e, dVar.D(), dVar.f12092e);
                this.f12093f = jVar.g(C(), this.f12093f, dVar.C(), dVar.f12093f);
                this.g = jVar.i(E(), this.g, dVar.E(), dVar.g);
                if (jVar == i.h.f12138a) {
                    this.f12091d |= dVar.f12091d;
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
                            if (z2 == 8) {
                                this.f12091d |= 1;
                                this.f12092e = eVar.n();
                            } else if (z2 == 16) {
                                this.f12091d |= 2;
                                this.f12093f = eVar.i();
                            } else if (z2 == 25) {
                                this.f12091d |= 4;
                                this.g = eVar.m();
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
                    synchronized (d.class) {
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
