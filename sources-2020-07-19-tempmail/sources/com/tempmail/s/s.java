package com.tempmail.s;

import android.content.Context;
import com.android.billingclient.api.e;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.api.models.answers.EmptyResultWrapper;
import com.tempmail.api.models.requests.OneTimePaymentParams;
import com.tempmail.api.models.requests.RemoveAdBody;
import com.tempmail.j.b;
import com.tempmail.j.c;
import com.tempmail.utils.m;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RemoveAdPresenter */
public class s implements q {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12500d = "s";

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<r> f12501a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public d.a.y.a f12502b;

    /* renamed from: c  reason: collision with root package name */
    public Context f12503c;

    /* compiled from: RemoveAdPresenter */
    class a extends c<EmptyResultWrapper> {
        final /* synthetic */ e g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, e eVar) {
            super(context);
            this.g = eVar;
        }

        public void c() {
            s.this.b(this.g, (EmptyResultWrapper) null);
        }

        public void d(Throwable th) {
            m.b(s.f12500d, "userActivation onError");
            th.printStackTrace();
        }

        /* renamed from: g */
        public void onNext(EmptyResultWrapper emptyResultWrapper) {
            m.b(s.f12500d, "removeAd onNext");
            if (emptyResultWrapper == null || emptyResultWrapper.getError() != null) {
                s.this.a(this.g, emptyResultWrapper);
            } else {
                s.this.b(this.g, emptyResultWrapper);
            }
        }

        public void onComplete() {
            m.b(s.f12500d, "userActivation onComplete");
        }
    }

    public s(Context context, b.a aVar, r rVar, d.a.y.a aVar2) {
        Preconditions.l(aVar, "apiClient cannot be null");
        b.a aVar3 = aVar;
        ArrayList<r> arrayList = this.f12501a;
        Preconditions.l(rVar, "notesView cannot be null!");
        arrayList.add(rVar);
        Preconditions.l(aVar2, "disposable cannot be null!");
        this.f12502b = aVar2;
        Preconditions.l(context, "mainActivity cannot be null!");
        this.f12503c = context;
    }

    public void a(e eVar, EmptyResultWrapper emptyResultWrapper) {
        Iterator<r> it = this.f12501a.iterator();
        while (it.hasNext()) {
            r next = it.next();
            if (next != null) {
                next.f();
            }
        }
    }

    public void b(e eVar, EmptyResultWrapper emptyResultWrapper) {
        Iterator<r> it = this.f12501a.iterator();
        while (it.hasNext()) {
            r next = it.next();
            if (next != null) {
                next.i();
            }
        }
    }

    public void d(e eVar) {
        this.f12502b.b((d.a.y.b) b.k(true).o(new RemoveAdBody(new OneTimePaymentParams("gp", eVar.f(), eVar.d(), eVar.a()))).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f12503c, eVar)));
    }
}
