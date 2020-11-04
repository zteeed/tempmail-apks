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
    private int f11542d;

    /* renamed from: e  reason: collision with root package name */
    private int f11543e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11544f;
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
        return (this.f11542d & 2) == 2;
    }

    public boolean D() {
        return (this.f11542d & 1) == 1;
    }

    public boolean E() {
        return (this.f11542d & 4) == 4;
    }

    /* access modifiers changed from: protected */
    public final Object i(i.C0109i iVar, Object obj, Object obj2) {
        switch (a.f11535a[iVar.ordinal()]) {
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
                this.f11543e = jVar.c(D(), this.f11543e, dVar.D(), dVar.f11543e);
                this.f11544f = jVar.g(C(), this.f11544f, dVar.C(), dVar.f11544f);
                this.g = jVar.i(E(), this.g, dVar.E(), dVar.g);
                if (jVar == i.h.f11589a) {
                    this.f11542d |= dVar.f11542d;
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
                                this.f11542d |= 1;
                                this.f11543e = eVar.n();
                            } else if (z2 == 16) {
                                this.f11542d |= 2;
                                this.f11544f = eVar.i();
                            } else if (z2 == 25) {
                                this.f11542d |= 4;
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
