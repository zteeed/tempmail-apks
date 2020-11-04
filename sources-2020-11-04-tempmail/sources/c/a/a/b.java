package c.a.a;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e;
import com.google.protobuf.g;
import com.google.protobuf.i;
import com.google.protobuf.p;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public final class b extends i<b, a> implements Object {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final b f2474e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile p<b> f2475f;

    /* renamed from: d  reason: collision with root package name */
    private String f2476d = "";

    /* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
    public static final class a extends i.b<b, a> implements Object {
        /* synthetic */ a(a aVar) {
            this();
        }

        private a() {
            super(b.f2474e);
        }
    }

    static {
        b bVar = new b();
        f2474e = bVar;
        bVar.q();
    }

    private b() {
    }

    public static p<b> C() {
        return f2474e.d();
    }

    /* access modifiers changed from: protected */
    public final Object i(i.C0109i iVar, Object obj, Object obj2) {
        switch (a.f2473a[iVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return f2474e;
            case 3:
                return null;
            case 4:
                return new a((a) null);
            case 5:
                b bVar = (b) obj2;
                this.f2476d = ((i.j) obj).e(!this.f2476d.isEmpty(), this.f2476d, true ^ bVar.f2476d.isEmpty(), bVar.f2476d);
                i.h hVar = i.h.f12138a;
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
                                this.f2476d = eVar.y();
                            } else if (!eVar.C(z2)) {
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
                if (f2475f == null) {
                    synchronized (b.class) {
                        if (f2475f == null) {
                            f2475f = new i.c(f2474e);
                        }
                    }
                }
                return f2475f;
            default:
                throw new UnsupportedOperationException();
        }
        return f2474e;
    }
}
