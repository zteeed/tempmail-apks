package com.tempmail.t;

import android.content.Context;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.l.b;
import com.tempmail.l.d;
import com.tempmail.r.l;
import com.tempmail.utils.m;
import com.tempmail.utils.x;
import java.util.List;

/* compiled from: FreeMainPresenter */
public class p extends s implements l {
    public static final String g = "p";

    /* compiled from: FreeMainPresenter */
    class a extends d<List<ExtendedMail>> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f13067e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, String str) {
            super(context);
            this.f13067e = str;
        }

        public void c(Throwable th) {
            p.this.j(false);
            p.this.n();
        }

        public void d(Throwable th) {
            m.b(p.g, "onError");
            th.printStackTrace();
            p.this.m(th);
            p.this.j(false);
        }

        /* renamed from: e */
        public void onNext(List<ExtendedMail> list) {
            m.b(p.g, "onNext");
            p.this.l(this.f13067e, list);
            p.this.j(false);
        }

        public void onComplete() {
            m.b(p.g, "getInboxList onComplete");
        }
    }

    public p(Context context, b.a aVar, com.tempmail.r.m mVar, d.a.y.a aVar2) {
        super(context, aVar, mVar, aVar2);
    }

    public void c(String str) {
        String str2 = g;
        m.b(str2, "getInboxList " + str);
        j(true);
        this.f13073d.b((d.a.y.b) this.f13072c.e(x.k(str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f13074e, str)));
    }
}
