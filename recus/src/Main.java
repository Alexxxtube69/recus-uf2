// # Exemple bàsic d'implementació de les classes de gestió de missatges en una aplicació de missatgeria instantània.

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Classe principal que representa un missatge
class Missatge {
    private String contingut;
    private Date dataEnviament;
    private String remitent;
    private String destinatari;


    public Missatge(String contingut, String remitent, String destinatari) {
        this.contingut = contingut;
        this.remitent = remitent;
        this.destinatari = destinatari;
        this.dataEnviament = new Date(); // Utilitza la data i hora actuals com a data d'enviament
        Scanner lector = new Scanner(System.in);

        System.out.println("Escribe un mensaje?: ");
        contingut = lector.nextLine();
        System.out.println("Dequien es el mensage?: ");
        remitent = lector.nextLine();
        System.out.println("Para quien quieres que sea el menage?: ");
        destinatari = lector.nextLine();
        System.out.println("A que hora lo estas enviando?: ");
    }

    // Obté el contingut del missatge
    public String getContingut() {
        return contingut;
    }

    // Obté la data d'enviament del missatge
    public Date getDataEnviament() {
        return dataEnviament;
    }

    // Obté el remitent del missatge
    public String getRemitent() {
        return remitent;
    }

    // Obté el destinatari del missatge
    public String getDestinatari() {
        return destinatari;
    }
}

// Classe per a gestionar una llista de missatges
class LlistaMissatges {
    private List<Missatge> missatges;

    public LlistaMissatges() {
        missatges = new ArrayList<>();
    }

    // Afegeix un missatge a la llista
    public void afegirMissatge(Missatge missatge) {

        missatges.add(missatge);
    }

    // Obté la llista completa de missatges
    public List<Missatge> getMissatges() {
        return missatges;
    }

    // Obté els missatges enviats per un determinat remitent
    public List<Missatge> getMissatgesEnviatsPerRemitent(String remitent) {
        List<Missatge> missatgesRemitent = new ArrayList<>();
        for (Missatge missatge : missatges) {
            if (missatge.getRemitent().equals(remitent)) {
                missatgesRemitent.add(missatge);
            }
        }
        return missatgesRemitent;
    }

    // Obté els missatges rebuts per un determinat destinatari
    public List<Missatge> getMissatgesRebutsPerDestinatari(String destinatari) {
        List<Missatge> missatgesDestinatari = new ArrayList<>();
        for (Missatge missatge : missatges) {
            if (missatge.getDestinatari().equals(destinatari)) {
                missatgesDestinatari.add(missatge);
            }
        }
        return missatgesDestinatari;
    }
}