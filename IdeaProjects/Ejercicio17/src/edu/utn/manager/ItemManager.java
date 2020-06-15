package edu.utn.manager;

import edu.utn.entity.Item;
import edu.utn.entity.Scanner;

enum TypeObj {
    SIMPLE, CONTAINER, CONTENT, SAMBUCHITO, REFUSE;
}

public class ItemManager extends Scanner {

    private static final String ERROR = "ERROR";

    private boolean itemIsContained (Item item){
        return item.isHasObj();
    }

    private TypeObj isSimple (Item item){

        if (!item.isHasContent() && !item.isHasObj()){
            return TypeObj.SIMPLE;
        }
        else {
            return TypeObj.REFUSE;
        }
    }

    private TypeObj isContainer (Item item){

        if (item.isHasObj() && !item.isHasContent()){
            return TypeObj.CONTAINER;
        }
        else {
            return TypeObj.REFUSE;
        }
    }

    private TypeObj isContent (Item item){

        if (!itemIsContained(item)){
            return TypeObj.REFUSE;
        }

        Item containerItem = item.getItemContents();

        if (!containerItem.isHasContent()){
            return TypeObj.CONTENT;
        }
        else {
            return TypeObj.REFUSE;
        }
    }

    private TypeObj isSambuchito (Item item){

        if (!itemIsContained(item)){
            return TypeObj.REFUSE;
        }

        Item containerItem = item.getItemContents();

        if (containerItem.isHasContent() && containerItem.isHasObj()){
            return TypeObj.SAMBUCHITO;
        }
        else {
            return TypeObj.REFUSE;
        }
    }

    public String analizeItem (Item item){

       if (isSimple(item) == TypeObj.SIMPLE){
           return "SIMPLE";
       }
       if (isContainer(item) == TypeObj.CONTAINER){
           return "CONTAINER";
       }
       if (isContent(item) == TypeObj.CONTENT){
           return "CONTENT";
       }
       if (isSambuchito(item) == TypeObj.SAMBUCHITO) {
           return "SAMBUCHITO";
       }
       return ERROR;
    }
}
