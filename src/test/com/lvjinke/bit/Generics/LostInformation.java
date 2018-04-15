package test.com.lvjinke.bit.Generics;

import java.util.*;

class Frob{}
class Fnokle{}
class Brok<Q>{}
class Particle<POSITON,MOMENT>{}
public class LostInformation {
    public static void execute(){
        List<Frob> list = new ArrayList<>();
        Map<Frob,Fnokle> map = new HashMap<>();
        Brok<Frob> brok = new Brok<>();
        Particle<Long,Double> particle = new Particle<>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(brok.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(particle.getClass().getTypeParameters()));
    }
}
