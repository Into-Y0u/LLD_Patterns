package src;

import java.util.UUID;

import src.EnumClass.FeatureType;
import src.EnumClass.LiveStatus;

public class SubFeature extends FeatureInit {
    public static String id;

    SubFeature(FeatureType featureType, LiveStatus liveStatus) {
        super(featureType, liveStatus);
        id = UUID.randomUUID().toString();
    }

}
