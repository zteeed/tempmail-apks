package com.tempmail.k;

import android.view.View;
import com.tempmail.db.DomainTable;

/* compiled from: lambda */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f12856b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DomainTable f12857c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f12858d;

    public /* synthetic */ g(u uVar, DomainTable domainTable, int i) {
        this.f12856b = uVar;
        this.f12857c = domainTable;
        this.f12858d = i;
    }

    public final void onClick(View view) {
        this.f12856b.d(this.f12857c, this.f12858d, view);
    }
}
