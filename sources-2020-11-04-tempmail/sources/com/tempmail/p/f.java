package com.tempmail.p;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.l.b;
import com.tempmail.m.b;
import com.tempmail.m.c;
import d.a.y.a;

/* compiled from: MailboxPresenter */
public class f extends c implements d {

    /* renamed from: f  reason: collision with root package name */
    public b f12962f;

    public f(Context context, b.a aVar, com.tempmail.m.b bVar, a aVar2) {
        super(context, aVar, bVar, aVar2);
        Preconditions.l(bVar, "emailViewListener cannot be null!");
        this.f12962f = bVar;
    }

    public void e(boolean z) {
        this.f12962f.a(z);
    }
}
