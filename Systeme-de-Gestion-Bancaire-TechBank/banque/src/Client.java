import java.util.Date;

public class Client {
    private int id ;
    private String nom;
    private String adresse ;
    public String getDetails() {
        return nom + " " + adresse;
    }
}

class CompteBancaire {
    private String nomCompte ;
    private int solde ;
    private int idCard;
    public boolean  crediter(int value){
        if(value > 0){
            solde += value;
            return true;
        }
        return false;
    }
    public boolean debiter(int value){
        if (solde < value && value > 0){
            solde -= value;
            return true;
        }
        else {
            return false;
        }
    }
    public String getSolde() {
        return Integer.toString(solde);
    }
}

enum Transaction_Types {
    crediter,
    debiter,
    virment,
    transfer, //TODO: from a comtpe to a compte
}

class Transaction {
    private int id ;
    private Transaction_Types type;
    private float montant;
    private Date date ;
    public boolean  effectuerTransaction(){
        
        return true;
    }
}