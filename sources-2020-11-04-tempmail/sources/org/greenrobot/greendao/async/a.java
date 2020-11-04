package org.greenrobot.greendao.async;

/* compiled from: AsyncOperation */
public class a {

    /* renamed from: a  reason: collision with root package name */
    final C0164a f15057a;

    /* renamed from: b  reason: collision with root package name */
    final org.greenrobot.greendao.a<Object, Object> f15058b;

    /* renamed from: c  reason: collision with root package name */
    private final org.greenrobot.greendao.g.a f15059c;

    /* renamed from: d  reason: collision with root package name */
    final Object f15060d;

    /* renamed from: e  reason: collision with root package name */
    final int f15061e;

    /* renamed from: f  reason: collision with root package name */
    volatile long f15062f;
    volatile long g;
    volatile Throwable h;
    volatile Object i;
    volatile int j;

    /* renamed from: org.greenrobot.greendao.async.a$a  reason: collision with other inner class name */
    /* compiled from: AsyncOperation */
    public enum C0164a {
        Insert,
        InsertInTxIterable,
        InsertInTxArray,
        InsertOrReplace,
        InsertOrReplaceInTxIterable,
        InsertOrReplaceInTxArray,
        Update,
        UpdateInTxIterable,
        UpdateInTxArray,
        Delete,
        DeleteInTxIterable,
        DeleteInTxArray,
        DeleteByKey,
        DeleteAll,
        TransactionRunnable,
        TransactionCallable,
        QueryList,
        QueryUnique,
        Load,
        LoadAll,
        Count,
        Refresh
    }

    /* access modifiers changed from: package-private */
    public org.greenrobot.greendao.g.a a() {
        org.greenrobot.greendao.g.a aVar = this.f15059c;
        return aVar != null ? aVar : this.f15058b.getDatabase();
    }

    public boolean b() {
        return this.h != null;
    }

    public boolean c() {
        return (this.f15061e & 1) != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean d(a aVar) {
        return aVar != null && c() && aVar.c() && a() == aVar.a();
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.h = null;
    }

    /* access modifiers changed from: package-private */
    public synchronized void f() {
        notifyAll();
    }
}
