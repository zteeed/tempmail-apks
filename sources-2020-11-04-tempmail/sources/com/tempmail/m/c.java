package com.tempmail.m;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.R;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.api.models.requests.NewMailboxBody;
import com.tempmail.l.b;
import com.tempmail.utils.m;
import com.tempmail.utils.s;

/* compiled from: CreateEmailPresenter */
public class c implements a {

    /* renamed from: e  reason: collision with root package name */
    public static final String f12927e = "c";

    /* renamed from: a  reason: collision with root package name */
    public b.a f12928a;

    /* renamed from: b  reason: collision with root package name */
    public b f12929b;

    /* renamed from: c  reason: collision with root package name */
    public d.a.y.a f12930c;

    /* renamed from: d  reason: collision with root package name */
    public Context f12931d;

    /* compiled from: CreateEmailPresenter */
    class a extends com.tempmail.l.c<SidWrapper> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f12932f;
        final /* synthetic */ String g;
        final /* synthetic */ String h;
        final /* synthetic */ NewMailboxBody i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, boolean z, String str, String str2, NewMailboxBody newMailboxBody) {
            super(context);
            this.f12932f = z;
            this.g = str;
            this.h = str2;
            this.i = newMailboxBody;
        }

        public void c(Throwable th) {
            c.this.f12929b.l(this.i);
            c.this.e(false);
        }

        public void d(Throwable th) {
            c.this.f12929b.k(new ApiError(-1, c.this.f12931d.getString(R.string.error_message_unknown)));
            c.this.e(false);
        }

        /* renamed from: f */
        public void onNext(SidWrapper sidWrapper) {
            m.b(c.f12927e, "onNext");
            c.this.e(false);
            if (sidWrapper.getError() == null) {
                c.this.f12929b.d(this.f12932f, this.g, this.h);
            } else {
                c.this.f12929b.k(sidWrapper.getError());
            }
        }

        public void onComplete() {
            m.b(c.f12927e, "createNewEmailCall onComplete");
        }

        public void onError(Throwable th) {
            m.b(c.f12927e, "onError");
            super.onError(th);
            th.printStackTrace();
        }
    }

    public c(Context context, b.a aVar, b bVar, d.a.y.a aVar2) {
        Preconditions.l(aVar, "apiClient cannot be null");
        this.f12928a = aVar;
        Preconditions.l(bVar, "emailViewListener cannot be null!");
        this.f12929b = bVar;
        Preconditions.l(aVar2, "disposable cannot be null!");
        this.f12930c = aVar2;
        Preconditions.l(context, "mainActivity cannot be null!");
        this.f12931d = context;
    }

    private void d(b.a aVar, boolean z, String str, String str2, String str3) {
        e(true);
        NewMailboxBody newMailboxBody = new NewMailboxBody(s.L(this.f12931d), str, str2);
        this.f12930c.b((d.a.y.b) aVar.c(newMailboxBody).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f12931d, z, str, str2, newMailboxBody)));
    }

    public void a(b.a aVar, NewMailboxBody newMailboxBody) {
        d(aVar, true, newMailboxBody.getParams().getEmail(), newMailboxBody.getParams().getDomain(), (String) null);
    }

    public void b(boolean z, String str, String str2, String str3) {
        d(this.f12928a, z, str, str2, str3);
    }

    public void e(boolean z) {
        this.f12929b.a(z);
    }
}
