package com.tempmail.t;

import android.content.Context;
import com.android.billingclient.api.j;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.api.models.answers.EmptyResultWrapper;
import com.tempmail.api.models.requests.OneTimePaymentParams;
import com.tempmail.api.models.requests.RemoveAdBody;
import com.tempmail.api.models.requests.RemoveAdSubsParams;
import com.tempmail.api.models.requests.RemoveAdSubscriptionBody;
import com.tempmail.l.b;
import com.tempmail.l.c;
import com.tempmail.utils.m;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RemoveAdPresenter */
public class y implements w {

    /* renamed from: d  reason: collision with root package name */
    public static final String f13082d = "y";

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<x> f13083a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public d.a.y.a f13084b;

    /* renamed from: c  reason: collision with root package name */
    public Context f13085c;

    /* compiled from: RemoveAdPresenter */
    class a extends c<EmptyResultWrapper> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f13086f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, j jVar) {
            super(context);
            this.f13086f = jVar;
        }

        public void c(Throwable th) {
            y.this.d(this.f13086f, (EmptyResultWrapper) null);
        }

        public void d(Throwable th) {
            m.b(y.f13082d, "removeAd onError");
            th.printStackTrace();
        }

        /* renamed from: f */
        public void onNext(EmptyResultWrapper emptyResultWrapper) {
            m.b(y.f13082d, "removeAd onNext");
            if (emptyResultWrapper == null || emptyResultWrapper.getError() != null) {
                y.this.c(this.f13086f, emptyResultWrapper);
            } else {
                y.this.d(this.f13086f, emptyResultWrapper);
            }
        }

        public void onComplete() {
            m.b(y.f13082d, "removeAd onComplete");
        }
    }

    /* compiled from: RemoveAdPresenter */
    class b extends c<EmptyResultWrapper> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f13087f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, j jVar) {
            super(context);
            this.f13087f = jVar;
        }

        public void c(Throwable th) {
            y.this.d(this.f13087f, (EmptyResultWrapper) null);
        }

        public void d(Throwable th) {
            m.b(y.f13082d, "removeAdSubs onError");
            th.printStackTrace();
        }

        /* renamed from: f */
        public void onNext(EmptyResultWrapper emptyResultWrapper) {
            m.b(y.f13082d, "removeAdSubs onNext");
            if (emptyResultWrapper == null || emptyResultWrapper.getError() != null) {
                y.this.c(this.f13087f, emptyResultWrapper);
            } else {
                y.this.d(this.f13087f, emptyResultWrapper);
            }
        }

        public void onComplete() {
            m.b(y.f13082d, "removeAdSubs onComplete");
        }
    }

    public y(Context context, b.a aVar, x xVar, d.a.y.a aVar2) {
        Preconditions.l(aVar, "apiClient cannot be null");
        b.a aVar3 = aVar;
        ArrayList<x> arrayList = this.f13083a;
        Preconditions.l(xVar, "notesView cannot be null!");
        arrayList.add(xVar);
        Preconditions.l(aVar2, "disposable cannot be null!");
        this.f13084b = aVar2;
        Preconditions.l(context, "mainActivity cannot be null!");
        this.f13085c = context;
    }

    public void a(j jVar) {
        this.f13084b.b((d.a.y.b) com.tempmail.l.b.l(true).p(new RemoveAdBody(new OneTimePaymentParams("gp", jVar.g(), jVar.e(), jVar.a()))).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f13085c, jVar)));
    }

    public void b(j jVar) {
        this.f13084b.b((d.a.y.b) com.tempmail.l.b.l(true).k(new RemoveAdSubscriptionBody(new RemoveAdSubsParams("gp", jVar.g(), jVar.e()))).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new b(this.f13085c, jVar)));
    }

    public void c(j jVar, EmptyResultWrapper emptyResultWrapper) {
        Iterator<x> it = this.f13083a.iterator();
        while (it.hasNext()) {
            x next = it.next();
            if (next != null) {
                next.d();
            }
        }
    }

    public void d(j jVar, EmptyResultWrapper emptyResultWrapper) {
        Iterator<x> it = this.f13083a.iterator();
        while (it.hasNext()) {
            x next = it.next();
            if (next != null) {
                next.i(jVar);
            }
        }
    }
}
