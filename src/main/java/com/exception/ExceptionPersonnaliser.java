/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exception;

/**
 * @author Maxime
 */
public class ExceptionPersonnaliser extends RuntimeException {

    /**
     * Ce constructeur permet de créer une exception de type RuntimeException.
     *
     * @param message de type String
     */
    public ExceptionPersonnaliser(String message) {
        super(message);
    }


    /**
     * Enumeration pour a gestion des erreur pour la classe Prospect.
     */
    public static enum ExceptionEnumProspect {

        IS_NULL_PROSPECT,
        MACTH_DATE,
        EMPTY_DATE;

        ExceptionEnumProspect() {
        }
    }

    /**
     * Enumeration pour a gestion des erreur pour la classe Client.
     */
    public enum ExceptionEnumClient {

        IS_NULL_CLIENT,
        CALCUL_RATIO_DIVISON_EMPLOYER,
        CALCUL_RATIO_DIVISON_CHIFFRE,
        CALCUL_RATIO;

        ExceptionEnumClient() {
        }

    }

    /**
     * Enumeration pour a gestion des erreur de cette classe Adresse.
     */
    public enum ExceptionEnumAdresse {

        IS_NULL_ADRESSE,
        NUMERO_RUE_INF_0,
        NUMERO_RUE_INF_BIG200,
        EMPTY_NOM_RUE,
        MATCH_NOM_RUE,
        EMPTY_CD_POSTALE,
        MACTH_CD_POSTALE,
        EMPTY_NOM_VILLE,
        MATCH_NOM_VILLE;

        ExceptionEnumAdresse() {
        }
    }

    /**
     * Enumeration pour a gestion des erreur de la classe Societe.
     */
    public enum ExceptionEnumSociete {

        IS_NULL_SOCIETE,
        EMPTY_RAISONSOCIALE,
        MATCH__RAISONSOCIALE,
        EMPTY_TELEPHONE,
        MATCH_TELEPHONE,
        EMPTY_EMAIL,
        MATCH_EMAIL;

        ExceptionEnumSociete() {
        }

    }
}
