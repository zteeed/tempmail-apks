package com.tempmail.o;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.j.b;
import com.tempmail.l.b;
import com.tempmail.l.c;
import d.a.y.a;

/* compiled from: MailboxPresenter */
public class e extends c implements c {

    /* renamed from: f  reason: collision with root package name */
    public b f12452f;

    public e(Context context, b.a aVar, com.tempmail.l.b bVar, a aVar2) {
        super(context, aVar, bVar, aVar2);
        Preconditions.l(bVar, "emailViewListener cannot be null!");
        this.f12452f = bVar;
    }

    public void d(boolean z) {
        this.f12452f.a(z);
    }
}
