public class CBeamRound extends CBeam{
    protected double R;

    public CBeamRound(double L, double X, double P, double R) {
        this.L = L;
        this.X = X;
        this.P = P;
        this.R = R;
    }
    public CBeamRound()
    {
        this.L = 2000;
        this.X = 1000;
        this.P = 500;
        this.R = 50;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        try
        {
            if(r<0)
            {
                throw new IllegalArgumentException();
            }
            R = r;
        }catch (Exception e)
        {
            System.out.println("Podano niepoprawną wartość parametru R");
        }
    }

    @Override
    protected double moment() {
        double moment = (3.14*Math.pow(R,4))/4;
        return moment;
    }

    @Override
    public String toString() {
        return("Belka Okrągła o parametrach: Długości = "+L+"\nOdległości przyłożenia siły = "+X+"\nWartości siły = "+P+"\nPromieniu = "+R+
                "\nPosiada moment = "+moment()+", Naprężenie = "+getStress(L,X,P,R)+", Ugięcie = "+getDeflection(L,X,P)+"\n\n");
    }
}
