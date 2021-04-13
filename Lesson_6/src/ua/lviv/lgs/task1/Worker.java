package ua.lviv.lgs.task1;

public abstract class Worker {
    private String name;

    public Worker(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
