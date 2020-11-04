package c.a.a;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e;
import com.google.protobuf.g;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.p;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public final class c extends i<c, a> implements Object {
    /* access modifiers changed from: private */
    public static final c r;
    private static volatile p<c> s;

    /* renamed from: d  reason: collision with root package name */
    private int f2477d;

    /* renamed from: e  reason: collision with root package name */
    private String f2478e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f2479f = "";
    private long g;
    private String h = "";
    private long i;
    private long j;
    private String k = "";
    private String l = "";
    private String m = "";
    private String n = "";
    private String o = "";
    private int p;
    private j.b<b> q = i.j();

    /* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
    public static final class a extends i.b<c, a> implements Object {
        /* synthetic */ a(a aVar) {
            this();
        }

        private a() {
            super(c.r);
        }
    }

    static {
        c cVar = new c();
        r = cVar;
        cVar.q();
    }

    private c() {
    }

    public static c J(byte[] bArr) throws InvalidProtocolBufferException {
        return (c) i.v(r, bArr);
    }

    public String C() {
        return this.f2478e;
    }

    public long D() {
        return this.g;
    }

    public long E() {
        return this.j;
    }

    public String F() {
        return this.h;
    }

    public long H() {
        return this.i;
    }

    public String I() {
        return this.f2479f;
    }

    /* access modifiers changed from: protected */
    public final Object i(i.C0109i iVar, Object obj, Object obj2) {
        boolean z = false;
        switch (a.f2473a[iVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return r;
            case 3:
                this.q.o();
                return null;
            case 4:
                return new a((a) null);
            case 5:
                i.j jVar = (i.j) obj;
                c cVar = (c) obj2;
                this.f2478e = jVar.e(!this.f2478e.isEmpty(), this.f2478e, !cVar.f2478e.isEmpty(), cVar.f2478e);
                this.f2479f = jVar.e(!this.f2479f.isEmpty(), this.f2479f, !cVar.f2479f.isEmpty(), cVar.f2479f);
                this.g = jVar.i(this.g != 0, this.g, cVar.g != 0, cVar.g);
                this.h = jVar.e(!this.h.isEmpty(), this.h, !cVar.h.isEmpty(), cVar.h);
                this.i = jVar.i(this.i != 0, this.i, cVar.i != 0, cVar.i);
                this.j = jVar.i(this.j != 0, this.j, cVar.j != 0, cVar.j);
                this.k = jVar.e(!this.k.isEmpty(), this.k, !cVar.k.isEmpty(), cVar.k);
                this.l = jVar.e(!this.l.isEmpty(), this.l, !cVar.l.isEmpty(), cVar.l);
                this.m = jVar.e(!this.m.isEmpty(), this.m, !cVar.m.isEmpty(), cVar.m);
                this.n = jVar.e(!this.n.isEmpty(), this.n, !cVar.n.isEmpty(), cVar.n);
                this.o = jVar.e(!this.o.isEmpty(), this.o, !cVar.o.isEmpty(), cVar.o);
                boolean z2 = this.p != 0;
                int i2 = this.p;
                if (cVar.p != 0) {
                    z = true;
                }
                this.p = jVar.c(z2, i2, z, cVar.p);
                this.q = jVar.f(this.q, cVar.q);
                if (jVar == i.h.f12138a) {
                    this.f2477d |= cVar.f2477d;
                }
                return this;
            case 6:
                e eVar = (e) obj;
                g gVar = (g) obj2;
                while (!z) {
                    try {
                        int z3 = eVar.z();
                        switch (z3) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.f2478e = eVar.y();
                                break;
                            case 18:
                                this.f2479f = eVar.y();
                                break;
                            case 24:
                                this.g = eVar.o();
                                break;
                            case 34:
                                this.h = eVar.y();
                                break;
                            case 40:
                                this.i = eVar.o();
                                break;
                            case 48:
                                this.j = eVar.o();
                                break;
                            case 58:
                                this.k = eVar.y();
                                break;
                            case 66:
                                this.l = eVar.y();
                                break;
                            case 74:
                                this.m = eVar.y();
                                break;
                            case 82:
                                this.n = eVar.y();
                                break;
                            case 90:
                                this.o = eVar.y();
                                break;
                            case 96:
                                this.p = eVar.k();
                                break;
                            case 106:
                                if (!this.q.R()) {
                                    this.q = i.s(this.q);
                                }
                                this.q.add((b) eVar.p(b.C(), gVar));
                                break;
                            default:
                                if (eVar.C(z3)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
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
                if (s == null) {
                    synchronized (c.class) {
                        if (s == null) {
                            s = new i.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
    }
}
