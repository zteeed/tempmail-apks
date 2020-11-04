package com.tempmail.k;

import android.view.View;
import com.tempmail.db.AttachmentInfoTable;
import com.tempmail.k.s;
import java.io.File;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s.a f12843b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ File f12844c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AttachmentInfoTable f12845d;

    public /* synthetic */ a(s.a aVar, File file, AttachmentInfoTable attachmentInfoTable) {
        this.f12843b = aVar;
        this.f12844c = file;
        this.f12845d = attachmentInfoTable;
    }

    public final void onClick(View view) {
        this.f12843b.S(this.f12844c, this.f12845d, view);
    }
}
