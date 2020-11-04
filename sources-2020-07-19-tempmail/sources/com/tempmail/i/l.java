package com.tempmail.i;

import android.view.View;
import com.tempmail.db.f;
import com.tempmail.i.w;

/* compiled from: lambda */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f12334b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w.c f12335c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f12336d;

    public /* synthetic */ l(w wVar, w.c cVar, f fVar) {
        this.f12334b = wVar;
        this.f12335c = cVar;
        this.f12336d = fVar;
    }

    public final void onClick(View view) {
        this.f12334b.x(this.f12335c, this.f12336d, view);
    }
}
