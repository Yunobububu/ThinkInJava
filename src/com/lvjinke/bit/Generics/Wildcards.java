package com.lvjinke.bit.Generics;

public class Wildcards {
    static void rawArgs(Holder holder,Object arg){
        holder.set(arg);
        //T t = holder.get();
        Object obj = holder.get();
    }
    static void unboundedRawArgs(Holder<?> holder,Object arg){
        //holder.set(arg);error
        //holder.set(new Wildcards());same error
    }
    static <T> T exact(Holder<T> holder){
        T t = holder.get();
        return t;
    }
    static <T> T exact2(Holder<T> holder,T arg){
        holder.set(arg);
        T t = holder.get();
        return t;
    }
    static <T> T wildeSubType(Holder<? extends T> holder,T arg){
        //holder.set(arg);
        T t = holder.get();
        return t;
    }
    static <T> void wildeSuperType(Holder<? super T> holder,T arg){
        //holder.set(arg);
        holder.get();
        //T t = holder.get();
    }
    public static void execute(){
        Holder raw = new Holder<Long>();
        Holder<Long> qualified = new Holder<Long>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<Long>();
        Long lg = 1L;

        rawArgs(raw,lg);
        rawArgs(qualified,lg);
        rawArgs(unbounded,lg);
        rawArgs(bounded,lg);

        unboundedRawArgs(raw,lg);
        unboundedRawArgs(qualified,lg);
        unboundedRawArgs(unbounded,lg);
        unboundedRawArgs(bounded,lg);

        Object obj = exact(raw);
        Long r2 = exact(qualified);
        Object r3 = exact(unbounded);
        Long r4 = exact(bounded);

        Long r5 = exact2(raw,lg);//warning
        Long r6 = exact2(qualified,lg);
        //Long r7 = exact2(unbounded,lg);error
        //Long r8 = exact2(bounded,lg);error

        Long r9 = wildeSubType(raw,lg);
        Long r10 = wildeSubType(qualified,lg);
        Object r11 = wildeSubType(unbounded,lg);//return Object
        Long r12 = wildeSubType(bounded,lg);


        wildeSuperType(raw,lg);
        wildeSuperType(qualified,lg);
        //Long r15 = wildeSuprType(unbounded,lg);error
        //Long r16 = wildeSuperType(bounded,lg);error








    }


}
