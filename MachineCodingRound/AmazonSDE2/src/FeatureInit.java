package src;

import src.EnumClass.FeatureType;
import src.EnumClass.LiveStatus;

public class FeatureInit {
    private FeatureType featureType;
    private LiveStatus liveStatus;

    FeatureInit(FeatureType featureType, LiveStatus liveStatus) {
        this.featureType = featureType;
        this.liveStatus = liveStatus;
    }

    public void setFeatureType(FeatureType featureType) {
        this.featureType = featureType;
    }

    public FeatureType getFeatureType() {
        return this.featureType;
    }

    public void setLiveStatus(LiveStatus liveStatus) {
        this.liveStatus = liveStatus;
    }

    public LiveStatus getLiveStatus() {
        return this.liveStatus;
    }

}