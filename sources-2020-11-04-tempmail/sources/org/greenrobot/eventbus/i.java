package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PendingPost */
final class i {

    /* renamed from: d  reason: collision with root package name */
    private static final List<i> f15028d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    Object f15029a;

    /* renamed from: b  reason: collision with root package name */
    p f15030b;

    /* renamed from: c  reason: collision with root package name */
    i f15031c;

    private i(Object obj, p pVar) {
        this.f15029a = obj;
        this.f15030b = pVar;
    }

    static i a(p pVar, Object obj) {
        synchronized (f15028d) {
            int size = f15028d.size();
            if (size <= 0) {
                return new i(obj, pVar);
            }
            i remove = f15028d.remove(size - 1);
            remove.f15029a = obj;
            remove.f15030b = pVar;
            remove.f15031c = null;
            return remove;
        }
    }

    static void b(i iVar) {
        iVar.f15029a = null;
        iVar.f15030b = null;
        iVar.f15031c = null;
        synchronized (f15028d) {
            if (f15028d.size() < 10000) {
                f15028d.add(iVar);
            }
        }
    }
}
