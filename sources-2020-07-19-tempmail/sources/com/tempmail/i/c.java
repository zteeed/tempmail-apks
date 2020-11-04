package com.tempmail.i;

import android.view.View;
import com.tempmail.db.a;
import com.tempmail.i.s;
import java.io.File;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s.a f12317b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ File f12318c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f12319d;

    public /* synthetic */ c(s.a aVar, File file, a aVar2) {
        this.f12317b = aVar;
        this.f12318c = file;
        this.f12319d = aVar2;
    }

    public final void onClick(View view) {
        this.f12317b.R(this.f12318c, this.f12319d, view);
    }
}
