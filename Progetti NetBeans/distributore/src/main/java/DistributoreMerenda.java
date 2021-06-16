public class DistributoreMerenda {
    
    private String tipo;
    public DistributoreMerenda(String cosa)
    {
        tipo = cosa;
    }
    
    public String merendaPresa(Panino<?> merenda)
    {
        return tipo + merenda.getContenuto();
    }
    
    public String merendaPresa(Focaccia<?> merenda)
    {
        return tipo + merenda.getContenuto();
    }
    
    public String merendaPresa(Acqua<?> merenda)
    {
        return tipo + merenda.getContenuto();
    }
    
    public String merendaPresa(Succo<?> merenda)
    {
        return tipo + merenda.getContenuto();
    }
}