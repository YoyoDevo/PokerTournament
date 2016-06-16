package sample;

public class Player {

    private String name;
    private int seat;
    private int tableNum;

    public Player() {
        name = "";
        seat = 0;
        tableNum = 0;
    }

    public Player(String name, int seat, int tableNum) {
        this.name = name;
        this.seat = seat;
        this.tableNum = tableNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }
}
