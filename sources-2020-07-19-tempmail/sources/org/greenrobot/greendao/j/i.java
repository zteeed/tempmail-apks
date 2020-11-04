package org.greenrobot.greendao.j;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.j.j;

/* compiled from: WhereCollector */
class i<T> {

    /* renamed from: a  reason: collision with root package name */
    private final a<T, ?> f14568a;

    /* renamed from: b  reason: collision with root package name */
    private final List<j> f14569b = new ArrayList();

    i(a<T, ?> aVar, String str) {
        this.f14568a = aVar;
    }

    /* access modifiers changed from: package-private */
    public void a(j jVar, j... jVarArr) {
        c(jVar);
        this.f14569b.add(jVar);
        for (j jVar2 : jVarArr) {
            c(jVar2);
            this.f14569b.add(jVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(StringBuilder sb, String str, List<Object> list) {
        ListIterator<j> listIterator = this.f14569b.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.hasPrevious()) {
                sb.append(" AND ");
            }
            j next = listIterator.next();
            next.b(sb, str);
            next.a(list);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(j jVar) {
        if (jVar instanceof j.b) {
            d(((j.b) jVar).f14573d);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(f fVar) {
        a<T, ?> aVar = this.f14568a;
        if (aVar != null) {
            f[] r = aVar.r();
            int length = r.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (fVar == r[i]) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                throw new DaoException("Property '" + fVar.f14511c + "' is not part of " + this.f14568a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f14569b.isEmpty();
    }
}
