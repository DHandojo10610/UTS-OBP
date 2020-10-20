public class Positif

{

    private int pos1;
    private int pos2;
    private int pos3;
    private int pos4;
    private int pos5;
    private int pos6;
    private int pos7;

    public Positif(int pos1, int pos2, int pos3, int pos4, int pos5, int pos6, int pos7)

    {

        this.pos1 = pos1;
        this.pos2 = pos2;
        this.pos3 = pos3;
        this.pos4 = pos4;
        this.pos5 = pos5;
        this.pos6 = pos6;
        this.pos7 = pos7;

    }

    public float jumlahPositif()
    {
        return pos1 + pos2 + pos3 + pos4 + pos5 + pos6 + pos7;
    }

    public float rata2Positif()
    {
        return (pos1 + pos2 + pos3 + pos4 + pos5 + pos6 + pos7) / 7;
    }

}