public class Room {

    private Room north;
    private Room south;
    private Room east;
    private Room west;

    private String name;
    private String description;

    public Room (String aName,String aDescription) {
      this.name = aName;
      this.description = aDescription;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public void setDescription(String aDescription) {
        this.description = aDescription;
    }
    public void setName(String aName) {
        this.name = aName;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    public void setNorth(Room north) {
        this.north = north;
        this.north.south = (this);
    }

    public void setSouth(Room south) {
        this.south = south;
        this.south.north = (this);
    }

    public void setEast(Room east) {
        this.east = east;
        this.east.west = (this);
    }

    public void setWest(Room west) {
        this.west = west;
        this.west.east = (this);
    }
    public String toString(){
        return name + " " + description;
    }
}
