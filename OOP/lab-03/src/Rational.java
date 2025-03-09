public class Rational {
    private int n, d;

    Rational(int num, int den){
        if (den == 0){
            throw new IllegalArgumentException("The denominator can't be equal to zero.");
        }
        int c = MyCommonMath.gcd(num, den);
        num /= c;
        den /= c;
        this.n = num;
        this.d = den;
    }
    Rational add (Rational other){
        int num = this.n * other.d + other.n * this.d;
        int den = this.d * other.d;
        return new Rational(num, den);
    }

    Rational subtract(Rational other){
        int num = this.n * other.d - other.n * this.d;
        int den = this.d * other.d;
        return new Rational(num, den);
    }

    Rational multiply(Rational other){
        int num = this.n * other.n;
        int den = this.d * other.d;
        return new Rational(num, den);
    }
    Rational divide(Rational other){
        int num = this.n * other.d;
        int den = this.d * other.n;
        return new Rational(num, den);
    }
    int compare(Rational other){
        int a = this.n * other.d;
        int b = other.n * this.d;
        if(a < b) return -1;
        if(a > b) return 1;
        return 0;
    }
    public String toString(){
        return this.n + "/" + this.d;
    }
    static Rational parseRational(String input){
        String[] l = input.split("/");
        int n, d;
        if (!(l.length==2)){
            throw new IllegalArgumentException("Can't parse '" + input +  "' as input.");
        }

        try{
            n = Integer.parseInt(l[0]);
            d = Integer.parseInt(l[1]);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Can't parse '" + input +  "' as input.");
        }
        return new Rational(n, d);
    }
}
