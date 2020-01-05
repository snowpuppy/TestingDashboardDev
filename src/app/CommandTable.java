package app;

import java.util.Hashtable;
import java.util.ArrayList;

public class CommandTable {
    Hashtable<String, ArrayList<Command>> table;
    public CommandTable() {
        table = new Hashtable<String, ArrayList<Command>>();
    }
    public void add(String str, Command cmd) {
        if (table.containsKey(str)) {
            ArrayList<Command> l = table.get(str);
            l.add(cmd);
        } else {
            ArrayList<Command> l = new ArrayList<Command>();
            l.add(cmd);
            table.put(str, l);
        }
    }
}