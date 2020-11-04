package com.airbnb.lottie;

import a.e.b;
import a.h.j.d;
import android.util.Log;
import com.airbnb.lottie.utils.MeanCalculator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PerformanceTracker {
    private boolean enabled = false;
    private final Comparator<d<String, Float>> floatComparator = new Comparator<d<String, Float>>() {
        public int compare(d<String, Float> dVar, d<String, Float> dVar2) {
            float floatValue = ((Float) dVar.f353b).floatValue();
            float floatValue2 = ((Float) dVar2.f353b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };
    private final Set<FrameListener> frameListeners = new b();
    private final Map<String, MeanCalculator> layerRenderTimes = new HashMap();

    public interface FrameListener {
        void onFrameRendered(float f2);
    }

    public void addFrameListener(FrameListener frameListener) {
        this.frameListeners.add(frameListener);
    }

    public void clearRenderTimes() {
        this.layerRenderTimes.clear();
    }

    public List<d<String, Float>> getSortedRenderTimes() {
        if (!this.enabled) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.layerRenderTimes.size());
        for (Map.Entry next : this.layerRenderTimes.entrySet()) {
            arrayList.add(new d(next.getKey(), Float.valueOf(((MeanCalculator) next.getValue()).getMean())));
        }
        Collections.sort(arrayList, this.floatComparator);
        return arrayList;
    }

    public void logRenderTimes() {
        if (this.enabled) {
            List<d<String, Float>> sortedRenderTimes = getSortedRenderTimes();
            Log.d(L.TAG, "Render times:");
            for (int i = 0; i < sortedRenderTimes.size(); i++) {
                d dVar = sortedRenderTimes.get(i);
                Log.d(L.TAG, String.format("\t\t%30s:%.2f", new Object[]{dVar.f352a, dVar.f353b}));
            }
        }
    }

    public void recordRenderTime(String str, float f2) {
        if (this.enabled) {
            MeanCalculator meanCalculator = this.layerRenderTimes.get(str);
            if (meanCalculator == null) {
                meanCalculator = new MeanCalculator();
                this.layerRenderTimes.put(str, meanCalculator);
            }
            meanCalculator.add(f2);
            if (str.equals("__container")) {
                for (FrameListener onFrameRendered : this.frameListeners) {
                    onFrameRendered.onFrameRendered(f2);
                }
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        this.frameListeners.remove(frameListener);
    }

    /* access modifiers changed from: package-private */
    public void setEnabled(boolean z) {
        this.enabled = z;
    }
}
