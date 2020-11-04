package com.tempmail.s;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.j.b;
import d.a.y.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MainPresenter */
public abstract class m {

    /* renamed from: f  reason: collision with root package name */
    public static final String f12494f = "m";

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<com.tempmail.q.m> f12495a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<com.tempmail.q.m> f12496b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public b.a f12497c;

    /* renamed from: d  reason: collision with root package name */
    public a f12498d;

    /* renamed from: e  reason: collision with root package name */
    public Context f12499e;

    public m(Context context, b.a aVar, com.tempmail.q.m mVar, a aVar2) {
        Preconditions.l(aVar, "apiClient cannot be null");
        this.f12497c = aVar;
        ArrayList<com.tempmail.q.m> arrayList = this.f12495a;
        Preconditions.l(mVar, "notesView cannot be null!");
        arrayList.add(mVar);
        Preconditions.l(aVar2, "disposable cannot be null!");
        this.f12498d = aVar2;
        Preconditions.l(context, "mainActivity cannot be null!");
        this.f12499e = context;
    }

    public void g(com.tempmail.q.m mVar) {
        if (!this.f12496b.contains(mVar)) {
            this.f12496b.add(mVar);
        }
    }

    public void h(com.tempmail.q.m mVar) {
        this.f12496b.remove(mVar);
    }

    public void i(b.a aVar) {
        this.f12497c = aVar;
    }

    public void j(boolean z) {
        String str = f12494f;
        com.tempmail.utils.m.b(str, "showLoadingInbox " + this.f12496b.size());
        Iterator<com.tempmail.q.m> it = this.f12496b.iterator();
        while (it.hasNext()) {
            com.tempmail.q.m next = it.next();
            if (next != null) {
                next.a(z);
            }
        }
    }

    public void k(boolean z) {
        Iterator<com.tempmail.q.m> it = this.f12495a.iterator();
        while (it.hasNext()) {
            com.tempmail.q.m next = it.next();
            if (next != null) {
                next.a(z);
            }
        }
    }

    public void l(String str, List<ExtendedMail> list) {
        Iterator<com.tempmail.q.m> it = this.f12495a.iterator();
        while (it.hasNext()) {
            com.tempmail.q.m next = it.next();
            if (next != null) {
                next.Q(str, list);
            }
        }
        Iterator<com.tempmail.q.m> it2 = this.f12496b.iterator();
        while (it2.hasNext()) {
            com.tempmail.q.m next2 = it2.next();
            if (next2 != null) {
                next2.Q(str, list);
            }
        }
    }

    public void m(Throwable th) {
        Iterator<com.tempmail.q.m> it = this.f12495a.iterator();
        while (it.hasNext()) {
            com.tempmail.q.m next = it.next();
            if (next != null) {
                next.j(th);
            }
        }
        Iterator<com.tempmail.q.m> it2 = this.f12496b.iterator();
        while (it2.hasNext()) {
            com.tempmail.q.m next2 = it2.next();
            if (next2 != null) {
                next2.j(th);
            }
        }
    }

    public void n() {
        Iterator<com.tempmail.q.m> it = this.f12495a.iterator();
        while (it.hasNext()) {
            com.tempmail.q.m next = it.next();
            if (next != null) {
                next.y();
            }
        }
        Iterator<com.tempmail.q.m> it2 = this.f12496b.iterator();
        while (it2.hasNext()) {
            com.tempmail.q.m next2 = it2.next();
            if (next2 != null) {
                next2.y();
            }
        }
    }
}
