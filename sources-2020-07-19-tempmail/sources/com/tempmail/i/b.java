package com.tempmail.i;

import android.view.View;
import com.tempmail.db.a;
import com.tempmail.i.s;
import java.io.File;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s.a f12314b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ File f12315c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f12316d;

    public /* synthetic */ b(s.a aVar, File file, a aVar2) {
        this.f12314b = aVar;
        this.f12315c = file;
        this.f12316d = aVar2;
    }

    public final void onClick(View view) {
        this.f12314b.T(this.f12315c, this.f12316d, view);
    }
}
