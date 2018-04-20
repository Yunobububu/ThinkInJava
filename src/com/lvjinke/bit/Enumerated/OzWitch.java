package com.lvjinke.bit.Enumerated;

public enum OzWitch {
    WEST("Misaa Gulck,ack"),EAST("Glina barekasmna"),NORTH("holes meidna,oka"),SOUTH("sakura.,fsmuda");
    private String description;
    private OzWitch(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public static void main(String[] args){
        for(OzWitch ozWitch:OzWitch.values()){
            System.out.println(ozWitch + ":" + ozWitch.getDescription());
        }
    }

}
