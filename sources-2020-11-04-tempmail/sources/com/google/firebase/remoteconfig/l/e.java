package com.google.firebase.remoteconfig.l;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.p;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public final class e extends i<e, a> implements Object {
    /* access modifiers changed from: private */
    public static final e g;
    private static volatile p<e> h;

    /* renamed from: d  reason: collision with root package name */
    private int f12094d;

    /* renamed from: e  reason: collision with root package name */
    private String f12095e = "";

    /* renamed from: f  reason: collision with root package name */
    private j.b<c> f12096f = i.j();

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class a extends i.b<e, a> implements Object {
        /* synthetic */ a(a aVar) {
            this();
        }

        private a() {
            super(e.g);
        }
    }

    static {
        e eVar = new e();
        g = eVar;
        eVar.q();
    }

    private e() {
    }

    public static p<e> F() {
        return g.d();
    }

    public List<c> C() {
        return this.f12096f;
    }

    public String D() {
        return this.f12095e;
    }

    public boolean E() {
        return (this.f12094d & 1) == 1;
    }

    /* access modifiers changed from: protected */
    public final Object i(i.C0109i iVar, Object obj, Object obj2) {
        switch (a.f12084a[iVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return g;
            case 3:
                this.f12096f.o();
                return null;
            case 4:
                return new a((a) null);
            case 5:
                i.j jVar = (i.j) obj;
                e eVar = (e) obj2;
                this.f12095e = jVar.e(E(), this.f12095e, eVar.E(), eVar.f12095e);
                this.f12096f = jVar.f(this.f12096f, eVar.f12096f);
                if (jVar == i.h.f12138a) {
                    this.f12094d |= eVar.f12094d;
                }
                return this;
            case 6:
                com.google.protobuf.e eVar2 = (com.google.protobuf.e) obj;
                g gVar = (g) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int z2 = eVar2.z();
                        if (z2 != 0) {
                            if (z2 == 10) {
                                String x = eVar2.x();
                                this.f12094d = 1 | this.f12094d;
                                this.f12095e = x;
                            } else if (z2 == 18) {
                                if (!this.f12096f.R()) {
                                    this.f12096f = i.s(this.f12096f);
                                }
                                this.f12096f.add((c) eVar2.p(c.H(), gVar));
                            } else if (!y(z2, eVar2)) {
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
                    synchronized (e.class) {
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
