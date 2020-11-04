package com.google.firebase.remoteconfig.l;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d;
import com.google.protobuf.e;
import com.google.protobuf.g;
import com.google.protobuf.i;
import com.google.protobuf.p;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public final class c extends i<c, a> implements Object {
    /* access modifiers changed from: private */
    public static final c g;
    private static volatile p<c> h;

    /* renamed from: d  reason: collision with root package name */
    private int f11539d;

    /* renamed from: e  reason: collision with root package name */
    private String f11540e = "";

    /* renamed from: f  reason: collision with root package name */
    private d f11541f = d.f11556c;

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class a extends i.b<c, a> implements Object {
        /* synthetic */ a(a aVar) {
            this();
        }

        private a() {
            super(c.g);
        }
    }

    static {
        c cVar = new c();
        g = cVar;
        cVar.q();
    }

    private c() {
    }

    public static p<c> H() {
        return g.d();
    }

    public String C() {
        return this.f11540e;
    }

    public d D() {
        return this.f11541f;
    }

    public boolean E() {
        return (this.f11539d & 1) == 1;
    }

    public boolean F() {
        return (this.f11539d & 2) == 2;
    }

    /* access modifiers changed from: protected */
    public final Object i(i.C0109i iVar, Object obj, Object obj2) {
        switch (a.f11535a[iVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return g;
            case 3:
                return null;
            case 4:
                return new a((a) null);
            case 5:
                i.j jVar = (i.j) obj;
                c cVar = (c) obj2;
                this.f11540e = jVar.e(E(), this.f11540e, cVar.E(), cVar.f11540e);
                this.f11541f = jVar.h(F(), this.f11541f, cVar.F(), cVar.f11541f);
                if (jVar == i.h.f11589a) {
                    this.f11539d |= cVar.f11539d;
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
                                String x = eVar.x();
                                this.f11539d = 1 | this.f11539d;
                                this.f11540e = x;
                            } else if (z2 == 18) {
                                this.f11539d |= 2;
                                this.f11541f = eVar.j();
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
                if (h == null) {
                    synchronized (c.class) {
                        if (h == null) {
                            h = new i.c(g);
                        }
                    }
                }
                return h;
            default:
                throw new UnsupportedOperationException();
        }
        return g;
    }
}
