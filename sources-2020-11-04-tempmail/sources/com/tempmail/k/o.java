package com.tempmail.k;

import android.view.View;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.k.x;

/* compiled from: lambda */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f12873b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EmailAddressTable f12874c;

    public /* synthetic */ o(x.a aVar, EmailAddressTable emailAddressTable) {
        this.f12873b = aVar;
        this.f12874c = emailAddressTable;
    }

    public final void onClick(View view) {
        this.f12873b.P(this.f12874c, view);
    }
}
