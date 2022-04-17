//public class CuentaClaseObject {
//    private String numero;
//    protected double saldo;
//
//    public CuentaClaseObject(String numero, double saldo)
//    {
//        this.numero=numero;
//        this.saldo=saldo;
//    }
//    public double getSaldo()
//    {
//        return saldo;
//    }
//    public String getNumero()
//    {
//        return numero;
//    }
//    public void extraer(double importe)
//    {
//        if (importe <=saldo )
//            saldo-=importe;
//    }
//    public void depositar(double importe)
//    {
//        saldo+=importe;
//    }
//
//    @Override
//    public int hashCode()
//    {
//        int hash=31;
//        hash=hash*numero.hashCode();
//        return hash;
//    }
//    @Override
//    public boolean equals(Object o)
//    {
//        if(o==null)
//            return false;
//        if (!(o instanceof Cuenta))
//            return false;
//        if(!(this.getClass() == o.getClass())){
//            return false;
//        }else{
//            Cuenta cuentaAux = (Cuenta)o;
//
//            if(this.getNumero().equals(cuentaAux.getNumero())){
//                return true;
//            }
//            return false;
//        }
//    }
//
//}
