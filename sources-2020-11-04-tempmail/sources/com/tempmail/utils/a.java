package com.tempmail.utils;

import com.tempmail.db.EmailAddressTable;
import java.util.Comparator;

/* compiled from: lambda */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ a f13105b = new a();

    private /* synthetic */ a() {
    }

    public final int compare(Object obj, Object obj2) {
        return e.T((EmailAddressTable) obj, (EmailAddressTable) obj2);
    }
}
