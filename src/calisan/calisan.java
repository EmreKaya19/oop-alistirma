package calisan;

public class calisan {
public int no;
public String isim;
public String soyisim;
public int tecrube;
public double maas;

public  calisan(){

}



    public calisan(int no, String isim, String soyisim, int tecrube, double maas) {
        this.no = no;
        this.isim = isim;
        this.soyisim = soyisim;
        this.tecrube = tecrube;
        this.maas = maas;
    }

    public void calisanBilgileriGoster(){
System.out.println("calisan bilgileri");
System.out.println("no "+no);
        System.out.println("isim: "+isim);
        System.out.println("soyisim: "+soyisim);
        System.out.println("tecrube: "+tecrube);
        System.out.println("maas: "+maas);
}

public void zamyap(int zamDegeri){
    System.out.println("zamsız hali :"+maas);
    System.out.println("zamlı hali :"+(maas+zamDegeri));
    maas=maas+zamDegeri;

}

public void formatlama(String isletimsistemi ,  String kimAtiyor){
    System.out.println(kimAtiyor + " kişisi "+isletimsistemi+ " isletim sistemine format atiyor ");
}

}
