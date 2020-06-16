package com.company.entity.falderPerr177;

import com.company.enums.FPGender;
import com.company.enums.FPType;
import com.company.enums.Size;

import java.util.ArrayList;
import java.util.List;

public class Perr177 {

    private int id;
    private List<Perr177Data> objectAnalyzed;

    public Perr177 (int id){
        setId(id);
        setObjectAnalyzed(new ArrayList<>());
        recognizedObjectData(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Perr177Data> getObjectAnalyzed() {
        return objectAnalyzed;
    }

    public void setObjectAnalyzed(List<Perr177Data> objectAnalyzed) {
        this.objectAnalyzed = objectAnalyzed;
    }

    private void add(Perr177Data perr177Data) {
        if(objectAnalyzed == null){
            objectAnalyzed = new ArrayList<>();
        }
        objectAnalyzed.add(perr177Data);
    }

    private void analyzedObject (FPType type, Size size, FPGender gender){
        add(new Perr177Data(type, size, gender));
    }

    private void recognizedObjectData(int id){
        if(id % 2 == 0){
            analyzedObject(FPType.HUMAN, Size.RANDE, FPGender.MALE);
        }
        else {
            analyzedObject(FPType.NO_HUMAN, Size.PICHITITO, FPGender.FEMALE);
        }
    }


}
