package examenvanguardia;

import Adapter.FileAdapter;
import Builder.Builder;
import Builder.Regalo;
import Builder.Seller;
import Builder.TiendaRegalos;
import Factory.CiscoDevice;
import Factory.CiscoFactory;
import Factory.CiscodeviceType;
import Observer.Cliente;
import Observer.tiendaOnline;
import Singleton.Director;
import State.Moroso;
import State.Transacciones;
import State.noMoroso;

public class ExamenVanguardia {
    public static void main(String[] args) {
        Files();
        System.out.println("");
        Estado();
        System.out.println("");
        System.out.println("Mi factory es de elementos de Cisco");
        System.out.println("");
        CiscoFactory();
        System.out.println("mi builder");
        builderRegalos();
        System.out.println("");
        System.out.println("mis observadores de tienda en linea");
        observerTiendaOnline();
        System.out.println("");
        System.out.println("mi singleton");
        singletonDirector();
    }
    public static void Files(){
       FileAdapter file = new FileAdapter();
       file.openFile("archivo.exe");
       file.closeFile();
    }
    
    public static void Estado(){
        Transacciones t = new Transacciones();
        t.setState(new noMoroso());
        t.transacciones();
        System.out.println("*********************************************");
        System.out.println("estado moroso no puede aplicar a un prestamo");
        t.setState(new Moroso());
        t.transacciones();
        
    }
    
    public static void CiscoFactory(){
        CiscoFactory factory = new CiscoFactory();
        CiscoDevice router = factory.device(CiscodeviceType.Routers);
        CiscoDevice switches = factory.device(CiscodeviceType.Switches);
        System.out.println(switches.getDevice());
        System.out.println(router.getDevice());
        
    }
    
    public static void builderRegalos(){
        Builder b = new TiendaRegalos();
        Seller vendedor = new Seller();
        vendedor.wrapGift(b);
        Regalo gift = b.getReglo();
        System.out.println(gift.toString());
    }
    
    public static void observerTiendaOnline(){
        Cliente c = new Cliente("Manuel Perdomo");
        Cliente c2 = new Cliente("Marina Exposito");
        Cliente c3 = new Cliente("Laura Lopez");
        tiendaOnline store = new tiendaOnline();
        store.registerObserver(c);
        store.registerObserver(c2);
        store.registerObserver(c3);
        store.addItem("New purse available from new collection ");
        store.addItem("new models for shoes");
    }
    public static void singletonDirector(){
        Director msMary = Director.getInstance();
        msMary.convocarAsamblea();
        msMary.detention();
        msMary.rondarPasillo();
    }
}
