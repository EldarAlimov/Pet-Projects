import java.math.BigInteger;

public class BigRational {
    private BigInteger n, d;

    BigRational(BigInteger num, BigInteger den){
        if (den.intValue() == 0){
            throw new IllegalArgumentException("The denominator can't be equal to zero.");
        }
        BigInteger c = num.gcd(den);
        num = num.divide(c);
        den = den.divide(c);
        this.n = num;
        this.d = den;
    }
    BigRational add  (BigRational other){
        BigInteger num = this.n.multiply( other.d).add(other.n.multiply(this.d));
        BigInteger den = this.d.multiply(other.d);
        return new BigRational(num, den);
    }

    BigRational subtract (BigRational other){
        BigInteger num = this.n.multiply(other.d).subtract(other.n.multiply(this.d));
        BigInteger den = this.d.multiply(other.d);
        return new BigRational(num, den);
    }

    BigRational multiply (BigRational other){
        BigInteger num = this.n.multiply(other.n);
        BigInteger den = this.d.multiply(other.d);
        return new BigRational(num, den);
    }
    BigRational divide (BigRational other){
        BigInteger num = this.n.multiply(other.d);
        BigInteger den = this.d.multiply(other.n);
        return new BigRational(num, den);
    }
    int compare (BigRational other){
        BigInteger a = this.n.multiply(other.d);
        BigInteger b = other.n.multiply(this.d);
        return a.compareTo(b);
    }
    public String toString(){
        return this.n + "/" + this.d;
    }
    static BigRational parseBigRational(String input){
        String[] l = input.split("/");
        BigInteger n, d;
        if (!(l.length==2)){
            throw new IllegalArgumentException("Can't parse '" + input +  "' as input.");
        }

        try{
            n = new BigInteger(l[0]);
            d = new BigInteger(l[1]);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Can't parse '" + input +  "' as input.");
        }
        return new BigRational(n, d);
    }
}
