package com.tempmail.k;

import android.view.View;
import com.tempmail.db.AttachmentInfoTable;
import com.tempmail.k.s;
import java.io.File;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s.a f12849b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ File f12850c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AttachmentInfoTable f12851d;

    public /* synthetic */ c(s.a aVar, File file, AttachmentInfoTable attachmentInfoTable) {
        this.f12849b = aVar;
        this.f12850c = file;
        this.f12851d = attachmentInfoTable;
    }

    public final void onClick(View view) {
        this.f12849b.R(this.f12850c, this.f12851d, view);
    }
}
