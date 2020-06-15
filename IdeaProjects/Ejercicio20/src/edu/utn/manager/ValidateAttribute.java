package edu.utn.manager;

import edu.utn.entity.Article;

public class ValidateAttribute extends Article{

    private static final int LONG_MAX_OBSERVATION = 30;
    private static final int LONG_MAX_NAME = 15;

    private ERROR_IN validateName  (Article article){
        if(article.getName() == null  || article.getName().length() > LONG_MAX_NAME || article.getName().equals("")){
            return ERROR_IN.NAME;
        }
        else{
            return ERROR_IN.OK;
        }
    }

    private ERROR_IN validateProductionCost (Article article){
        if(article.getProductionCost() < 0){
            return ERROR_IN.PRODUCTION_COST;
        }
        else {
            return ERROR_IN.OK;
        }
    }

    private ERROR_IN validateObservation (Article article){
        if(article.getObservation().length() > LONG_MAX_OBSERVATION){
            return ERROR_IN.OBSERVATION;
        }
        else {
            return ERROR_IN.OK;
        }
    }

    public String validateAttributes (Article article){

        if(validateName(article).equals(ERROR_IN.NAME)){
            return "ERROR EN EL ATRIBUTO NAME";
        }
        if(validateProductionCost(article).equals(ERROR_IN.PRODUCTION_COST)){
            return "ERROR EN EL ATRIBUTO PRODUCTION COST";
        }
        if(validateObservation(article).equals(ERROR_IN.OBSERVATION)){
            return "ERROR EN EL ATRIBUTO OBSERVATION";
        }
        return "OK";
    }

}
