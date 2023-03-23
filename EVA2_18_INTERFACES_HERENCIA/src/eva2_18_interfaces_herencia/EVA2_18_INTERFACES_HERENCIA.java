/*

 */
package eva2_18_interfaces_herencia;


public class EVA2_18_INTERFACES_HERENCIA {


    public static void main(String[] args) {
     
    }
    
}


interface intA{

public abstract void A();
    
}

interface intB {
    
void B(); //Implicitamente esta incluido public abstract    
    
}

interface intC extends intA, intB{
 
public abstract void C();    
    
}

class Prueba implements intC{

    @Override
    public void C() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void A() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void B() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}





