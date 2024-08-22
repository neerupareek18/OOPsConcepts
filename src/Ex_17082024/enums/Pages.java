package Ex_17082024.enums;

public enum Pages {
    LOGIN("https://login"),
    DASHBOARD("https://dashboard"),
    CHATBOT("https://chatbot");

    private final String name;
    Pages(String name){
        this.name = name;
    }

    String getLink(){
        return this.name;
    }
}
