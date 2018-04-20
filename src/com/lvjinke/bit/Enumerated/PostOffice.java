package com.lvjinke.bit.Enumerated;

import java.util.Iterator;

class Mail {
    enum GeneralDelivery {YES, NO1, NO2, NO3, NO4, NO5}

    enum Scannability {UNSCANABLE, YES1, YES2, YES3, YES4, YES5}

    enum Address {INCORRECT, OK1, OK2, OK3, OK4}
    enum Readability{INLLEGAL,OK1,OK2,OK3,OK4}

    enum ReturnAddress {MISSING, OK1, OK2, OK3, OK4}

    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readability readability;
    Address address;
    ReturnAddress returnAdress;

    static long counter = 0;
    long id = counter++;

    public String toString() {
        return "Mail " + id;
    }

    public String details() {
        return toString() +
                ",GeneralDelivery: " + generalDelivery +
                ",Scannablility: " + scannability +
                ",Address: " + address +
                ",ReturnAddress: " + returnAdress +
                ",Readability:" + readability;
    }

    public static Mail randomMail() {
        Mail m = new Mail();
        m.generalDelivery = EnumRandomSelect.random(GeneralDelivery.class);
        m.scannability = EnumRandomSelect.random(Scannability.class);
        m.returnAdress = EnumRandomSelect.random(ReturnAddress.class);
        m.address = EnumRandomSelect.random(Address.class);
        m.readability =EnumRandomSelect.random(Readability.class);
        return m;
    }

    public static Iterable<Mail> generator(final int count) {
        return new Iterable<Mail>() {
            int n = count;
            @Override
            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }

                    @Override
                    public Mail next() {
                        return randomMail();
                    }
                };
            }
        };

    }
}
public class PostOffice {
    enum MailHandler{
        GENERAL_DELIERY{
            boolean handle(Mail m){
                switch (m.generalDelivery){
                    case YES:
                        System.out.println("Using gengral deliery for " + m);
                        return true;
                    default:return false;
                }
            }
        },
        VISUAL_INSPECTION{
            boolean handle(Mail m){
                switch (m.readability){
                    case INLLEGAL:return false;
                    default:
                        System.out.println("Delivering " + m +" automatically");
                        return true;
                }
            }
        },
        MACHINE_SCAN{
            boolean handle(Mail m){
                switch (m.scannability){
                    case UNSCANABLE:return false;
                    default:
                        switch (m.address){
                            case INCORRECT:return false;
                            default:
                                System.out.println("Deliverign " + m + " automatically");
                                return true;
                        }
                }
            }
        },
        RETURN_TOSENDER{
            boolean handle(Mail m){
                switch (m.returnAdress){
                    case MISSING:return false;
                    default:
                        System.out.println("Returning " + m + " to sender");
                        return true;
                }
            }
        };
        abstract boolean handle(Mail m);
    }
    static void hanle(Mail m){
        for(MailHandler mailHandler: MailHandler.values()){
            if(mailHandler.handle(m)){
                return;
            }
            System.out.println(m + " is dead letter");
        }
    }
    public static void execute(){
        for(Mail mail:Mail.generator(10)){
            System.out.println(mail.details());
            hanle(mail);
            System.out.println("**************");
        }
    }
}