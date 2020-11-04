package org.greenrobot.greendao.async;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.d;
import org.greenrobot.greendao.j.g;

/* compiled from: AsyncOperationExecutor */
class b implements Runnable, Handler.Callback {

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<a> f15068b = new LinkedBlockingQueue();

    /* renamed from: c  reason: collision with root package name */
    private volatile int f15069c = 50;

    /* renamed from: d  reason: collision with root package name */
    private volatile c f15070d;

    /* renamed from: e  reason: collision with root package name */
    private volatile c f15071e;

    /* renamed from: f  reason: collision with root package name */
    private volatile int f15072f = 50;
    private int g;
    private int h;
    private Handler i;

    /* compiled from: AsyncOperationExecutor */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15073a;

        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.greenrobot.greendao.async.a$a[] r0 = org.greenrobot.greendao.async.a.C0164a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15073a = r0
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.Delete     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.DeleteInTxIterable     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.DeleteInTxArray     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.Insert     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.InsertInTxIterable     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.InsertInTxArray     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.InsertOrReplace     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.InsertOrReplaceInTxIterable     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x006c }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.InsertOrReplaceInTxArray     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x0078 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.Update     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x0084 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.UpdateInTxIterable     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x0090 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.UpdateInTxArray     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x009c }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.TransactionRunnable     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.TransactionCallable     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.QueryList     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.QueryUnique     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x00cc }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.DeleteByKey     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.DeleteAll     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.Load     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.LoadAll     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x00fc }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.Count     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f15073a     // Catch:{ NoSuchFieldError -> 0x0108 }
                org.greenrobot.greendao.async.a$a r1 = org.greenrobot.greendao.async.a.C0164a.Refresh     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.greendao.async.b.a.<clinit>():void");
        }
    }

    static {
        Executors.newCachedThreadPool();
    }

    b() {
    }

    private void a(a aVar) {
        aVar.f15062f = System.currentTimeMillis();
        try {
            switch (a.f15073a[aVar.f15057a.ordinal()]) {
                case 1:
                    aVar.f15058b.delete(aVar.f15060d);
                    break;
                case 2:
                    aVar.f15058b.deleteInTx((Iterable) aVar.f15060d);
                    break;
                case 3:
                    aVar.f15058b.deleteInTx((T[]) (Object[]) aVar.f15060d);
                    break;
                case 4:
                    aVar.f15058b.insert(aVar.f15060d);
                    break;
                case 5:
                    aVar.f15058b.insertInTx((Iterable) aVar.f15060d);
                    break;
                case 6:
                    aVar.f15058b.insertInTx((T[]) (Object[]) aVar.f15060d);
                    break;
                case 7:
                    aVar.f15058b.insertOrReplace(aVar.f15060d);
                    break;
                case 8:
                    aVar.f15058b.insertOrReplaceInTx((Iterable) aVar.f15060d);
                    break;
                case 9:
                    aVar.f15058b.insertOrReplaceInTx((T[]) (Object[]) aVar.f15060d);
                    break;
                case 10:
                    aVar.f15058b.update(aVar.f15060d);
                    break;
                case 11:
                    aVar.f15058b.updateInTx((Iterable) aVar.f15060d);
                    break;
                case 12:
                    aVar.f15058b.updateInTx((T[]) (Object[]) aVar.f15060d);
                    break;
                case 13:
                    d(aVar);
                    break;
                case 14:
                    c(aVar);
                    break;
                case 15:
                    aVar.i = ((g) aVar.f15060d).f().h();
                    break;
                case 16:
                    aVar.i = ((g) aVar.f15060d).f().j();
                    break;
                case 17:
                    aVar.f15058b.deleteByKey(aVar.f15060d);
                    break;
                case 18:
                    aVar.f15058b.deleteAll();
                    break;
                case 19:
                    aVar.i = aVar.f15058b.load(aVar.f15060d);
                    break;
                case 20:
                    aVar.i = aVar.f15058b.loadAll();
                    break;
                case 21:
                    aVar.i = Long.valueOf(aVar.f15058b.count());
                    break;
                case 22:
                    aVar.f15058b.refresh(aVar.f15060d);
                    break;
                default:
                    throw new DaoException("Unsupported operation: " + aVar.f15057a);
            }
        } catch (Throwable th) {
            aVar.h = th;
        }
        aVar.g = System.currentTimeMillis();
    }

    private void b(a aVar) {
        a(aVar);
        e(aVar);
    }

    private void c(a aVar) throws Exception {
        org.greenrobot.greendao.g.a a2 = aVar.a();
        a2.a();
        try {
            aVar.i = ((Callable) aVar.f15060d).call();
            a2.e();
        } finally {
            a2.i();
        }
    }

    private void d(a aVar) {
        org.greenrobot.greendao.g.a a2 = aVar.a();
        a2.a();
        try {
            ((Runnable) aVar.f15060d).run();
            a2.e();
        } finally {
            a2.i();
        }
    }

    private void e(a aVar) {
        aVar.f();
        c cVar = this.f15070d;
        if (cVar != null) {
            cVar.a(aVar);
        }
        if (this.f15071e != null) {
            if (this.i == null) {
                this.i = new Handler(Looper.getMainLooper(), this);
            }
            this.i.sendMessage(this.i.obtainMessage(1, aVar));
        }
        synchronized (this) {
            int i2 = this.h + 1;
            this.h = i2;
            if (i2 == this.g) {
                notifyAll();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        r4 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(org.greenrobot.greendao.async.a r8, org.greenrobot.greendao.async.a r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Async transaction could not be ended, success so far was: "
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r8)
            r1.add(r9)
            org.greenrobot.greendao.g.a r8 = r8.a()
            r8.a()
            r9 = 0
            r2 = 0
        L_0x0016:
            int r3 = r1.size()     // Catch:{ all -> 0x00b5 }
            r4 = 1
            if (r2 >= r3) goto L_0x0063
            java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x00b5 }
            org.greenrobot.greendao.async.a r3 = (org.greenrobot.greendao.async.a) r3     // Catch:{ all -> 0x00b5 }
            r7.a(r3)     // Catch:{ all -> 0x00b5 }
            boolean r5 = r3.b()     // Catch:{ all -> 0x00b5 }
            if (r5 == 0) goto L_0x002d
            goto L_0x0063
        L_0x002d:
            int r5 = r1.size()     // Catch:{ all -> 0x00b5 }
            int r5 = r5 - r4
            if (r2 != r5) goto L_0x0060
            java.util.concurrent.BlockingQueue<org.greenrobot.greendao.async.a> r5 = r7.f15068b     // Catch:{ all -> 0x00b5 }
            java.lang.Object r5 = r5.peek()     // Catch:{ all -> 0x00b5 }
            org.greenrobot.greendao.async.a r5 = (org.greenrobot.greendao.async.a) r5     // Catch:{ all -> 0x00b5 }
            int r6 = r7.f15069c     // Catch:{ all -> 0x00b5 }
            if (r2 >= r6) goto L_0x005c
            boolean r3 = r3.d(r5)     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x005c
            java.util.concurrent.BlockingQueue<org.greenrobot.greendao.async.a> r3 = r7.f15068b     // Catch:{ all -> 0x00b5 }
            java.lang.Object r3 = r3.remove()     // Catch:{ all -> 0x00b5 }
            org.greenrobot.greendao.async.a r3 = (org.greenrobot.greendao.async.a) r3     // Catch:{ all -> 0x00b5 }
            if (r3 != r5) goto L_0x0054
            r1.add(r3)     // Catch:{ all -> 0x00b5 }
            goto L_0x0060
        L_0x0054:
            org.greenrobot.greendao.DaoException r1 = new org.greenrobot.greendao.DaoException     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "Internal error: peeked op did not match removed op"
            r1.<init>(r2)     // Catch:{ all -> 0x00b5 }
            throw r1     // Catch:{ all -> 0x00b5 }
        L_0x005c:
            r8.e()     // Catch:{ all -> 0x00b5 }
            goto L_0x0064
        L_0x0060:
            int r2 = r2 + 1
            goto L_0x0016
        L_0x0063:
            r4 = 0
        L_0x0064:
            r8.i()     // Catch:{ RuntimeException -> 0x0069 }
            r9 = r4
            goto L_0x007c
        L_0x0069:
            r8 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            org.greenrobot.greendao.d.d(r0, r8)
        L_0x007c:
            if (r9 == 0) goto L_0x0098
            int r8 = r1.size()
            java.util.Iterator r9 = r1.iterator()
        L_0x0086:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r0 = r9.next()
            org.greenrobot.greendao.async.a r0 = (org.greenrobot.greendao.async.a) r0
            r0.j = r8
            r7.e(r0)
            goto L_0x0086
        L_0x0098:
            java.lang.String r8 = "Reverted merged transaction because one of the operations failed. Executing operations one by one instead..."
            org.greenrobot.greendao.d.c(r8)
            java.util.Iterator r8 = r1.iterator()
        L_0x00a1:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00b4
            java.lang.Object r9 = r8.next()
            org.greenrobot.greendao.async.a r9 = (org.greenrobot.greendao.async.a) r9
            r9.e()
            r7.b(r9)
            goto L_0x00a1
        L_0x00b4:
            return
        L_0x00b5:
            r1 = move-exception
            r8.i()     // Catch:{ RuntimeException -> 0x00ba }
            goto L_0x00cd
        L_0x00ba:
            r8 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            org.greenrobot.greendao.d.d(r9, r8)
        L_0x00cd:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.greendao.async.b.f(org.greenrobot.greendao.async.a, org.greenrobot.greendao.async.a):void");
    }

    public boolean handleMessage(Message message) {
        c cVar = this.f15071e;
        if (cVar == null) {
            return false;
        }
        cVar.a((a) message.obj);
        return false;
    }

    public void run() {
        a poll;
        while (true) {
            try {
                a poll2 = this.f15068b.poll(1, TimeUnit.SECONDS);
                if (poll2 == null) {
                    synchronized (this) {
                        poll2 = (a) this.f15068b.poll();
                        if (poll2 == null) {
                            return;
                        }
                    }
                }
                if (!poll2.c() || (poll = this.f15068b.poll((long) this.f15072f, TimeUnit.MILLISECONDS)) == null) {
                    b(poll2);
                } else if (poll2.d(poll)) {
                    f(poll2, poll);
                } else {
                    b(poll2);
                    b(poll);
                }
            } catch (InterruptedException e2) {
                d.f(Thread.currentThread().getName() + " was interruppted", e2);
                return;
            }
        }
    }
}
