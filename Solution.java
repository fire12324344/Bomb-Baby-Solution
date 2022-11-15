public class Solution {
    public static String solution(String x, String y) {
        BigInteger F = new BigInteger(x);
        BigInteger M = new BigInteger(y);
        BigInteger ite=new BigInteger("0");
    
        while(F.compareTo(BigInteger.ZERO)==1 && M.compareTo(BigInteger.ZERO)==1)
        {
            switch (F.compareTo(M)) {
                case -1: 
                    if (F.compareTo(BigInteger.ONE)==0) {
                        ite=ite.add(M);
                        ite=ite.subtract(BigInteger.ONE);
                        return ite.toString();
                    }
                    else {
                        ite=ite.add(M.divide(F));
                        M=(M.remainder(F));
                    }
                    break;
               case 1: 
                    if (M.compareTo(BigInteger.ONE)==0) {
                        ite=ite.add(F);
                        ite=ite.subtract(BigInteger.ONE);
                        return ite.toString();
                    }
                    else {
                        ite=ite.add(F.divide(M));
                        F=(F.remainder(M));
                    }
                    break;
               default:
                    if (F.compareTo(BigInteger.ONE)==0 && M.compareTo(BigInteger.ONE)==0) {
                        return ite.toString();
                    }
                    return "impossible";
            }
            System.out.println("|" + F.intValue() +  "|" + M.intValue() + "|" + ite.intValue());
        }
        return "impossible";
    }
}
