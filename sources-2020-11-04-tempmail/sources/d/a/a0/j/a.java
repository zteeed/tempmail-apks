package d.a.a0.j;

import d.a.s;
import d.a.z.o;

/* compiled from: AppendOnlyLinkedArrayList */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    final int f14463a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f14464b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f14465c;

    /* renamed from: d  reason: collision with root package name */
    int f14466d;

    /* renamed from: d.a.a0.j.a$a  reason: collision with other inner class name */
    /* compiled from: AppendOnlyLinkedArrayList */
    public interface C0156a<T> extends o<T> {
        boolean a(T t);
    }

    public a(int i) {
        this.f14463a = i;
        Object[] objArr = new Object[(i + 1)];
        this.f14464b = objArr;
        this.f14465c = objArr;
    }

    public <U> boolean a(s<? super U> sVar) {
        Object[] objArr = this.f14464b;
        int i = this.f14463a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (m.g(objArr2, sVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(T r4) {
        /*
            r3 = this;
            int r0 = r3.f14463a
            int r1 = r3.f14466d
            if (r1 != r0) goto L_0x0011
            int r1 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r3.f14465c
            r2[r0] = r1
            r3.f14465c = r1
            r1 = 0
        L_0x0011:
            java.lang.Object[] r0 = r3.f14465c
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f14466d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a0.j.a.b(java.lang.Object):void");
    }

    public void c(C0156a<? super T> aVar) {
        int i = this.f14463a;
        for (Object[] objArr = this.f14464b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!aVar.a(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void d(T t) {
        this.f14464b[0] = t;
    }
}
