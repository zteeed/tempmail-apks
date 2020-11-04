package com.tempmail.i;

import android.view.View;
import com.tempmail.i.s;
import java.io.File;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s.a f12311b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ File f12312c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ com.tempmail.db.a f12313d;

    public /* synthetic */ a(s.a aVar, File file, com.tempmail.db.a aVar2) {
        this.f12311b = aVar;
        this.f12312c = file;
        this.f12313d = aVar2;
    }

    public final void onClick(View view) {
        this.f12311b.S(this.f12312c, this.f12313d, view);
    }
}
