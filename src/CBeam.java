public abstract class CBeam implements ICalc{
    protected double L;
    protected double X;
    protected double P;
    protected static double E = 2.1*Math.pow(10, 5);

    public double getL() {
        return L;
    }

    public void setL(double l) {
        L = l;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getP() {
        return P;
    }

    public void setP(double p) {
        P = p;
    }
    abstract protected double moment();

    @Override
    public double getStress(double aL, double aX, double aP, double aY) {
        double M = (aP*aX*(aL-aX))/aL;
        double W = moment()/aY;
        double o = M/W;
        return o;
    }

    @Override
    public double getDeflection(double aL, double aX, double aP) {
        double rr;
        if(aX<=aL/2)
        {
            rr = aX;
        }
        else
        {
            rr = aL-aX;
        }
        double f = ((aP*rr)/(3*E*moment()*aL))*Math.pow(((Math.pow(aL,2)-Math.pow(rr,2))/3),3/2);
        return f;
    }
}
