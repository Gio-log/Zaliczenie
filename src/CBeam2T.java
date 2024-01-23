public class CBeam2T extends CBeam{
    protected double B;
    protected double G;
    protected double H;
    public CBeam2T(double L, double X, double P,double B, double G, double H) {
        this.L = L;
        this.X = X;
        this.P = P;
        this.B = B;
        this.G = G;
        this.H = H;
    }

    public CBeam2T() {
        this.L = 100;
        this.X = 50;
        this.P = 1000;
        this.B = 10;
        this.G = 2;
        this.H = 10;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        try
        {
            if(b<0)
            {
                throw new IllegalArgumentException();
            }
            B = b;
        }catch (Exception e)
        {
            System.out.println("Podano niepoprawną wartość parametru B");
        }
    }

    public double getG() {
        return G;
    }

    public void setG(double g) {
        try
        {
            if(g<0)
            {
                throw new IllegalArgumentException();
            }
            G = g;
        }catch (Exception e)
        {
            System.out.println("Podano niepoprawną wartość parametru G");
        }
    }

    public double getH() {
        return H;
    }

    public void setH(double h) {
        try
        {
            if(h<0)
            {
                throw new IllegalArgumentException();
            }
            H = h;
        }catch (Exception e)
        {
            System.out.println("Podano niepoprawną wartość parametru H");
        }
    }

    @Override
    protected double moment() {
        double moment = (B*Math.pow(H,3)-((B-G)*Math.pow((H-2*G),3)))/12;
        return moment;
    }
    @Override
    public String toString() {
        return("Belka Dwuetowa o parametrach: Długości = "+L+"\nOdległości przyłożenia siły = "+X+"\nWartości siły = "+P+"\nSzerokości = "+B+"\nWysokości = "+H+"\nGrubości = "+G+
                "\nPosiada moment = "+moment()+", Naprężenie = "+getStress(L,X,P,H/2)+", Ugięcie = "+getDeflection(L,X,P)+"\n\n");
    }
}
