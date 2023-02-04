package DependencyInjectionBySetterMethod;

public class BookWormOracle implements Oracle {
    private Encyclopedia encyclopedia;

    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste of money - " + " go see the world instead";
    }

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

}
