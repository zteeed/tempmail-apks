package com.tempmail.l;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.R;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.api.models.requests.NewEmailBody;
import com.tempmail.j.b;
import com.tempmail.j.d;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import java.io.IOException;

/* compiled from: CreateEmailPresenter */
public class c implements a {

    /* renamed from: e  reason: collision with root package name */
    public static final String f12425e = "c";

    /* renamed from: a  reason: collision with root package name */
    public b.a f12426a;

    /* renamed from: b  reason: collision with root package name */
    public b f12427b;

    /* renamed from: c  reason: collision with root package name */
    public d.a.y.a f12428c;

    /* renamed from: d  reason: collision with root package name */
    public Context f12429d;

    /* compiled from: CreateEmailPresenter */
    class a extends d<SidWrapper> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f12430f;
        final /* synthetic */ String g;
        final /* synthetic */ String h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, boolean z, String str, String str2) {
            super(context);
            this.f12430f = z;
            this.g = str;
            this.h = str2;
        }

        /* renamed from: d */
        public void onNext(SidWrapper sidWrapper) {
            m.b(c.f12425e, "onNext");
            c.this.d(false);
            if (sidWrapper.getError() == null) {
                c.this.f12427b.b(this.f12430f, this.g, this.h);
            } else {
                c.this.f12427b.i(sidWrapper.getError());
            }
        }

        public void onComplete() {
            m.b(c.f12425e, "getDomains onComplete");
        }

        public void onError(Throwable th) {
            m.b(c.f12425e, "onError");
            super.onError(th);
            th.printStackTrace();
            if (!(th instanceof IOException)) {
                c.this.f12427b.i(new ApiError(-1, c.this.f12429d.getString(R.string.error_message_unknown)));
            }
            c.this.d(false);
        }
    }

    public c(Context context, b.a aVar, b bVar, d.a.y.a aVar2) {
        Preconditions.l(aVar, "apiClient cannot be null");
        this.f12426a = aVar;
        Preconditions.l(bVar, "emailViewListener cannot be null!");
        this.f12427b = bVar;
        Preconditions.l(aVar2, "disposable cannot be null!");
        this.f12428c = aVar2;
        Preconditions.l(context, "mainActivity cannot be null!");
        this.f12429d = context;
    }

    private void c(boolean z, String str, String str2, String str3) {
        d(true);
        this.f12428c.b((d.a.y.b) this.f12426a.e(new NewEmailBody(s.L(this.f12429d), str, str2)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f12429d, z, str, str2)));
    }

    public void a(boolean z, String str, String str2, String str3) {
        c(z, str, str2, str3);
    }

    public void d(boolean z) {
        this.f12427b.a(z);
    }
}
