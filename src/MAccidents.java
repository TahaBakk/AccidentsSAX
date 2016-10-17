import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by x3727349s on 10/10/16.
 */
public class MAccidents {

    public static void main(String[] args) {

    }

    //Aquet codi he tingut que ferlo amb haset(per tindre codis no repetits) i arraylist
    public static void carrerConflictiu(Saxhandler sax) {


        HashSet<String> hs = new HashSet<String>();
        ArrayList<Integer> listCodisCarrers = new ArrayList<Integer>();
        ArrayList<String> listaCodisnoRepetits = new ArrayList<String>();


        /*El que estic fent es pasar tot el arraylist per hashSet per a no tindre el codi del carrer repetit.(el que fa el hashset es no tindre valor repetits)*/
        for (Accidents acc: sax.accList) {
            hs.add(acc.getCodiCarrer());
        }
       /* Això es per calcular cuants accidents hi ha agut en el carrers i el enmagatzemen en un arraylist anomenat listCodisCarrers*/
        for (String lista  : hs) {
            int contadorCarrerConflictiu=0;

            for (Accidents acc  : sax.accList) {
                if(lista.equalsIgnoreCase(acc.getCodiCarrer())){
                    contadorCarrerConflictiu++;
                }
            }
            listCodisCarrers.add(contadorCarrerConflictiu);
        }
        /*per trobar la posicio que te el carrer més conflictiu*/
        int lsnumeroMayor=0, lsposicion=0;
        for (int i=1;i<listCodisCarrers.size();i++){

            if (listCodisCarrers.get(i).intValue() >lsnumeroMayor){
                lsnumeroMayor = listCodisCarrers.get(i).intValue();
                lsposicion = i;
            }
        }
        /*Paso el hashSet a un arraylist per trobar on tinc enmagatzemat el codi*/
        for (String hs1: hs){
           listaCodisnoRepetits.add(hs1);
        }

        String codiCarrerMésConflictiu = listaCodisnoRepetits.get(lsposicion).toString();
        String nombrecalle="";
        //D'aqui extreim el nom del carrer més conflictiu
        for (Accidents acc: sax.accList) {
            if(acc.getCodiCarrer().equalsIgnoreCase(codiCarrerMésConflictiu)){
                nombrecalle = acc.getNomCarrer();
            }
        }
        System.out.println("El carrer més conflictiu és: "+nombrecalle+" amb "+lsnumeroMayor);
    }

