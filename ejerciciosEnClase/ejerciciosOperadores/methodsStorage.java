package ejerciciosEnClase.ejerciciosOperadores;

public class methodsStorage {
    
    public float one(float distancia, float tiempo) {
        return distancia/tiempo;
    }

    public float two(float a, float b, float c) {
        return (a+b+c)/2;
    }

    public float three() {
        return 4.5F+3.8F-2/4+(9%5);
    }

    public float four(float cen) {
        return (9.0F/5)*cen+32;
    }

    public int five(int a, int b) {
        return (int) (Math.pow(a,2) + Math.pow(b,3) + a*Math.pow(b,2));
    }

    public boolean six(int calif, byte grupo, int edad) {
        return (calif<70 || grupo==3 && edad>20) ? true:false;
    }

    public boolean seven(int a, int b, int c) {
        return (8.7F+6)/a != (b*9)/c ? true:false;
    }

    public boolean eight(int a, int b, int c) {
        return (a + 2*b > 0) ? true:false;
    }

    public boolean nine(int a, int b, int c) {
        return a-4*b<=c ? true:false;
    }

    public boolean ten(int a, int b, int c) {
        return a*b!=c ? true:false;
    }

    public boolean eleven(int a, int b, int c) {
        return (a<b && b>c) ? true:false;
    }

    public boolean twelve(int a, int b, int c) {
        return (a<b || a<c && !(c!=29.9F)) ? true:false ;
    }

    public boolean thirteen() {
        return ('Q' == 'q') ? true:false;
    }

    public int fourteen(int x, int y) {
        return (int) (3*Math.pow(x,2)+Math.pow((5*y),3));
    }
    
    public int fifthteen(int x, int y) {
        return (int) (Math.pow((3*x),2)+5*Math.pow(y,3));
    }

    public int sixteen(int x) {
        return x*(x-1)*(x-2)*(x-3);
    }

    public int seventeen() {
        return (10/3)+15%4;
    }

    public float eighteen(float precio) {
        return precio*(15/100);
    }

    public float nineteen(int a, int b, int c) {
        return a/(b/(c*2.1F))+(a*b)/c-(4/3);
    }

    public float twenty(int m, int n, int o, int p) {
        return (float) ((m*n)/((o*p)/Math.pow(m,2)*Math.pow(o,2))/(p/(o*n/3*m)));
    }
}
