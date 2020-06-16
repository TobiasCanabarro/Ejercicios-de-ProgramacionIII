package com.company.entity.grON3;

import com.company.entity.grON3.exception.DiviceException;

import java.util.ArrayList;
import java.util.List;

public class FlyingGr0n3 {

    private static final String NOT_FOUND_DEVICE = "ERR_NOT_FOUND_DEVICE";
    private static List<GrOn3Object> objectAnalyzed;

    public FlyingGr0n3 (int id){
        setObjectAnalyzed(new ArrayList<>());
        recognizedObjectData(id);
    }

    public static List<GrOn3Object> getObjectAnalyzed() {
        return objectAnalyzed;
    }

    public void setObjectAnalyzed(List<GrOn3Object> objectAnalyzed) {
        this.objectAnalyzed = objectAnalyzed;
    }

    public void add(GrOn3Object grOn3Object){
        if(objectAnalyzed == null){
            objectAnalyzed = new ArrayList<>();
        }
        objectAnalyzed.add(grOn3Object);
    }

    private void analyzeObject (String size, String type, String kind){
        add(new GrOn3Object(size, type,  kind));
    }

    private void recognizedObjectData (int id){
        if(id % 2 == 0){
            analyzeObject("big", "Human", "is Human");
        }
        else {
            analyzeObject("Small", "animal", "Dog");
        }
    }

    public static List<GrOn3Object> getData (int id) throws DiviceException {
        if(id >= 1 && id <= 10){
            return getObjectAnalyzed();
        }
        else {
            throw new DiviceException(NOT_FOUND_DEVICE);
        }
    }
}
