package com.tempmail.k;

import android.view.View;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.k.x;

/* compiled from: lambda */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f12876b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EmailAddressTable f12877c;

    public /* synthetic */ q(x.a aVar, EmailAddressTable emailAddressTable) {
        this.f12876b = aVar;
        this.f12877c = emailAddressTable;
    }

    public final void onClick(View view) {
        this.f12876b.N(this.f12877c, view);
    }
}
