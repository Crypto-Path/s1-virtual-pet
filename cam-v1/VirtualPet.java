/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    public VirtualPetFace face;
    private int hunger = 10;   // how hungry the pet is.
    private int energy = 10;
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        hunger += 2;
        if (hunger > 10) {
            hunger = 10;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
        updateBars();
        setStatus();
    }
    
    public void exercise() {
        hunger -= 3;
        energy -= 2;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
        updateBars();
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void updateBars() {
        face.updateHungerBar(this.hunger);
        face.updateEnergyBar(this.energy);
    }

    public void setStatus() {
        if (energy > 4) {
            face.setMessage("That was great.");
            face.setImage("ecstatic");
        }
        if (hunger < 2) {
            face.setMessage("That was great.");
            face.setImage("starving");
        }
    }

} // end Virtual Pet
