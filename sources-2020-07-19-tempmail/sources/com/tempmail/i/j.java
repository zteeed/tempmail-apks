package com.tempmail.i;

import android.view.View;
import com.tempmail.db.DomainTable;
import com.tempmail.i.v;

/* compiled from: lambda */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v.a f12330b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DomainTable f12331c;

    public /* synthetic */ j(v.a aVar, DomainTable domainTable) {
        this.f12330b = aVar;
        this.f12331c = domainTable;
    }

    public final void onClick(View view) {
        this.f12330b.O(this.f12331c, view);
    }
}
