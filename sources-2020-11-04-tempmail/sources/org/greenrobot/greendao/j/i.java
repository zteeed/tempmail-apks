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
    private final a<T, ?> f15137a;

    /* renamed from: b  reason: collision with root package name */
    private final List<j> f15138b = new ArrayList();

    i(a<T, ?> aVar, String str) {
        this.f15137a = aVar;
    }

    /* access modifiers changed from: package-private */
    public void a(j jVar, j... jVarArr) {
        c(jVar);
        this.f15138b.add(jVar);
        for (j jVar2 : jVarArr) {
            c(jVar2);
            this.f15138b.add(jVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(StringBuilder sb, String str, List<Object> list) {
        ListIterator<j> listIterator = this.f15138b.listIterator();
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
            d(((j.b) jVar).f15142d);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(f fVar) {
        a<T, ?> aVar = this.f15137a;
        if (aVar != null) {
            f[] properties = aVar.getProperties();
            int length = properties.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (fVar == properties[i]) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                throw new DaoException("Property '" + fVar.f15077c + "' is not part of " + this.f15137a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f15138b.isEmpty();
    }
}
