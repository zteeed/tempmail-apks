package com.tempmail.s;

import android.content.Context;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.j.b;
import com.tempmail.j.e;
import com.tempmail.q.l;
import com.tempmail.utils.m;
import com.tempmail.utils.w;
import java.util.List;

/* compiled from: FreeMainPresenter */
public class j extends m implements l {
    public static final String g = "j";

    /* compiled from: FreeMainPresenter */
    class a extends e<List<ExtendedMail>> {
        final /* synthetic */ String g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, String str) {
            super(context);
            this.g = str;
        }

        public void c() {
            j.this.j(false);
            j.this.n();
        }

        public void d(Throwable th) {
            m.b(j.g, "onError");
            th.printStackTrace();
            j.this.m(th);
            j.this.j(false);
        }

        /* renamed from: f */
        public void onNext(List<ExtendedMail> list) {
            m.b(j.g, "onNext");
            j.this.l(this.g, list);
            j.this.j(false);
        }

        public void onComplete() {
            m.b(j.g, "getInboxList onComplete");
        }
    }

    public j(Context context, b.a aVar, com.tempmail.q.m mVar, d.a.y.a aVar2) {
        super(context, aVar, mVar, aVar2);
    }

    public void c(String str) {
        String str2 = g;
        m.b(str2, "getInboxList " + str);
        j(true);
        this.f12498d.b((d.a.y.b) this.f12497c.d(w.j(str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f12499e, str)));
    }
}
