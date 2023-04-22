package fr.fanto.monsterindustries.gameclass;

public enum TeamName {

    MAGMA_CORP("Magma Corp","Magma"),
    SLIME_INDUSTRIES("Slime Industries","Slime"),
    ENDERMAN_ENTERPRISE("Enderman Enterprise","Enderman"),
    CREEPER_CORPORATION("Creeper Corporation","Creeper");
    
    private final String name;
    private final String shortName;
    
    TeamName(String name, String shortName) {
        this.name = name;
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }
}

