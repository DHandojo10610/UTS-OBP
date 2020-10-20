public class Meninggal

{

    private int men1;
    private int men2;
    private int men3;
    private int men4;
    private int men5;
    private int men6;
    private int men7;

    public Meninggal(int men1, int men2, int men3, int men4, int men5, int men6, int men7)

    {

        this.men1 = men1;
        this.men2 = men2;
        this.men3 = men3;
        this.men4 = men4;
        this.men5 = men5;
        this.men6 = men6;
        this.men7 = men7;

    }

    public float jumlahMeninggal()
    {
        return men1 + men2 + men3 + men4 + men5 + men6 + men7;
    }

    public float rata2Meninggal()
    {
        return (men1 + men2 + men3 + men4 + men5 + men6 + men7) / 7;
    }

}