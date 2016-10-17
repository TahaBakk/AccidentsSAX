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
    //Per saber quin és el carrer més conflictiu
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

    //Per saber quin el es districte amb més accidents)
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

    //Per saber quin el es dia de la setmana amb més accidents i el que menys)
    public static void calcularDiaAccident(Saxhandler sax) {

        int lunes = 0;
        int martes = 0;
        int miercoles = 0;
        int jueves = 0;
        int viernes = 0;
        int sabado = 0;
        int domingo = 0;
        int diaMesAccidents=0;




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

            //Per saber quin dia te menys accidents
            int diaMenysAccidents=lunes;

            if (diaMenysAccidents > martes) {
                diaMenysAccidents = martes;
            }
            if (diaMenysAccidents > miercoles) {
                diaMenysAccidents = miercoles;
            }
            if (diaMenysAccidents > jueves) {
                diaMenysAccidents = jueves;
            }
            if (diaMenysAccidents > viernes) {
                diaMenysAccidents = viernes;
            }
            if (diaMenysAccidents > sabado) {
                diaMenysAccidents = sabado;
            }
            if (diaMenysAccidents > domingo) {
                diaMenysAccidents = domingo;
            }

            //Mostra el resultat per pantalla si és cumpleix alguna d'aquests resultats
            //mostra el dia amb més accidents
            if (diaMesAccidents == lunes) {
                System.out.println("El dia de la setmana amb més accidents és el dilluns amb: " + diaMesAccidents + " accidents.");
            }
            if (diaMesAccidents == martes) {
                System.out.println("El dia de la setmana amb més accidents és el dimarts amb: " + diaMesAccidents + " accidents.");
            }
            if (diaMesAccidents == miercoles) {
                System.out.println("El dia de la setmana amb més accidents és el dimecres amb: " + diaMesAccidents + " accidents.");
            }
            if (diaMesAccidents == jueves) {
                System.out.println("El dia de la setmana amb més accidents és el dijous amb: " + diaMesAccidents + " accidents.");
            }
            if (diaMesAccidents == viernes) {
                System.out.println("El dia de la setmana amb més accidents és el divendres amb: " + diaMesAccidents + " accidents.");
            }
            if (diaMesAccidents == sabado) {
                System.out.println("El dia de la setmana amb més accidents és el disabte amb: " + diaMesAccidents + " accidents.");
            }
            if (diaMesAccidents == domingo) {
                System.out.println("El dia de la setmana amb més accidents és el diumenge amb: " + diaMesAccidents + " accidents.");
            }

            //mostra el dia amb menys accidents
            if (diaMenysAccidents == lunes) {
                System.out.println("El dia de la setmana amb menys accidents és el dilluns amb: " + diaMenysAccidents + " accidents.");
            }
            if (diaMenysAccidents == martes) {
                System.out.println("El dia de la setmana amb menys accidents és el dimarts amb: " + diaMenysAccidents + " accidents.");
            }
            if (diaMenysAccidents == miercoles) {
                System.out.println("El dia de la setmana amb menys accidents és el dimecres amb: " + diaMenysAccidents + " accidents.");
            }
            if (diaMenysAccidents == jueves) {
                System.out.println("El dia de la setmana amb menys accidents és el dijous amb: " + diaMenysAccidents + " accidents.");
            }
            if (diaMenysAccidents == viernes) {
                System.out.println("El dia de la setmana amb menys accidents és el divendres amb: " + diaMenysAccidents + " accidents.");
            }
            if (diaMenysAccidents == sabado) {
                System.out.println("El dia de la setmana amb menys accidents és el disabte amb: " + diaMenysAccidents + " accidents.");
            }
            if (diaMenysAccidents == domingo) {
                System.out.println("El dia de la setmana amb menys accidents és el diumenge amb: " + diaMenysAccidents + " accidents.");
            }


        }

    //Per saber quin el es Mes amb més accidents)
    public static void calcularAccidentMes(Saxhandler sax){

        int  enero=0;
        int  febrero=0;
        int  marzo=0;
        int  abril=0;
        int  mayo=0;
        int  junio=0;
        int  julio=0;
        int  agosto=0;
        int  septiembre=0;
        int  octubre=0;
        int  noviembre=0;
        int  diciembre=0;
        int  diaMesAccidents=0;

        //Per saber cuants accidents han agut en cada districte
        for (Accidents acc : sax.accList) {
            switch (acc.getNommes()) {
                case "Gener":
                    enero++;
                    break;
                case "Febrer":
                    febrero++;
                    break;
                case "Març":
                    marzo++;
                    break;
                case "Abril":
                    abril++;
                    break;
                case "Maig":
                    mayo++;
                    break;
                case "Juny":
                    junio++;
                    break;
                case "Juliol":
                    julio++;
                    break;
                case "Agost":
                    agosto++;
                    break;
                case "Setembre":
                    septiembre++;
                case "Nou Barris":
                    octubre++;
                    break;
                case "Novembre":
                    noviembre++;
                    break;
                case "Desembre":
                    diciembre++;
                    break;
            }

        }

        //Per saber quin dia te més accidents
        if (diaMesAccidents < enero) {diaMesAccidents = enero;}
        if (diaMesAccidents < febrero) {diaMesAccidents = febrero;}
        if (diaMesAccidents < marzo) {diaMesAccidents = marzo;}
        if (diaMesAccidents < abril) {diaMesAccidents = abril;}
        if (diaMesAccidents < mayo) {diaMesAccidents = mayo;}
        if (diaMesAccidents < junio) {diaMesAccidents = junio;}
        if (diaMesAccidents < julio) {diaMesAccidents = julio;}
        if (diaMesAccidents < septiembre) {diaMesAccidents = septiembre;}
        if (diaMesAccidents < octubre) {diaMesAccidents = octubre;}
        if (diaMesAccidents < noviembre) {diaMesAccidents = noviembre;}
        if (diaMesAccidents < diciembre) {diaMesAccidents = diciembre;}

        //Per saber quin dia te menys accidents
        int diaMenysAccidents=enero;

        if (diaMenysAccidents > febrero) {diaMenysAccidents = febrero;}
        if (diaMenysAccidents > marzo) {diaMenysAccidents = marzo;}
        if (diaMenysAccidents > abril) {diaMenysAccidents = abril;}
        if (diaMenysAccidents > mayo) {diaMenysAccidents = mayo;}
        if (diaMenysAccidents > junio) {diaMenysAccidents = junio;}
        if (diaMenysAccidents > julio) {diaMenysAccidents = julio;}
        if (diaMenysAccidents > agosto) {diaMenysAccidents = agosto;}
        if (diaMenysAccidents > septiembre) {diaMenysAccidents = septiembre;}
        if (diaMenysAccidents > octubre) {diaMenysAccidents = octubre;}
        if (diaMenysAccidents > noviembre) {diaMenysAccidents = noviembre;}
        if (diaMenysAccidents > diciembre) {diaMenysAccidents = diciembre;}

        //Mostra el resultat per pantalla si és cumpleix alguna d'aquests resultats
        //mostra el dia amb més accidents
        if (diaMesAccidents == enero) {System.out.println("El dia del mes amb més accidents és el gener amb: " + diaMesAccidents + " accidents.");}
        if (diaMesAccidents == febrero) {System.out.println("El dia del mes amb més accidents és el febrer amb: " + diaMesAccidents + " accidents.");}
        if (diaMesAccidents == marzo) {System.out.println("El dia del mes amb més accidents és el març amb: " + diaMesAccidents + " accidents.");}
        if (diaMesAccidents == abril) {System.out.println("El dia del mes amb més accidents és el abril amb: " + diaMesAccidents + " accidents.");}
        if (diaMesAccidents == mayo) {System.out.println("El dia del mes amb més accidents és el maig amb: " + diaMesAccidents + " accidents.");}
        if (diaMesAccidents == junio) {System.out.println("El dia del mes amb més accidents és el juny amb: " + diaMesAccidents + " accidents.");}
        if (diaMesAccidents == julio) {System.out.println("El dia del mes amb més accidents és el juliol amb: " + diaMesAccidents + " accidents.");}
        if (diaMesAccidents == agosto) {System.out.println("El dia del mes amb més accidents és el agost amb: " + diaMesAccidents + " accidents.");}
        if (diaMesAccidents == septiembre) {System.out.println("El dia del mes amb més accidents és el septembre amb: " + diaMesAccidents + " accidents.");}
        if (diaMesAccidents == octubre) {System.out.println("El dia del mes amb més accidents és el octubre amb: " + diaMesAccidents + " accidents.");}
        if (diaMesAccidents == noviembre) {System.out.println("El dia del mes amb més accidents és el novembre amb: " + diaMesAccidents + " accidents.");}
        if (diaMesAccidents == diciembre) {System.out.println("El dia del mes amb més accidents és el desembre amb: " + diaMesAccidents + " accidents.");}

        //mostra el dia amb menys accidents
        if (diaMenysAccidents == enero) {System.out.println("El dia del mes amb més accidents és el gener amb: " + diaMenysAccidents + " accidents.");}
        if (diaMenysAccidents == febrero) {System.out.println("El dia del mes amb més accidents és el febrer amb: " + diaMenysAccidents + " accidents.");}
        if (diaMenysAccidents == marzo) {System.out.println("El dia del mes amb més accidents és el març amb: " + diaMenysAccidents + " accidents.");}
        if (diaMenysAccidents == abril) {System.out.println("El dia del mes amb més accidents és el abril amb: " + diaMenysAccidents + " accidents.");}
        if (diaMenysAccidents == mayo) {System.out.println("El dia del mes amb més accidents és el maig amb: " + diaMenysAccidents + " accidents.");}
        if (diaMenysAccidents == junio) {System.out.println("El dia del mes amb més accidents és el juny amb: " + diaMenysAccidents + " accidents.");}
        if (diaMenysAccidents == julio) {System.out.println("El dia del mes amb més accidents és el juliol amb: " + diaMenysAccidents + " accidents.");}
        if (diaMenysAccidents == agosto) {System.out.println("El dia del mes amb més accidents és el agost amb: " + diaMenysAccidents + " accidents.");}
        if (diaMenysAccidents == septiembre) {System.out.println("El dia del mes amb més accidents és el septembre amb: " + diaMenysAccidents + " accidents.");}
        if (diaMenysAccidents == octubre) {System.out.println("El dia del mes amb més accidents és el octubre amb: " + diaMenysAccidents + " accidents.");}
        if (diaMenysAccidents == noviembre) {System.out.println("El dia del mes amb més accidents és el novembre amb: " + diaMenysAccidents + " accidents.");}
        if (diaMenysAccidents == diciembre) {System.out.println("El dia del mes amb més accidents és el desembre amb: " + diaMenysAccidents + " accidents.");}
    }

    public static void accidentsTotals(Saxhandler sax) {

        int contador = 0;
        for (Accidents acc: sax.accList){
            contador++;
        }
        System.out.println("En l'any 2015 hi ha agut: "+contador+" accidents");

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