package com.tempmail.k;

import android.view.View;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.k.v;

/* compiled from: lambda */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v.a f12864b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EmailAddressTable f12865c;

    public /* synthetic */ k(v.a aVar, EmailAddressTable emailAddressTable) {
        this.f12864b = aVar;
        this.f12865c = emailAddressTable;
    }

    public final void onClick(View view) {
        this.f12864b.M(this.f12865c, view);
    }
}
