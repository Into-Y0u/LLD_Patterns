package src;

import java.util.ArrayList;
import java.util.UUID;

import src.EnumClass.FeatureType;
import src.EnumClass.LiveStatus;

public class Feature extends FeatureInit {
    public static String id;
    private ArrayList<SubFeature> subFeatureList;

    Feature(FeatureType featureType, LiveStatus liveStatus) {
        super(featureType, liveStatus);
        id = UUID.randomUUID().toString();
    }

}
