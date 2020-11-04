package com.tempmail.k;

import android.view.View;
import com.tempmail.db.EmailTable;
import com.tempmail.k.w;

/* compiled from: lambda */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f12866b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w.c f12867c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ EmailTable f12868d;

    public /* synthetic */ l(w wVar, w.c cVar, EmailTable emailTable) {
        this.f12866b = wVar;
        this.f12867c = cVar;
        this.f12868d = emailTable;
    }

    public final void onClick(View view) {
        this.f12866b.x(this.f12867c, this.f12868d, view);
    }
}