    //Utilizat el switch (la manera més fàcil)
    public static void calcularAccidentDistrictes(Saxhandler sax){

        int  santMarti=0;
        int  ciutatVella=0;
        int  Eixample=0;
        int  SantsMontjuïc=0;
        int  LesCorts=0;
        int  SarriàSantGervasi=0;
        int  Gràcia=0;
        int  HortaGuinardó=0;
        int  NouBarris=0;
        int  SantAndreu=0;
        int  Desconegut=0;
        int  districteMesAccidents=0;

        //Per saber cuants accidents han agut en cada districte
        for (Accidents acc : sax.accList) {
            switch (acc.getNomDistricte()) {
                case "Sant Martí":
                    santMarti++;
                    break;
                case "Ciutat Vella":
                    ciutatVella++;
                    break;
                case "Eixample":
                    Eixample++;
                    break;
                case "Sants-Montjuïc":
                    SantsMontjuïc++;
                    break;
                case "Les Corts":
                    LesCorts++;
                    break;
                case "Sarrià-Sant Gervasi":
                    SarriàSantGervasi++;
                    break;
                case "Gràcia":
                    Gràcia++;
                    break;
                case "Horta-Guinardó":
                    HortaGuinardó++;
                    break;
                case "Nou Barris":
                    NouBarris++;
                    break;
                case "Sant Andreu":
                    SantAndreu++;
                    break;
                case "Desconegut":
                    Desconegut++;
                    break;
            }

        }



    //Per saber quin districte te més accidents
        if (districteMesAccidents < santMarti){districteMesAccidents = santMarti;}
        if (districteMesAccidents < ciutatVella){districteMesAccidents = ciutatVella;}
        if (districteMesAccidents < Eixample){districteMesAccidents = Eixample;}
        if (districteMesAccidents < SantsMontjuïc){districteMesAccidents = SantsMontjuïc;}
        if (districteMesAccidents < LesCorts){districteMesAccidents = LesCorts;}
        if (districteMesAccidents < SantAndreu){districteMesAccidents = SantAndreu;}
        if (districteMesAccidents < SarriàSantGervasi){districteMesAccidents = SarriàSantGervasi;}
        if (districteMesAccidents < Gràcia){districteMesAccidents = Gràcia;}
        if (districteMesAccidents < HortaGuinardó){districteMesAccidents = HortaGuinardó;}
        if (districteMesAccidents < NouBarris){districteMesAccidents = NouBarris;}
        if (districteMesAccidents < Desconegut){districteMesAccidents = Desconegut;}


   //Per saber el nom del districte que a tingut més accidents

        if (districteMesAccidents == santMarti){
                System.out.println("El districte amb més accidents és Sant Martí amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == ciutatVella){
                System.out.println("El districte amb més accidents és Ciutat Vella amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == Eixample){
                System.out.println("El districte amb més accidents és Eixample amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == SantsMontjuïc){
                 System.out.println("El districte amb més accidents és Sants-Montjuïc amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == LesCorts){
                 System.out.println("El districte amb més accidents és Les Corts amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == SantAndreu){
                 System.out.println("El districte amb més accidents és Sant Andreu amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == SarriàSantGervasi){
                 System.out.println("El districte amb més accidents és Sarrià Sant Gervasi amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == Gràcia){
                 System.out.println("El districte amb més accidents és Gràcia amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == HortaGuinardó){
                 System.out.println("El districte amb més accidents és Horta Guinardó amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == NouBarris){
                 System.out.println("El districte amb més accidents és Nou Barris amb: "+districteMesAccidents+" accidents.");}
        if (districteMesAccidents == Desconegut){
                 System.out.println("El districte amb més accidents és Desconegut amb: "+districteMesAccidents+" accidents.");}



    }

    //Utilizat el switch (la manera més fàcil)
    public static void calcularDiaAccident(Saxhandler sax) {

        int lunes = 0;
        int martes = 0;
        int miercoles = 0;
        int jueves = 0;
        int viernes = 0;
        int sabado = 0;
        int domingo = 0;
        int diaMesAccidents=0;


       /* HashSet<String> hs = new HashSet<String>();
        for (Accidents acc: sax.accList) {
            hs.add(acc.getDiadesetmana());
        }

        for (String hs1: hs) {
            System.out.println(hs1);
        }*/
        //Per saber cuants accidents han agut en cada districte
        for (Accidents acc : sax.accList) {
            switch (acc.getDiadesetmana()) {
                case "Dl":
                    lunes++;
                    break;
                case "Dm":
                    martes++;
                    break;
                case "Dc":
                    miercoles++;
                    break;
                case "Dj":
                    jueves++;
                    break;
                case "Dv":
                    viernes++;
                    break;
                case "Ds":
                    sabado++;
                    break;
                case "Dg":
                    domingo++;
                    break;
            }
        }

            //Per saber quin dia te més accidents
            if (diaMesAccidents < lunes) {
                diaMesAccidents = lunes;
            }
            if (diaMesAccidents < martes) {
                diaMesAccidents = martes;
            }
            if (diaMesAccidents < miercoles) {
                diaMesAccidents = miercoles;
            }
            if (diaMesAccidents < jueves) {
                diaMesAccidents = jueves;
            }
            if (diaMesAccidents < viernes) {
                diaMesAccidents = viernes;
            }
            if (diaMesAccidents < sabado) {
                diaMesAccidents = sabado;
            }
            if (diaMesAccidents < domingo) {
                diaMesAccidents = domingo;
            }



            //Per saber el nom del dia que a tingut més accidents

            if (diaMesAccidents == lunes) {
                System.out.println("El dia del mes amb més accidents és el dilluns amb: " + diaMesAccidents + " accidents.");
            }
            if (diaMesAccidents == martes) {
                System.out.println("El dia del mes amb més accidents és el dimarts amb: " + diaMesAccidents + " accidents.");
            }
            if (diaMesAccidents == miercoles) {
                System.out.println("El dia del mes amb més accidents és el dimecres amb: " + diaMesAccidents + " accidents.");
            }
            if (diaMesAccidents == jueves) {
                System.out.println("El dia del mes amb més accidents és el dijous amb: " + diaMesAccidents + " accidents.");
            }
            if (diaMesAccidents == viernes) {
                System.out.println("El dia del mes amb més accidents és el divendres amb: " + diaMesAccidents + " accidents.");
            }
            if (diaMesAccidents == sabado) {
                System.out.println("El dia del mes amb més accidents és el disabte amb: " + diaMesAccidents + " accidents.");
            }
            if (diaMesAccidents == domingo) {
                System.out.println("El dia del mes amb més accidents és el diumenge amb: " + diaMesAccidents + " accidents.");
            }


        }
}




/*
* List list = new Arraylist(accDistricte.values());
* Collections.sort(list);
* list = list.subList(list.size()-3.list.size());
*
* for (Map.Entry<Integer.Integer> entry : accDistricte.entrySet()){
*
*   int breaky = 0;
*
*   if (entry.getValues() == list.get(0)){
*       System.out.println("El tercer districte amb més accidents és"..........)
*   }
*   if (entry.getValues() == list.get(1)){
*       System.out.println("El tercer districte amb més accidents és"..........)
*   }
*   if (entry.getValues() == list.get(2)){
*       System.out.println("El tercer districte amb més accidents és" .........)
*   }
*   if (breaky == 3){
*       break;
*   }
*
*
* }
*
*
* */