package com.tempmail.k;

import android.view.View;
import com.tempmail.db.DomainTable;
import com.tempmail.k.v;

/* compiled from: lambda */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v.a f12862b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DomainTable f12863c;

    public /* synthetic */ j(v.a aVar, DomainTable domainTable) {
        this.f12862b = aVar;
        this.f12863c = domainTable;
    }

    public final void onClick(View view) {
        this.f12862b.O(this.f12863c, view);
    }
}
