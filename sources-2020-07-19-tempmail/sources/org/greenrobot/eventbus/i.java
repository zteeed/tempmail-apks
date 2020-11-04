package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PendingPost */
final class i {

    /* renamed from: d  reason: collision with root package name */
    private static final List<i> f14470d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    Object f14471a;

    /* renamed from: b  reason: collision with root package name */
    p f14472b;

    /* renamed from: c  reason: collision with root package name */
    i f14473c;

    private i(Object obj, p pVar) {
        this.f14471a = obj;
        this.f14472b = pVar;
    }

    static i a(p pVar, Object obj) {
        synchronized (f14470d) {
            int size = f14470d.size();
            if (size <= 0) {
                return new i(obj, pVar);
            }
            i remove = f14470d.remove(size - 1);
            remove.f14471a = obj;
            remove.f14472b = pVar;
            remove.f14473c = null;
            return remove;
        }
    }

    static void b(i iVar) {
        iVar.f14471a = null;
        iVar.f14472b = null;
        iVar.f14473c = null;
        synchronized (f14470d) {
            if (f14470d.size() < 10000) {
                f14470d.add(iVar);
            }
        }
    }
}
