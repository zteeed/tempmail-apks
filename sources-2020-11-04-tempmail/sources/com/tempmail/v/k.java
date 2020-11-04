package com.tempmail.v;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.api.models.requests.DeleteEmailBody;
import com.tempmail.l.b;
import com.tempmail.m.c;
import com.tempmail.utils.m;
import com.tempmail.utils.s;

/* compiled from: SwitchMailboxPresenter */
public class k extends c implements h {
    public static final String g = "k";

    /* renamed from: f  reason: collision with root package name */
    public i f13156f;

    /* compiled from: SwitchMailboxPresenter */
    class a extends com.tempmail.l.c<SidWrapper> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f13157f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, String str) {
            super(context);
            this.f13157f = str;
        }

        public void c(Throwable th) {
            k.this.f13156f.a(false);
            k.this.f13156f.p();
        }

        public void d(Throwable th) {
            m.b(k.g, "onError");
            th.printStackTrace();
            k.this.f13156f.a(false);
        }

        /* renamed from: f */
        public void onNext(SidWrapper sidWrapper) {
            m.b(k.g, "onNext");
            k.this.f13156f.a(false);
            if (sidWrapper.getError() == null) {
                k.this.f13156f.g(this.f13157f);
            } else {
                k.this.f13156f.j(this.f13157f, sidWrapper.getError());
            }
        }

        public void onComplete() {
            m.b(k.g, "getDomains onComplete");
        }
    }

    public k(Context context, b.a aVar, i iVar, d.a.y.a aVar2) {
        super(context, aVar, iVar, aVar2);
        Preconditions.l(iVar, "switchEmailView cannot be null!");
        this.f13156f = iVar;
    }

    public void c(String str) {
        this.f13156f.a(true);
        this.f12930c.b((d.a.y.b) this.f12928a.j(new DeleteEmailBody(s.L(this.f12931d), str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f12931d, str)));
    }
}
