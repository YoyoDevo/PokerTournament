package sample;

import java.util.ArrayList;

public class Table {

    private int tableSize;
    private int playerCount;
    private ArrayList<Player> table;

    public Table() {
        //table = new Player[tableSize];
        table = new ArrayList<Player>();
        playerCount = 0;
    }

    public Table(int tableSize) {
        table = new ArrayList<Player>(this.tableSize);
        playerCount = 0;
    }

    public ArrayList<Player> getTable() {
        return table;
    }

    public void setTable(ArrayList<Player> table) {
        this.table = table;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public int getTableSize() {
        return tableSize;
    }

    public void setTableSize(int tableSize) {
        this.tableSize = tableSize;
    }

    public void addToTable(Player player) {
        table.add(player);
        playerCount++;
    }

    public void removeFromTable(Player player) {
        table.remove(player);
        playerCount--;

    }
}
