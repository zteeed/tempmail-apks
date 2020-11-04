package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class v implements Continuation<Void, Task<List<Task<?>>>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Collection f10810a;

    v(Collection collection) {
        this.f10810a = collection;
    }

    public final /* synthetic */ Object then(Task task) throws Exception {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f10810a);
        return Tasks.e(arrayList);
    }
}
