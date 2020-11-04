package com.tempmail.k;

import android.view.View;
import com.tempmail.db.AttachmentInfoTable;
import com.tempmail.k.s;
import java.io.File;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s.a f12846b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ File f12847c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AttachmentInfoTable f12848d;

    public /* synthetic */ b(s.a aVar, File file, AttachmentInfoTable attachmentInfoTable) {
        this.f12846b = aVar;
        this.f12847c = file;
        this.f12848d = attachmentInfoTable;
    }

    public final void onClick(View view) {
        this.f12846b.T(this.f12847c, this.f12848d, view);
    }
}
