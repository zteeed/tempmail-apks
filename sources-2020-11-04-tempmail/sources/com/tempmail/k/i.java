package com.tempmail.k;

import android.view.View;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.k.v;

/* compiled from: lambda */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v.a f12860b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EmailAddressTable f12861c;

    public /* synthetic */ i(v.a aVar, EmailAddressTable emailAddressTable) {
        this.f12860b = aVar;
        this.f12861c = emailAddressTable;
    }

    public final void onClick(View view) {
        this.f12860b.N(this.f12861c, view);
    }
}
