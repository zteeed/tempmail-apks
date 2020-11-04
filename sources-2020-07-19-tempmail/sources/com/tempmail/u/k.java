package com.tempmail.u;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.api.models.requests.DeleteEmailBody;
import com.tempmail.j.b;
import com.tempmail.l.c;
import com.tempmail.utils.m;
import com.tempmail.utils.s;

/* compiled from: SwitchMailboxPresenter */
public class k extends c implements h {
    public static final String g = "k";

    /* renamed from: f  reason: collision with root package name */
    public i f12553f;

    /* compiled from: SwitchMailboxPresenter */
    class a extends com.tempmail.j.c<SidWrapper> {
        final /* synthetic */ String g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, String str) {
            super(context);
            this.g = str;
        }

        public void c() {
            k.this.f12553f.a(false);
            k.this.f12553f.n();
        }

        public void d(Throwable th) {
            m.b(k.g, "onError");
            th.printStackTrace();
            k.this.f12553f.a(false);
        }

        /* renamed from: g */
        public void onNext(SidWrapper sidWrapper) {
            m.b(k.g, "onNext");
            k.this.f12553f.a(false);
            if (sidWrapper.getError() == null) {
                k.this.f12553f.f(this.g);
            } else {
                k.this.f12553f.h(this.g, sidWrapper.getError());
            }
        }

        public void onComplete() {
            m.b(k.g, "getDomains onComplete");
        }
    }

    public k(Context context, b.a aVar, i iVar, d.a.y.a aVar2) {
        super(context, aVar, iVar, aVar2);
        Preconditions.l(iVar, "switchEmailView cannot be null!");
        this.f12553f = iVar;
    }

    public void b(String str) {
        this.f12553f.a(true);
        this.f12428c.b((d.a.y.b) this.f12426a.j(new DeleteEmailBody(s.L(this.f12429d), str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f12429d, str)));
    }
}
