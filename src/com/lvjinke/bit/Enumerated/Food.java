package com.lvjinke.bit.Enumerated;

public interface Food {
    enum Appletizer implements Food{SALAD,SOUP,SPRING_ROOLS}
    enum MainCourse implements Food{LANGD,HUMMOUS,PAD_THAI,NOODLE,FISH}
    enum Dessert implements Food{GELATO,FRUIT,TIRAMISU}
    enum Coffee implements Food{SEPERSSO,MOCA,TEA,GREEN_TEA,BLACK_COFFEE}
}
