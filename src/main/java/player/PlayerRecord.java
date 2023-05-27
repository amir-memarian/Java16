package player;

public record PlayerRecord(String name, int goal) {

    public PlayerRecord{
        if(name == null){
            throw new PlayerShouldHaveNameException();
        }
    }

    // Behaviour
    public PlayerRecord changeName(String newName) {
        return new PlayerRecord(newName, this.goal());
    }
}
