package com.bean.metier;

import java.util.ArrayList;
import java.util.List;
import com.bean.exception.ExceptionPersonnaliser;
import com.bean.metier.Societe;
import java.util.Collections;

/**
 * Cette classe permet la création d'un client en phase de prospection.
 */
public class Prospect extends Societe {

    private String datePropect;
    private String interesse;

    // La liste des Prospects
    private static List<Prospect> listePropect = new ArrayList<>(50);

    /**
     * Constructeur par défaut sans paramétre.
     */
    public Prospect() {
        super();
        // ajoute un user est donne un ID
        setIdentifiant(Societe.addUser());
    }

    /**
     * Constructeur permet de créé un Prospect en phase de prospecion.
     *
     * @param raisonSt String raison sociale du prospecter.
     * @param domainSt String domain de la société du prospecter.
     * @param numeroDeRueSt int numéro de l'adresse du prospecter.
     * @param nomRueSt String nom de la rue du prospecter.
     * @param codePostSt String code postale du prospecter.
     * @param villeSt String ville du prospecter.
     * @param telephoneSt String numero de telephone du prospecter.
     * @param emailSt String adresse email du prospecter.
     * @param datePropectSt la date du prospecter.
     * @param interesseSt String intéret du prospecter.
     * @param commentaireSt String commentaire du prospect
     */
    public Prospect(String raisonSt, String domainSt,
            int numeroDeRueSt, String nomRueSt, String codePostSt,
            String villeSt, String telephoneSt, String emailSt, String datePropectSt, String interesseSt, String commentaireSt) {

        // constructeur de la classe Societe.
        super(raisonSt, domainSt, numeroDeRueSt, nomRueSt, codePostSt, villeSt, telephoneSt, emailSt, commentaireSt);

        this.setDatePropect(datePropectSt);
        this.setInteresse(interesseSt);

        // ajoute un user est donne un ID
        setIdentifiant(Societe.addUser());
    }

    /**
     * La date de prospection.
     *
     * @return String de la date de propection du client.
     */
    public String getDatePropect() {
        return datePropect;
    }

    /**
     * Ajout de la date de prospection.
     *
     * @param datePropectSt String de la date propection du client.
     * @throws ExceptionPersonnaliser si la date est vide ou si le format est
     * n'est pas respecté.
     */
    public void setDatePropect(String datePropectSt) throws ExceptionPersonnaliser {

        if (datePropectSt.isEmpty()) {
            throw new ExceptionPersonnaliser("Date de prospection : la date est vide ");
        }

        if (!(datePropectSt.matches("[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}"))) {
            throw new ExceptionPersonnaliser("Date de prospection : la date entré n'est pas comforme ");
        }

        this.datePropect = datePropectSt;
    }

    /**
     * L'interet du prospect.
     *
     * @return String l'intérêt du client propect.
     */
    public String getInteresse() {
        return interesse;
    }

    /**
     * Modication ou ajout de l'intérêt du prospect.
     *
     * @param interesse String intérêt du prospect.
     * @throws ExceptionPersonnaliser si le champs ne correspond pas à OUI ou
     * NON.
     */
    public void setInteresse(String interesse) throws ExceptionPersonnaliser {

        if (!(interesse.matches("OUI") | interesse.matches("NON"))) {
            throw new ExceptionPersonnaliser("Interet : le champs intéret n'a pas été renseigné");
        }
        this.interesse = interesse;

    }

    /**
     * Permet d'ajouter un prospect à la liste.
     *
     * @param prospect de type Prospect.
     */
    public static void addListeProspect(Prospect prospect) {
        listePropect.add(prospect);
    }

    /**
     * La liste des prospects
     *
     * @return de type List, la liste des clients prospecter.
     */
    public static List<Prospect> getListePropect() {
        return listePropect;
    }

    /**
     * Supprime un prospect de la liste des prospect
     *
     * @param prospect de type prospect.
     */
    public static void removeListeProspect(Prospect prospect) {
        listePropect.remove(prospect);
    }

    /**
     * @return int la liste des Prospect
     */
    public static int getSizeListeProspect() {
        return listePropect.size();
    }

    @Override
    public String toString() {
        return this.getRaisonSociale();
    }

    /**
     * Methode qui permet le trie du liste contenant des objets de type Société.
     *
     * @param list de type list
     */
    public static void trieProspect(List<Prospect> list) {

        Collections.sort(list, com.bean.metier.Societe.comparatorRaisonSociale);
    }

}
