package school;

public class Teacher extends Person {
    
    private int meanness;
    
    public Teacher() {
        super();
        meanness = 0;
    }
    public Teacher(String _name,Gender _gender,int _weight,int _meanness) {
        super(_name, _gender, _weight);
        meanness = _meanness;
    }
    
    public int getMeanness() {
        return meanness;
    }
    
    public void setMeanness(int _meanness) {
        meanness = _meanness;
    }
    
}
