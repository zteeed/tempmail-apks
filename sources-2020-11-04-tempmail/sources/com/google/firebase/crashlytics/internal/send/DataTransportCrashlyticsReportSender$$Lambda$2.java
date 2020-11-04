package com.google.firebase.crashlytics.internal.send;

import b.c.a.b.e;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.nio.charset.Charset;

/* compiled from: DataTransportCrashlyticsReportSender */
final /* synthetic */ class DataTransportCrashlyticsReportSender$$Lambda$2 implements e {
    private static final DataTransportCrashlyticsReportSender$$Lambda$2 instance = new DataTransportCrashlyticsReportSender$$Lambda$2();

    private DataTransportCrashlyticsReportSender$$Lambda$2() {
    }

    public static e lambdaFactory$() {
        return instance;
    }

    public Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.TRANSFORM.reportToJson((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
    }
}
