class A {
    A() { System.out.println("Have a good day"); }

    protected void finalize() {  // method override as it is already defined in Object class
       System.out.println("Detroy"); }
}


class Garbage {

  public static void main ( String arg[] ) { 
    { A obj1 = new A();
      obj1 = null;
      obj1 = new A();
    }
     System.gc();  // call explicitly garbage collection algo

    {   A obj2 = new A();  }
     System.gc();

System.out.println("END");
  }
  
}