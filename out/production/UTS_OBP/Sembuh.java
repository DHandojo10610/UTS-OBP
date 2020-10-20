public class Sembuh

{

    private int sem1;
    private int sem2;
    private int sem3;
    private int sem4;
    private int sem5;
    private int sem6;
    private int sem7;

    public Sembuh(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7)

    {

        this.sem1 = sem1;
        this.sem2 = sem2;
        this.sem3 = sem3;
        this.sem4 = sem4;
        this.sem5 = sem5;
        this.sem6 = sem6;
        this.sem7 = sem7;

    }

    public float jumlahSembuh()
    {
        return sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7;
    }

    public float rata2Sembuh()
    {
        return (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7) / 7;
    }

}