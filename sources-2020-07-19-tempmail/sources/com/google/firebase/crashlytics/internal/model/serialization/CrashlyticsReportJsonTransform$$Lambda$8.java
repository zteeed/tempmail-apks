package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* compiled from: CrashlyticsReportJsonTransform */
final /* synthetic */ class CrashlyticsReportJsonTransform$$Lambda$8 implements CrashlyticsReportJsonTransform.ObjectParser {
    private static final CrashlyticsReportJsonTransform$$Lambda$8 instance = new CrashlyticsReportJsonTransform$$Lambda$8();

    private CrashlyticsReportJsonTransform$$Lambda$8() {
    }

    public static CrashlyticsReportJsonTransform.ObjectParser lambdaFactory$() {
        return instance;
    }

    public Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventFrame(jsonReader);
    }
}
