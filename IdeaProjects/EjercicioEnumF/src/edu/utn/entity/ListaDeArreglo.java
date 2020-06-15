package edu.utn.entity;

public class ListaDeArreglo {

    private static final int INIT_SIZE = 4;
    private static final int MULTIPLIER = 2;

    private Object objects[];
    private int availablePosition;

    public ListaDeArreglo(){
        objects = new Object[INIT_SIZE];
        this.availablePosition = 0;
    }

    public void add (Object object){
        Object aux[] =  null;

        if(objects.length == availablePosition){
              aux = new Object[objects.length * MULTIPLIER];

              for (int i = 0; i < objects.length; i++){
                  aux[i] = objects[i];
              }
              objects = aux;
        }

        objects[availablePosition] = object;
        availablePosition++;
    }

    public Object get (int i){
        if(objects == null || i >= objects.length || i < 0){
            throw new ArrayIndexOutOfBoundsException("Oh! no!!");
        }
        return objects[i];
    }

    public void addAll (ListaDeArreglo lista){

        if(lista == this){
            throw new RuntimeException ("OH! NOOOOOOOOOOOO!!");
        }

        for(int i = 0; i < lista.size(); i++){
            add(lista.get(i));
        }
    }

    public int size (){
        return availablePosition;
    }

    public void clear (){
        objects = new Object[INIT_SIZE];
        availablePosition = 0;
    }
}
