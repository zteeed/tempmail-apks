package com.tempmail.k;

import android.view.View;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.k.x;

/* compiled from: lambda */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x.a f12871b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EmailAddressTable f12872c;

    public /* synthetic */ n(x.a aVar, EmailAddressTable emailAddressTable) {
        this.f12871b = aVar;
        this.f12872c = emailAddressTable;
    }

    public final void onClick(View view) {
        this.f12871b.M(this.f12872c, view);
    }
}
