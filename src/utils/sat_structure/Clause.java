package utils.sat_structure;

import java.util.ArrayList;

public class Clause {
    private final ArrayList<Integer> literals;
    private final int numClause;

    public Clause(int numClause ,String clauseString) {
        this.numClause = numClause;
        this.literals = new ArrayList<>();
        String[] parts = clauseString.split(" ");
        for (String part:parts){
            if (!part.equals("0") && !part.trim().isEmpty()){
                literals.add(Integer.parseInt(part));
            }
        }
    }

    public boolean contains(int x){
        return literals.contains(x);
    }

    @Override
    public String toString() {
        return "C" + numClause;
    }

    public int getNumClause() {
        return numClause;
    }

    public ArrayList<Integer> getLiterals() {
        return literals;
    }
}
