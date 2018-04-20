package com.lvjinke.bit.Enumerated;

public enum SecurityCategory {
    STOCK(Security.Bond.class), BOND(Security.Stock.class);
    Security[] values;

    SecurityCategory(Class<? extends Security> kind) {
        values = kind.getEnumConstants();
    }

    interface Security {
        enum Stock implements Security {SHORT, LONG, MARGIN}

        enum Bond implements Security {MUNICIPL, JUNK}
    }

    public Security randomSelection() {
        return EnumRandomSelect.random(values);
    }
    public static void execute(){
        for(int i = 0;i < 10;i++){
            SecurityCategory securityCategory = EnumRandomSelect.random(SecurityCategory.class);
            System.out.println(securityCategory + ":" + securityCategory.randomSelection());
        }
    }
}
