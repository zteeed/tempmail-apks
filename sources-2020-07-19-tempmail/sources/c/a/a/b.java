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
    public static final b f2336e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile p<b> f2337f;

    /* renamed from: d  reason: collision with root package name */
    private String f2338d = "";

    /* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
    public static final class a extends i.b<b, a> implements Object {
        /* synthetic */ a(a aVar) {
            this();
        }

        private a() {
            super(b.f2336e);
        }
    }

    static {
        b bVar = new b();
        f2336e = bVar;
        bVar.q();
    }

    private b() {
    }

    public static p<b> C() {
        return f2336e.d();
    }

    /* access modifiers changed from: protected */
    public final Object i(i.C0109i iVar, Object obj, Object obj2) {
        switch (a.f2335a[iVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return f2336e;
            case 3:
                return null;
            case 4:
                return new a((a) null);
            case 5:
                b bVar = (b) obj2;
                this.f2338d = ((i.j) obj).e(!this.f2338d.isEmpty(), this.f2338d, true ^ bVar.f2338d.isEmpty(), bVar.f2338d);
                i.h hVar = i.h.f11589a;
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
                                this.f2338d = eVar.y();
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
                if (f2337f == null) {
                    synchronized (b.class) {
                        if (f2337f == null) {
                            f2337f = new i.c(f2336e);
                        }
                    }
                }
                return f2337f;
            default:
                throw new UnsupportedOperationException();
        }
        return f2336e;
    }
}
