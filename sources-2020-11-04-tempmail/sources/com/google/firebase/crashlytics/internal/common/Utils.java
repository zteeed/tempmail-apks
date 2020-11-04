package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Utils {
    private static final FilenameFilter ALL_FILES_FILTER = new FilenameFilter() {
        public boolean accept(File file, String str) {
            return true;
        }
    };
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    private Utils() {
    }

    public static <T> T awaitEvenIfOnMainThread(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.j(TASK_CONTINUATION_EXECUTOR_SERVICE, new Continuation<T, Object>() {
            public Object then(Task<T> task) throws Exception {
                countDownLatch.countDown();
                return null;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (task.q()) {
            return task.n();
        }
        throw new TimeoutException();
    }

    public static <T> Task<T> callTask(Executor executor, final Callable<Task<T>> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() {
            public void run() {
                try {
                    ((Task) callable.call()).i(new Continuation<T, Void>() {
                        public Void then(Task<T> task) throws Exception {
                            if (task.r()) {
                                taskCompletionSource.c(task.n());
                                return null;
                            }
                            taskCompletionSource.b(task.m());
                            return null;
                        }
                    });
                } catch (Exception e2) {
                    taskCompletionSource.b(e2);
                }
            }
        });
        return taskCompletionSource.a();
    }

    static int capFileCount(File file, int i, Comparator<File> comparator) {
        return capFileCount(file, ALL_FILES_FILTER, i, comparator);
    }

    static int capSessionCount(File file, File file2, int i, Comparator<File> comparator) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        File[] listFiles2 = file2.listFiles(ALL_FILES_FILTER);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        if (listFiles2 == null) {
            listFiles2 = new File[0];
        }
        arrayList.addAll(Arrays.asList(listFiles));
        arrayList.addAll(Arrays.asList(listFiles2));
        return capFileCount((List<File>) arrayList, i, comparator);
    }

    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AnonymousClass2 r1 = new Continuation<T, Void>() {
            public Void then(Task<T> task) throws Exception {
                if (task.r()) {
                    TaskCompletionSource.this.e(task.n());
                    return null;
                }
                TaskCompletionSource.this.d(task.m());
                return null;
            }
        };
        task.i(r1);
        task2.i(r1);
        return taskCompletionSource.a();
    }

    private static void recursiveDelete(File file) {
        if (file.isDirectory()) {
            for (File recursiveDelete : file.listFiles()) {
                recursiveDelete(recursiveDelete);
            }
        }
        file.delete();
    }

    static int capFileCount(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        return capFileCount((List<File>) Arrays.asList(listFiles), i, comparator);
    }

    static int capFileCount(List<File> list, int i, Comparator<File> comparator) {
        int size = list.size();
        Collections.sort(list, comparator);
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            recursiveDelete(next);
            size--;
        }
        return size;
    }
}
