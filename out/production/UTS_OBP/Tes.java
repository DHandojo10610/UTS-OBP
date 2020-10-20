public class Tes

{

    private int tes1;
    private int tes2;
    private int tes3;
    private int tes4;
    private int tes5;
    private int tes6;
    private int tes7;

    public Tes(int tes1, int tes2, int tes3, int tes4, int tes5, int tes6, int tes7)

    {

        this.tes1 = tes1;
        this.tes2 = tes2;
        this.tes3 = tes3;
        this.tes4 = tes4;
        this.tes5 = tes5;
        this.tes6 = tes6;
        this.tes7 = tes7;

    }

    public float jumlahTes()
    {
        return tes1 + tes2 + tes3 + tes4 + tes5 + tes6 + tes7;
    }

    public float rata2Tes()
    {
        return (tes1 + tes2 + tes3 + tes4 + tes5 + tes6 + tes7) / 7;
    }

}