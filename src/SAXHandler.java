import jdk.internal.org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by x3727349s on 03/10/16.
 */
public class SAXHandler extends DefaultHandler {

    int contador_Accidents = 0;
    Accidents Acc = new Accidents();
    public List<Accidents> accList = new ArrayList<Accidents>();

    boolean is_nomBarri =false;
    boolean is_nomCarrer =false;
    boolean is_diaDeSetmana =false;
    boolean is_diaDeMes =false;
    boolean is_nomMes =false;
    boolean is_horaDedia =false;
    boolean is_codiDistricte =false;

    String nomBarri ="";
    String nomCarrer ="";
    String diaDeSetmana ="";
    String diaDeMes ="";
    String nomMes ="";
    String horaDedia ="";
    String codiDistricte="";


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equalsIgnoreCase("Registre"))
            contador_Accidents++;
        if (qName.equalsIgnoreCase("nomBarri"))
            is_nomBarri=true;
        if (qName.equalsIgnoreCase("nomCarrer"))
            is_nomCarrer=true;
        if (qName.equalsIgnoreCase("diaDeSetmana"))
            is_diaDeSetmana=true;
        if (qName.equalsIgnoreCase("diaDeMes"))
            is_diaDeMes=true;
        if (qName.equalsIgnoreCase("nomMes"))
            is_nomMes=true;
        if (qName.equalsIgnoreCase("horaDedia"))
            is_horaDedia=true;
        if (qName.equalsIgnoreCase("codiDistricte"))
            is_codiDistricte=true;
    }

    @Override
    public void endElement(String uri, String localName, String qName){

        if (qName.equalsIgnoreCase("Registre")){
            Accidents acc = new Accidents();
            acc.setNomBarri(nomBarri);
            acc.setNomCarrer(nomCarrer);
            acc.setDiadesetmana(diaDeSetmana);
            acc.setDiademes(diaDeMes);
            acc.setNommes(nomMes);
            acc.setHoradedia(codiDistricte);

            accList.add(acc); }

    }

    @Override
    public void characters(char[] ch, int start, int length){
        String value = new String(ch, start, length).trim();


        if(value.length()==0)return;
        if (is_nomBarri){
            nomBarri = value;
            is_nomBarri = false;
        }else if(is_nomCarrer){
            nomCarrer = value;
            is_nomCarrer= false;
        }else if(is_diaDeSetmana){
            diaDeSetmana = value;
            is_diaDeSetmana= false;
        } else if(is_diaDeMes){
            diaDeMes = value;
            is_diaDeMes= false;
        }else if(is_nomMes){
            nomMes = value;
            is_nomMes= false;
        }else if(is_horaDedia){
            horaDedia = value;
            is_horaDedia= false;
        }else if(is_codiDistricte){
            codiDistricte = value;
            is_codiDistricte= false;
        }



    }

    @Override
    public void startDocument(){System.out.println("Comença a llegir");}

    @Override
    public void endDocument(){System.out.println("Acaba de llegir");}
}




