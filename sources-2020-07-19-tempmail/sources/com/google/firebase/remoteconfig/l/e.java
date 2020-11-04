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
    private int f11545d;

    /* renamed from: e  reason: collision with root package name */
    private String f11546e = "";

    /* renamed from: f  reason: collision with root package name */
    private j.b<c> f11547f = i.j();

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
        return this.f11547f;
    }

    public String D() {
        return this.f11546e;
    }

    public boolean E() {
        return (this.f11545d & 1) == 1;
    }

    /* access modifiers changed from: protected */
    public final Object i(i.C0109i iVar, Object obj, Object obj2) {
        switch (a.f11535a[iVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return g;
            case 3:
                this.f11547f.o();
                return null;
            case 4:
                return new a((a) null);
            case 5:
                i.j jVar = (i.j) obj;
                e eVar = (e) obj2;
                this.f11546e = jVar.e(E(), this.f11546e, eVar.E(), eVar.f11546e);
                this.f11547f = jVar.f(this.f11547f, eVar.f11547f);
                if (jVar == i.h.f11589a) {
                    this.f11545d |= eVar.f11545d;
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
                                this.f11545d = 1 | this.f11545d;
                                this.f11546e = x;
                            } else if (z2 == 18) {
                                if (!this.f11547f.R()) {
                                    this.f11547f = i.s(this.f11547f);
                                }
                                this.f11547f.add((c) eVar2.p(c.H(), gVar));
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
