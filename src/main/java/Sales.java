public abstract class Sales extends Income{

    public Sales(String code,String name,double ammount,String form) {
        super(code,name,ammount,form);
    }

    public abstract String toExplain();

    public abstract String toString();


}
