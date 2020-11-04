package com.google.firebase.remoteconfig.l;

import com.google.firebase.remoteconfig.l.b;
import com.google.firebase.remoteconfig.l.d;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e;
import com.google.protobuf.g;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.p;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public final class f extends i<f, a> implements Object {
    /* access modifiers changed from: private */
    public static final f j;
    private static volatile p<f> k;

    /* renamed from: d  reason: collision with root package name */
    private int f12097d;

    /* renamed from: e  reason: collision with root package name */
    private b f12098e;

    /* renamed from: f  reason: collision with root package name */
    private b f12099f;
    private b g;
    private d h;
    private j.b<g> i = i.j();

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static final class a extends i.b<f, a> implements Object {
        /* synthetic */ a(a aVar) {
            this();
        }

        private a() {
            super(f.j);
        }
    }

    static {
        f fVar = new f();
        j = fVar;
        fVar.q();
    }

    private f() {
    }

    public static f F(InputStream inputStream) throws IOException {
        return (f) i.u(j, inputStream);
    }

    public b C() {
        b bVar = this.f12099f;
        return bVar == null ? b.C() : bVar;
    }

    public b D() {
        b bVar = this.g;
        return bVar == null ? b.C() : bVar;
    }

    public b E() {
        b bVar = this.f12098e;
        return bVar == null ? b.C() : bVar;
    }

    /* access modifiers changed from: protected */
    public final Object i(i.C0109i iVar, Object obj, Object obj2) {
        switch (a.f12084a[iVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return j;
            case 3:
                this.i.o();
                return null;
            case 4:
                return new a((a) null);
            case 5:
                i.j jVar = (i.j) obj;
                f fVar = (f) obj2;
                this.f12098e = (b) jVar.a(this.f12098e, fVar.f12098e);
                this.f12099f = (b) jVar.a(this.f12099f, fVar.f12099f);
                this.g = (b) jVar.a(this.g, fVar.g);
                this.h = (d) jVar.a(this.h, fVar.h);
                this.i = jVar.f(this.i, fVar.i);
                if (jVar == i.h.f12138a) {
                    this.f12097d |= fVar.f12097d;
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
                                b.a aVar = (this.f12097d & 1) == 1 ? (b.a) this.f12098e.c() : null;
                                b bVar = (b) eVar.p(b.I(), gVar);
                                this.f12098e = bVar;
                                if (aVar != null) {
                                    aVar.p(bVar);
                                    this.f12098e = (b) aVar.j();
                                }
                                this.f12097d |= 1;
                            } else if (z2 == 18) {
                                b.a aVar2 = (this.f12097d & 2) == 2 ? (b.a) this.f12099f.c() : null;
                                b bVar2 = (b) eVar.p(b.I(), gVar);
                                this.f12099f = bVar2;
                                if (aVar2 != null) {
                                    aVar2.p(bVar2);
                                    this.f12099f = (b) aVar2.j();
                                }
                                this.f12097d |= 2;
                            } else if (z2 == 26) {
                                b.a aVar3 = (this.f12097d & 4) == 4 ? (b.a) this.g.c() : null;
                                b bVar3 = (b) eVar.p(b.I(), gVar);
                                this.g = bVar3;
                                if (aVar3 != null) {
                                    aVar3.p(bVar3);
                                    this.g = (b) aVar3.j();
                                }
                                this.f12097d |= 4;
                            } else if (z2 == 34) {
                                d.a aVar4 = (this.f12097d & 8) == 8 ? (d.a) this.h.c() : null;
                                d dVar = (d) eVar.p(d.F(), gVar);
                                this.h = dVar;
                                if (aVar4 != null) {
                                    aVar4.p(dVar);
                                    this.h = (d) aVar4.j();
                                }
                                this.f12097d |= 8;
                            } else if (z2 == 42) {
                                if (!this.i.R()) {
                                    this.i = i.s(this.i);
                                }
                                this.i.add((g) eVar.p(g.F(), gVar));
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
                if (k == null) {
                    synchronized (f.class) {
                        if (k == null) {
                            k = new i.c(j);
                        }
                    }
                }
                return k;
            default:
                throw new UnsupportedOperationException();
        }
        return j;
    }
}
