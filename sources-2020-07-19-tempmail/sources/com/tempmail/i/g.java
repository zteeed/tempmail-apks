package com.tempmail.i;

import android.view.View;
import com.tempmail.db.DomainTable;

/* compiled from: lambda */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f12324b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DomainTable f12325c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f12326d;

    public /* synthetic */ g(u uVar, DomainTable domainTable, int i) {
        this.f12324b = uVar;
        this.f12325c = domainTable;
        this.f12326d = i;
    }

    public final void onClick(View view) {
        this.f12324b.d(this.f12325c, this.f12326d, view);
    }
}
