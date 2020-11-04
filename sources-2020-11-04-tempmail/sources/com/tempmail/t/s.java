package com.tempmail.t;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.l.b;
import com.tempmail.r.m;
import d.a.y.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MainPresenter */
public abstract class s {

    /* renamed from: f  reason: collision with root package name */
    public static final String f13069f = "s";

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<m> f13070a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<m> f13071b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public b.a f13072c;

    /* renamed from: d  reason: collision with root package name */
    public a f13073d;

    /* renamed from: e  reason: collision with root package name */
    public Context f13074e;

    public s(Context context, b.a aVar, m mVar, a aVar2) {
        Preconditions.l(aVar, "apiClient cannot be null");
        this.f13072c = aVar;
        ArrayList<m> arrayList = this.f13070a;
        Preconditions.l(mVar, "notesView cannot be null!");
        arrayList.add(mVar);
        Preconditions.l(aVar2, "disposable cannot be null!");
        this.f13073d = aVar2;
        Preconditions.l(context, "mainActivity cannot be null!");
        this.f13074e = context;
    }

    public void g(m mVar) {
        if (!this.f13071b.contains(mVar)) {
            this.f13071b.add(mVar);
        }
    }

    public void h(m mVar) {
        this.f13071b.remove(mVar);
    }

    public void i(b.a aVar) {
        this.f13072c = aVar;
    }

    public void j(boolean z) {
        String str = f13069f;
        com.tempmail.utils.m.b(str, "showLoadingInbox " + this.f13071b.size());
        Iterator<m> it = this.f13071b.iterator();
        while (it.hasNext()) {
            m next = it.next();
            if (next != null) {
                next.a(z);
            }
        }
    }

    public void k(boolean z) {
        Iterator<m> it = this.f13070a.iterator();
        while (it.hasNext()) {
            m next = it.next();
            if (next != null) {
                next.a(z);
            }
        }
    }

    public void l(String str, List<ExtendedMail> list) {
        Iterator<m> it = this.f13070a.iterator();
        while (it.hasNext()) {
            m next = it.next();
            if (next != null) {
                next.O(str, list);
            }
        }
        Iterator<m> it2 = this.f13071b.iterator();
        while (it2.hasNext()) {
            m next2 = it2.next();
            if (next2 != null) {
                next2.O(str, list);
            }
        }
    }

    public void m(Throwable th) {
        Iterator<m> it = this.f13070a.iterator();
        while (it.hasNext()) {
            m next = it.next();
            if (next != null) {
                next.h(th);
            }
        }
        Iterator<m> it2 = this.f13071b.iterator();
        while (it2.hasNext()) {
            m next2 = it2.next();
            if (next2 != null) {
                next2.h(th);
            }
        }
    }

    public void n() {
        Iterator<m> it = this.f13070a.iterator();
        while (it.hasNext()) {
            m next = it.next();
            if (next != null) {
                next.x();
            }
        }
        Iterator<m> it2 = this.f13071b.iterator();
        while (it2.hasNext()) {
            m next2 = it2.next();
            if (next2 != null) {
                next2.x();
            }
        }
    }
}
