package com.lvjinke.bit.innerclasses;


    interface Service{
        void method1();
        void method2();
    }
    interface ServiceFactory {
        Service getService();
    }
        class Implentation1 implements Service{
            @Override
            public void method1() {
                System.out.println("Implentation1 method1");
            }

            @Override
            public void method2() {
                System.out.println("Implentation1 method2");

            }
            public  static ServiceFactory factory = new ServiceFactory() {
                @Override
                public Service getService() {
                    return new Implentation1();
                }
            };
        }
        class Implentation2 implements Service{
            private Implentation2(){}
            @Override
            public void method1() {
                System.out.println("Implentation2 method1");
            }

            @Override
            public void method2() {
                System.out.println("Implentation2 method2");

            }
            public  static ServiceFactory factory = new ServiceFactory() {
                @Override
                public Service getService() {
                    return new Implentation2();
                }
            };

        }

    public class Factories {
        public static void serviceConsumer(ServiceFactory serviceFactory){
            Service s = serviceFactory.getService();
            s.method1();
            s.method2();
        }
    }

