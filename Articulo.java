
public class Articulo{
     
    int codart = 0;
    String art="";
    Cliente cliente1;
    
    Cliente getCliente1(){
        return cliente1;
    }
    
    void setCliente1(Cliente cliente1){
        this.cliente1 = cliente1;
    }
    
    
    int getCodart(){
        return codart;
    }
    String getArt(){
        return art;
    }
    void setCodart (int codart){
        this.codart = codart;
    }
    void setArt (String art){
        this.art = art ;
    }
}